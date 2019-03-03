package com.javaprac.dao;

import com.javaprac.dto.ArticleDTO;

public interface ArticleRetvDao {

	public ArticleDTO ArticleRetv(int brdId);
	public void viewsUp(int brdId);
}
