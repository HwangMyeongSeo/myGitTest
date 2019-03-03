package com.javaprac.serviceImpl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaprac.dao.ArticleRetvDao;
import com.javaprac.dto.ArticleDTO;
import com.javaprac.service.ArticleRetvService;

@Component
public class ArticleRetvServiceImpl implements ArticleRetvService {
	
	@Autowired
	private SqlSession ss;

	@Override
	public ArticleDTO ArticleRetv(int brdId) {
		// TODO Auto-generated method stub
		ArticleRetvDao articleRetvDao = ss.getMapper(ArticleRetvDao.class);
		return articleRetvDao.ArticleRetv(brdId);
	}

	@Override
	public void viewsup(int brdId) {
		// TODO Auto-generated method stub
		ArticleRetvDao articleRetvDao = ss.getMapper(ArticleRetvDao.class);
		articleRetvDao.viewsUp(brdId);
		
	}

}
