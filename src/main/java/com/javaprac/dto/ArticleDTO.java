package com.javaprac.dto;

import java.sql.Timestamp;
import java.util.Date;

public class ArticleDTO {
	
	private int brd_id;
	private String writer;
	private String brd_title;
	private String brd_content;
	private Timestamp brd_create_date;
	private Timestamp brd_chg_date;
	private int brd_views;
	
	public int getBrd_id() {
		return brd_id;
	}
	public void setBrd_id(int brd_id) {
		this.brd_id = brd_id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getBrd_title() {
		return brd_title;
	}
	public void setBrd_title(String brd_title) {
		this.brd_title = brd_title;
	}
	public String getBrd_content() {
		return brd_content;
	}
	public void setBrd_content(String brd_content) {
		this.brd_content = brd_content;
	}
	public Timestamp getBrd_create_date() {
		return brd_create_date;
	}
	public void setBrd_create_date(Timestamp brd_create_date) {
		this.brd_create_date = brd_create_date;
	}
	public Timestamp getBrd_chg_date() {
		return brd_chg_date;
	}
	public void setBrd_chg_date(Timestamp brd_chg_date) {
		this.brd_chg_date = brd_chg_date;
	}
	public int getBrd_views() {
		return brd_views;
	}
	public void setBrd_views(int brd_views) {
		this.brd_views = brd_views;
	}


}
