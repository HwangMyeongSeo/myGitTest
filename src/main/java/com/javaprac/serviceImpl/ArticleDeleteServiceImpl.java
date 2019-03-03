package com.javaprac.serviceImpl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaprac.dao.ArticleDeleteDao;
import com.javaprac.dto.ArticleDTO;
import com.javaprac.service.ArticleDeleteService;

@Service
public class ArticleDeleteServiceImpl implements ArticleDeleteService {

	@Autowired
	SqlSession ss;
	@Override
	public void articleDelete(ArticleDTO articleDTO) {
		// TODO Auto-generated method stub
		ArticleDeleteDao articleDeleteDao = ss.getMapper(ArticleDeleteDao.class);
		articleDeleteDao.articleDelete(articleDTO);
		

	}

}
