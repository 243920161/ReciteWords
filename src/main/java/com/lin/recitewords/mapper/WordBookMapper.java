package com.lin.recitewords.mapper;

import com.lin.recitewords.model.WordBook;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WordBookMapper extends Mapper<WordBook> {
	// 按用户id查找单词本
	List<WordBook> findByUserId(Integer userId);
}