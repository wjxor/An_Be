package com.wjxor.An_Be.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wjxor.An_Be.dto.Article;
import com.wjxor.An_Be.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/usr/article/getArticles")
	@ResponseBody
	public List<Article> getArticles(@RequestParam Map<String, Object> param) {
		if (param.get("limit") != null) {
			int limit = Integer.parseInt((String) param.get("limit"));
			param.put("limit", limit);
			param.put("limitFrom", 0);
		}
		
		if (param.get("page") != null) {
			int page = Integer.parseInt((String) param.get("page"));
			int limit = 10;
			int limitFrom = (page - 1) * limit;
			param.put("limit", limit);
			param.put("limitFrom", limitFrom);
		}
		
		List<Article> articles = articleService.getArticles(param);
		
		return articles;
	}
	
	@RequestMapping("/usr/article/getArticle")
	@ResponseBody
	public Article getArticle(int id) {
		Article article = articleService.getArticle(id);
		
		return article;
	}
}
