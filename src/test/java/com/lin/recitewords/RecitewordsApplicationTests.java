package com.lin.recitewords;

import com.lin.recitewords.common.service.MailService;
import com.lin.recitewords.model.User;
import com.lin.recitewords.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecitewordsApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		userService.sendMail("243920161@qq.com");
	}

}
