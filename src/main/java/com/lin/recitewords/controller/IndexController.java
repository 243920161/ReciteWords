package com.lin.recitewords.controller;

import com.lin.recitewords.common.controller.BaseController;
import com.lin.recitewords.common.model.R;
import com.lin.recitewords.model.User;
import com.lin.recitewords.model.Word;
import com.lin.recitewords.model.WordBook;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(description = "主页")
@Controller
public class IndexController extends BaseController {

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

	@ApiOperation(value = "测试接口")
	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@ApiOperation(value = "测试数据")
	@GetMapping("/testData")
	@ResponseBody
	public Map testData() {
		Map<String, Object> map = new HashMap<>();
		List<WordBook> wordBookList = wordBookService.findAll();
		map.put("total", wordBookList.size());
		map.put("rows", wordBookList);
		return map;
	}

	@ApiOperation(value = "搜索单词")
	@ApiImplicitParam(name = "word", value = "单词", dataType = "String")
	@GetMapping("/searchWord")
	public String searchWord(String word, Model model) {
		List<Word> wordList = wordService.searchWord(word);
		model.addAttribute("wordList", wordList);
		return "index/search_result";
	}
}
