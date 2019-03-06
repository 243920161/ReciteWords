package com.lin.recitewords.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired
	private JavaMailSender sender;

	public void send(String to, String content) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("243920161@qq.com");
		message.setTo(to);
		message.setSubject("背单词软件-邮箱验证");
		message.setText(content);
		sender.send(message);
	}
}