package com.lin.recitewords;

import com.lin.recitewords.common.service.MailService;
import com.lin.recitewords.model.User;
import com.lin.recitewords.model.WordBook;
import com.lin.recitewords.service.UserService;
import com.lin.recitewords.service.WordBookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecitewordsApplicationTests {
	@Autowired
	private UserService userService;
	@Autowired
	private WordBookService wordBookService;
	@Autowired
	private StringRedisTemplate template;
	@Test
	public void contextLoads() {
		/*for (int i = 1; i <= 10; i++) {
			WordBook book = new WordBook();
			book.setName("单词本" + i);
			book.setRemark("这是单词本" + i + "的备注");
			book.setCreateTime(new Date());
			book.setUserId(1);
			wordBookService.add(book);
		}*/
	}

}
