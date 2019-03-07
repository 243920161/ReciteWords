package com.lin.recitewords;

import org.springframework.scheduling.annotation.EnableAsync;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAsync
@SpringBootApplication
@MapperScan("com.lin.recitewords.mapper")
public class RecitewordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecitewordsApplication.class, args);
	}

}
