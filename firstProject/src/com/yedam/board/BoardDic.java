package com.yedam.board;

public class BoardDic {
	private int bno;
	private String title;
	private String content;
	private String name;
	
	
	public BoardDic(int bno, String title, String content, String name) {
		
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.name = name;
	}


	public int getBno() {
		return bno;
	}


	public void setBno(int bno) {
		this.bno = bno;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
