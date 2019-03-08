package com.lin.recitewords.controller;

import com.lin.recitewords.common.controller.BaseController;
import com.lin.recitewords.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Api(description = "主页")
@Controller
public class IndexController extends BaseController {
	@ApiOperation(value = "进入主页", notes = "进入index.html")
	@GetMapping("/index")
	public String index(Model model) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			model.addAttribute("wordBookList", wordBookService.findById(user.getUserId()));
			model.addAttribute("wrongBookList", wrongBookService.findById(user.getUserId()));
		}
		return "index";
	}
}
