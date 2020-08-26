package com.yedam.dong;

public class Board { //게시판 구성요소
	//필드
	private String title;   //제목
	private String content; //내용
	
	//생성자
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	
	//메소드

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
	
	
	
}
