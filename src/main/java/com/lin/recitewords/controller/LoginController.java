package com.lin.recitewords.controller;

import com.lin.recitewords.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}