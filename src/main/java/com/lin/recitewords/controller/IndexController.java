package com.lin.recitewords.controller;

import com.lin.recitewords.common.controller.BaseController;
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
		model.addAttribute("wordBookList", wordBookService.findAll());
		model.addAttribute("wrongBookList", wrongBookService.findAll());
		return "index";
	}
}
