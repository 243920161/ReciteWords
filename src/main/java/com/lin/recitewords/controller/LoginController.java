package com.lin.recitewords.controller;

import com.lin.recitewords.common.controller.BaseController;
import com.lin.recitewords.common.model.R;
import com.lin.recitewords.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Api(description="登录模块")
public class LoginController extends BaseController {

	@GetMapping("/login")
	@ApiOperation(value="进入登录界面")
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
	@ApiImplicitParam(name = "to", value = "收件人", dataType = "String")
	public R sendMail(String to) {
		userService.sendMail(to);
		return R.ok("邮件发送成功");
	}

	// 注册
	@PostMapping("/register")
	@ResponseBody
	@ApiOperation(value="执行注册")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "username", value = "用户名", dataType = "String"),
		@ApiImplicitParam(name = "password", value = "密码", dataType = "String"),
		@ApiImplicitParam(name = "email", value = "邮箱", dataType = "String"),
		@ApiImplicitParam(name = "code", value = "验证码", dataType = "Integer")
	})
	public R register(User user, Integer code) throws Exception {
		userService.register(user, code);
		return R.ok("注册成功");
	}
}