package com.lin.recitewords.common.controller;

import com.lin.recitewords.common.model.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionController {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public R exception(Exception e) {
		return R.error(e.toString());
	}
}
