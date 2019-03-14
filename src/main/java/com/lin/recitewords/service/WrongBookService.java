package com.lin.recitewords.service;

import com.lin.recitewords.common.service.AbstractService;
import com.lin.recitewords.mapper.WrongBookMapper;
import com.lin.recitewords.model.WrongBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WrongBookService extends AbstractService<WrongBook> {
	@Autowired(required = false)
	private WrongBookMapper wrongBookMapper;
	public List<WrongBook> findByUserId(Integer userId) {
		return wrongBookMapper.findByUserId(userId);
	}
}
