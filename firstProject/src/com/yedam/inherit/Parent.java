package com.yedam.inherit;

public class Parent extends Object{// 모든클래스는 object 라는 클래스를 상속하고있음, 디폴트값임
	private String name;
	private int age;
	
	public Parent() {}
	
	public Parent(String name, int age) {
		super(); //부모클래스의 생성자 호출
		this.name = name;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
//		return super.toString();
		return "Parent [name=" + name + ", age=" + age + "]";
	}
}
