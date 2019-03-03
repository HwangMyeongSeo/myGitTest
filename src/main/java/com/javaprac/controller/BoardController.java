package com.javaprac.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaprac.dao.ArticleDeleteDao;
import com.javaprac.dto.ArticleDTO;
import com.javaprac.service.ArticleDeleteService;
import com.javaprac.service.ArticleRegService;
import com.javaprac.service.ArticleRetvService;
import com.javaprac.service.BoardListService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	

	
	@Autowired
	BoardListService boardListService;
	@Autowired
	ArticleRetvService articleRetvService;
	@Autowired
	ArticleRegService articleRegService;
	@Autowired
	ArticleDeleteService articleDeleteService;

	
	@RequestMapping(value = "/boardListView", method = RequestMethod.GET)
	public String boardlist(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		List<ArticleDTO> list = boardListService.getBoardList();
		
		model.addAttribute("list", list );
		
		return "boardListView";
	}
	
	@RequestMapping(value = "/ArticleView", method = RequestMethod.GET)
	public String articleview(@RequestParam("brdId") int brdId,Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ArticleDTO articleDTO = articleRetvService.ArticleRetv(brdId);
		articleRetvService.viewsup(brdId);
		model.addAttribute("article", articleDTO );
		
		return "ArticleView";
	}
	@RequestMapping(value = "/Article_Reg_View", method = RequestMethod.GET)
	public String articlRegeView(Locale locale, Model model) {

		
		return "Article_Reg_View";
	}
	@RequestMapping(value = "/Article_Reg", method = RequestMethod.POST)
	public String articleReg(ArticleDTO articleDTO ,Locale locale, Model model) {
		
		articleRegService.articleReg(articleDTO);
		List<ArticleDTO> list = boardListService.getBoardList();
		
		model.addAttribute("list", list );
		
		return "redirect:boardListView";
	}
	@RequestMapping(value = "/Article_delete", method = RequestMethod.POST)
	public String articleDelete(ArticleDTO articleDTO ,Locale locale, Model model) {
		
		
		articleDeleteService.articleDelete(articleDTO);
		List<ArticleDTO> list = boardListService.getBoardList();
		
		model.addAttribute("list", list );
		
		return "redirect:boardListView";
	}
	
	@RequestMapping("/loginForm")
	public String loginForm(Locale locale, Model model) {
		
		
		return "/login/loginForm";
	}
	
	
	
}
