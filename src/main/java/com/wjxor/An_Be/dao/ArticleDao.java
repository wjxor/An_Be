package com.wjxor.An_Be.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wjxor.An_Be.dto.Article;

@Mapper
public interface ArticleDao {
	
	List<Article> getArticles();

	Article getArticle(@Param("id") int id);

	List<Article> getArticles(Map<String, Object> param);
	
}
