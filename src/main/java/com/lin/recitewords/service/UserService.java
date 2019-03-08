package com.lin.recitewords.service;

import com.lin.recitewords.common.service.AbstractService;
import com.lin.recitewords.common.service.MailService;
import com.lin.recitewords.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class UserService extends AbstractService<User> {
	@Autowired
	private MailService mailService;
	@Autowired
	private StringRedisTemplate template;

	// 发送邮件
	public void sendMail(final String to) {
		Random random = new Random();
		int code = random.nextInt(9000) + 1000;
		mailService.send(to, code);
	}

	// 执行注册
	public void register(User user, Integer code) throws Exception {
		String redisCode = template.opsForValue().get("r:" + user.getEmail());
		if (redisCode == null) {
			throw new Exception("验证码已失效或不存在");
		}
		if (code == null) {
			throw new Exception("请输入验证码");
		}
		if (!code.equals(Integer.valueOf(redisCode))) {
			throw new Exception("验证码错误");
		}
		user.setCreateTime(new Date());
		add(user);
	}
}
