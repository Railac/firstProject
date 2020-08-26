package com.yedam.classes.exam;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password=password;
		
	}

	public String getId() {
		
		return id;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
