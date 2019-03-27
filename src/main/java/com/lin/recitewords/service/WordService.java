package com.lin.recitewords.service;

import com.lin.recitewords.common.service.AbstractService;
import com.lin.recitewords.mapper.WordMapper;
import com.lin.recitewords.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService extends AbstractService<Word> {
	@Autowired(required = false)
	private WordMapper wordMapper;

	// 根据单词本id查找单词
	public List<Word> findByWordBookId(Integer wordBookId) {
		return wordMapper.findByWordBookId(wordBookId);
	}

	// 搜索单词
	public List<Word> searchWord(String word) {
		return wordMapper.searchWord(word);
	}
}
