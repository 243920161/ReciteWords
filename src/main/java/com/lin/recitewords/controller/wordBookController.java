package com.lin.recitewords.controller;

import com.lin.recitewords.common.controller.BaseController;
import com.lin.recitewords.model.User;
import com.lin.recitewords.model.WordBook;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(description = "单词本模块")
@Controller
@RequestMapping("/wordBook")
public class wordBookController extends BaseController {

	@ApiOperation(value = "进入单词本页面", notes = "进入word_book/word_book.html")
	@GetMapping
	public String index(Model model) {
		User user = (User) session.getAttribute("user");
		if (user != null) {
			List<WordBook> wordBookList = wordBookService.findByUserId(user.getUserId());
			model.addAttribute("wordBookList", wordBookList);
			model.addAttribute("wordBookCount", wordBookList.size());
		}
		return "word_book/word_book";
	}
}
