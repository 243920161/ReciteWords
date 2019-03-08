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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;

@Api(description="登录模块")
@Controller
public class LoginController extends BaseController {

	@ApiOperation(value="进入登录界面", notes = "进入login.html")
	@GetMapping("/login")
	public String login() {
		return "/login";
	}

	@ApiOperation(value = "发送邮件", notes = "发送邮件时可能出现“邮箱已注册”")
	@ApiImplicitParam(name = "to", value = "收件人", dataType = "String")
	@GetMapping("/sendMail")
	@ResponseBody
	public R sendMail(String to) throws Exception {
		userService.sendMail(to);
		return R.ok("邮件发送成功");
	}

	@ApiOperation(value = "注册")
	@ApiImplicitParam(name = "code", value = "验证码", dataType = "Integer")
	@PostMapping("/register")
	@ResponseBody
	public R register(User user, Integer code) throws Exception {
		userService.register(user, code);
		return R.ok("注册成功");
	}

	@ApiOperation(value = "登录")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "usernameOrEmail", value = "用户名或邮箱"),
		@ApiImplicitParam(name = "password", value = "密码")
	})
	@PostMapping("/login")
	@ResponseBody
	public R login(String usernameOrEmail, String password) {
		User user = userService.login(usernameOrEmail, password);
		if (user == null) {
			return R.error("用户名或密码错误");
		}
		session.setAttribute("user", user);
		return R.ok("登录成功");
	}
}