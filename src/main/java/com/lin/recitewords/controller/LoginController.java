package com.lin.recitewords.controller;

import com.lin.recitewords.common.controller.BaseController;
import com.lin.recitewords.common.model.R;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends BaseController {

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		model.addObject("hello", "Hello Spring Boot");
		return model;
	}

	// 发送邮件接口
	@GetMapping("/sendMail")
	@ResponseBody
	@ApiOperation(value="发送邮件")
	@ApiImplicitParam(name="to", value="收件人", dataType="String")
	public R sendMail(String to) {
		userService.sendMail(to);
		return R.ok("邮件发送成功");
	}
}