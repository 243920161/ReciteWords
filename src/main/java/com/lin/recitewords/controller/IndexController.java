package com.lin.recitewords.controller;

import com.lin.recitewords.common.controller.BaseController;
import com.lin.recitewords.common.model.R;
import com.lin.recitewords.model.User;
import com.lin.recitewords.model.WordBook;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(description = "主页")
@Controller
public class IndexController extends BaseController {
	@ApiOperation(value = "进入主页", notes = "进入index.html")
	@GetMapping("/index")
	public String index(Model model) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			model.addAttribute("wordBookList", wordBookService.findByUserId(user.getUserId()));
			model.addAttribute("wrongBookList", wrongBookService.findByUserId(user.getUserId()));
		}
		return "index";
	}

	@ApiOperation(value = "退出登录")
	@GetMapping("/logout")
	public String logout() {
		session.invalidate();
		return "redirect:/login";
	}

	@ApiOperation(value = "获取单词信息")
	@ApiImplicitParam(name = "wordBookId", value = "单词本id", dataType = "Integer")
	@GetMapping("/getWords")
	@ResponseBody
	public R getWords(Integer wordBookId) {
		WordBook wordBook = wordBookService.findWordByWordBookId(wordBookId);
		return R.ok("获取单词成功", wordBook);
	}
}
