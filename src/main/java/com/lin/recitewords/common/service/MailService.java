package com.lin.recitewords.common.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class MailService {

	@Autowired
	private JavaMailSender sender;
	@Autowired
	private StringRedisTemplate template;
	private Logger log = Logger.getLogger(MailService.class);

	@Async
	public void send(String to, int code) {
		// 发送邮件
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("243920161@qq.com");
		message.setTo(to);
		message.setSubject("背单词软件-邮箱验证");
		message.setText("您的验证码为" + code + "，该验证码在30分钟有效，请及时使用");
		sender.send(message);
		// 保存到Redis
		template.opsForValue().set("r:" + to, String.valueOf(code));
		template.expire("r:" + to, 30, TimeUnit.MINUTES);
	}
}