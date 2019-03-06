package com.lin.recitewords.common.controller;

import com.lin.recitewords.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public abstract class BaseController {
	@Autowired
	private ExamDetailService examDetailService;
	@Autowired
	private ExamService examService;
	@Autowired
	private LoginLogService loginLogService;
	@Autowired
	private UserService userService;
	@Autowired
	private WordBookService wordBookService;
	@Autowired
	private WordService wordService;
	@Autowired
	private WrongBookService wrongBookService;
	@Autowired
	private WrongService wrongService;

	@Autowired
	private HttpSession session;
}