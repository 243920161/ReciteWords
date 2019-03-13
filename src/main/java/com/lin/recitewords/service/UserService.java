package com.lin.recitewords.service;

import com.lin.recitewords.common.service.AbstractService;
import com.lin.recitewords.common.service.MailService;
import com.lin.recitewords.mapper.UserMapper;
import com.lin.recitewords.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class UserService extends AbstractService<User> {
	@Autowired
	private MailService mailService;
	@Autowired
	private StringRedisTemplate template;
	@Autowired(required = false)
	private UserMapper userMapper;

	// 发送邮件
	public void sendMail(final String to) throws Exception {
		if (userMapper.findCountByEmail(to) != 0) {
			throw new Exception("邮箱已注册");
		}
		Random random = new Random();
		int code = random.nextInt(9000) + 1000;
		mailService.send(to, code);
	}

	// 执行注册
	public void register(User user, Integer code) throws Exception {
		String redisCode = template.opsForValue().get("r:" + user.getEmail());
		if (userMapper.findCountByUsername(user.getUsername()) != 0) {
			throw new Exception("用户名已存在");
		}
		if (userMapper.findCountByEmail(user.getEmail()) != 0) {
			throw new Exception("邮箱已注册");
		}
		if (code == null) {
			throw new Exception("请输入验证码");
		}
		if (redisCode == null) {
			throw new Exception("无效验证码");
		}
		if (!code.equals(Integer.valueOf(redisCode))) {
			throw new Exception("验证码错误");
		}
		template.expire("r:" + user.getEmail(), 0, TimeUnit.MINUTES);
		user.setCreateTime(new Date());
		add(user);
	}

	// 执行登录
	public User login(String usernameOrEmail, String password) {
		Map<String, String> userMap = new HashMap<>();
		userMap.put("usernameOrEmail", usernameOrEmail);
		userMap.put("password", password);
		return userMapper.login(userMap);
	}
}
