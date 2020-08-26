package com.yedam.classes;

public class ComFriend extends Friend{ //회사친구

	private String comName;
	
	public ComFriend() {
		super(); //부모클래스 생성자부터 호출해서 부모객체부터 생성
	}
	
	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}


	@Override
	public String toString() {
		return "회사친구 이름: " + super.getName() + ", 연락처: " + super.getPhone() + ", 회사명: " + this.comName;
	}
	
	
}
