package com.yeadm.abstracts;

public abstract class Animal {
	private String species;
	public Animal() {
		
	}
	
	public void showInfo() {
		System.out.println("분류는 " + species);
	}
	
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound(); //자식객체에서 무조건 재정의 해야함, 자식에서 반드시 가져야 하는 기능,필드 나 메소드 이름 통일목적
}
