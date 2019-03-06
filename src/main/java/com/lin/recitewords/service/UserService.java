package com.lin.recitewords.service;

import com.lin.recitewords.common.service.AbstractService;
import com.lin.recitewords.common.service.MailService;
import com.lin.recitewords.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService extends AbstractService<User> {
	@Autowired
	private MailService mailService;
	// 发送邮件
	public void sendMail(String to) {
		Random random = new Random();
		int code = random.nextInt(8999) + 1000;
		mailService.send(to, "您的验证码为" + code);
	}
}
