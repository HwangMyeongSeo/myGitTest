package com.javaprac.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaprac.dao.BoardListDao;
import com.javaprac.dto.ArticleDTO;
import com.javaprac.service.BoardListService;

@Component
public class BoardListServiceImpl implements BoardListService{

	@Autowired
	private SqlSession ss;
	@Override
	public List<ArticleDTO> getBoardList() {
		// TODO Auto-generated method stub
		
		BoardListDao boardListDao = ss.getMapper(BoardListDao.class);
		//return ss.selectList("com.javaprac.dao.getBoardList");
		return boardListDao.getBoardList();
	}

}
