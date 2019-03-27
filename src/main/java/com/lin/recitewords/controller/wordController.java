package com.lin.recitewords.controller;

import com.lin.recitewords.common.controller.BaseController;
import com.lin.recitewords.model.WordBook;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(description = "单词模块")
@Controller
@RequestMapping("/word")
public class wordController extends BaseController {

	@ApiOperation(value = "进入单词页面", notes = "进入word/word.html")
	@ApiImplicitParam(name = "wordBookId", value = "单词本id", dataType = "Integer")
	@GetMapping
	public String index(Integer wordBookId, Model model) {
		WordBook wordBook = wordBookService.findWordByWordBookId(wordBookId);
		model.addAttribute("wordBook", wordBook);
		return "word/word";
	}
}