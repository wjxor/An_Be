package com.wjxor.An_Be.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wjxor.An_Be.dto.Article;

@Mapper
public interface ArticleDao {
	
	List<Article> getArticles();
	
}
