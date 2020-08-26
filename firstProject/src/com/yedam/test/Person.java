package com.yedam.test;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return this.age; //객체 저장하기전에 메소드를 호출해서 해시코드 얻어냄, 이미저장되어있는 객체들의 해시코드와 비교한다
		//return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
//		return this.name.equals(p.name); //해시코드에서 동일한해쉬코드가있으면 equals로 비
		return this.age ==p.age;
//		return super.equals(obj);
	}
	
	
}
