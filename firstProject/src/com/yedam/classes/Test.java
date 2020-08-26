package com.yedam.classes;

public class Test {
	private int hak;
	private String name;
	private String major;

	public Test(int hak) {
		this.hak = hak;
	}

	public Test(int hak, String name) {
		this.hak = hak;
		this.name = name;

	}

	public Test(int hak, String name, String major) {
		this.hak = hak;
		this.name = name;
		this.major = major;
	}
	
	public int gethak() {
		return hak;
	}

	public int getHak() {
		return hak;
	}

	public void setHak(int hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getname() {
		return name;
	}

	public String getmajor() {
		return major;
	}

	public String profile() {

		return name + "의 학번은 " + hak + "이고 전공은 " + major + "입니다.";

	}

}
