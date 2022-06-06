package com.wjxor.An_Be.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjxor.An_Be.dao.ArticleDao;
import com.wjxor.An_Be.dto.Article;

@Service
public class ArticleService {
	@Autowired
	private ArticleDao articleDao;

	public List<Article> getArticles() {
		return articleDao.getArticles();
	}

	public Article getArticle(int id) {
		
		
		return articleDao.getArticle(id);
	}

}
 