package com.javaprac.serviceImpl;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaprac.dao.ArticleRegDao;
import com.javaprac.dto.ArticleDTO;
import com.javaprac.service.ArticleRegService;

@Component
public class ArticleRegServiceImpl implements ArticleRegService{
	
	@Autowired
	private SqlSession ss;

	@Override
	public void articleReg(ArticleDTO articleDTO) {
		
		ArticleRegDao articleRegDao =  ss.getMapper(ArticleRegDao.class);
		
		articleRegDao.articleReg(articleDTO);
		
	}

}
