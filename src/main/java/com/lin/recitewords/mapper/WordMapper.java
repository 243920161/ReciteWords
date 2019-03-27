package com.lin.recitewords.mapper;

import com.lin.recitewords.model.Word;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WordMapper extends Mapper<Word> {
	// 根据单词本id查找单词
	List<Word> findByWordBookId(Integer wordBookId);
	// 搜索单词
	List<Word> searchWord(String word);
}