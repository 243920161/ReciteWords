package com.lin.recitewords.mapper;

import com.lin.recitewords.model.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.Map;

public interface UserMapper extends Mapper<User> {
	// 按用户名查找数量
	Integer findCountByUsername(String username);
	// 按邮箱查找数量
	Integer findCountByEmail(String email);
	// 登录
	User login(Map<String, String> userMap);
}