package com.lin.recitewords;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lin.recitewords.mapper")
public class RecitewordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecitewordsApplication.class, args);
	}

}
