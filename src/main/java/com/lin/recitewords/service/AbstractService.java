package com.lin.recitewords.service;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public class AbstractService<T> {
	@Autowired
	private Mapper<T> mapper;

	public void add(T t) {
		mapper.insert(t);
	}

	public void deleteById(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	public void update(T t) {
		mapper.updateByPrimaryKeySelective(t);
	}

	public List<T> findAll() {
		return mapper.selectAll();
	}

	public T findById(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
}
