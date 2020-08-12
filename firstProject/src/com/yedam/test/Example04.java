package com.yedam.test;

public class Example04 {
	public static void main(String[] args) {
		int pencils =534;
		int students = 30;
		
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}
}
