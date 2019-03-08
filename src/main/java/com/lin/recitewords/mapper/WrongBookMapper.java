package com.lin.recitewords.mapper;

import com.lin.recitewords.model.WrongBook;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WrongBookMapper extends Mapper<WrongBook> {
	// 按照用户id查找错题本
	List<WrongBook> findByUserId(Integer userId);
}