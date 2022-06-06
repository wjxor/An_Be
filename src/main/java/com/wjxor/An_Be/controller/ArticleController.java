package com.wjxor.An_Be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wjxor.An_Be.dto.Article;
import com.wjxor.An_Be.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/usr/article/getList")
	@ResponseBody
	public List<Article> getList() {
		List<Article> articles = articleService.getArticles();
		
		return articles;
	}
}
