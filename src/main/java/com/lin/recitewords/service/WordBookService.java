package com.lin.recitewords.service;

import com.lin.recitewords.common.service.AbstractService;
import com.lin.recitewords.mapper.WordBookMapper;
import com.lin.recitewords.model.WordBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordBookService extends AbstractService<WordBook> {
	@Autowired(required = false)
	private WordBookMapper wordBookMapper;

	// 按照用户id查找单词本
	private List<WordBook> findByUserId(Integer userId) {
		return wordBookMapper.findByUserId(userId);
	}
}
