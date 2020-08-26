package com.yedam.collection;

public class Member {
	private String name;
	private int age;
	private String major;

	public Member(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
//	public Member(String name, String major) {
//		
//		this.name = name;
//		this.major = major;
//	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	//hashcode, equals 활용, 논리적으로 동일한 객체
	//hashcode랑 equals 리턴값이 동일하면 중복값제거함(set에서)
	@Override
	public int hashCode() {
		
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		
		return this.name.equals(mem.name);
	}

	
	
}
