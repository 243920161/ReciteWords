package com.lin.recitewords.common.controller;

import com.lin.recitewords.common.service.MailService;
import com.lin.recitewords.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public abstract class BaseController {
	@Autowired
	protected ExamDetailService examDetailService;
	@Autowired
	protected ExamService examService;
	@Autowired
	protected LoginLogService loginLogService;
	@Autowired
	protected UserService userService;
	@Autowired
	protected WordBookService wordBookService;
	@Autowired
	protected WordService wordService;
	@Autowired
	protected WrongBookService wrongBookService;
	@Autowired
	protected WrongService wrongService;

	@Autowired
	protected HttpSession session;
	@Autowired
	protected MailService mailService;
}