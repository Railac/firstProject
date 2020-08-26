package com.yedam.classes;

import java.util.Scanner;

public class Text01 {
	// 필드(이름,나이,전화번호)
	String name;
	int age;
	String phone;
	int sum = 0;

	Scanner scanner = new Scanner(System.in);
	Text01[] register = new Text01[100]; // 길이 100인 배열생성
	
	//생성자
	public Text01() {

	}

	// 생성자
	public Text01(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	//정보입력 메소드
	public void input() {
		System.out.print("이름> ");
		name = scanner.next();
		System.out.print("나이> ");
		age = scanner.nextInt();
		System.out.print("전화번호> ");
		phone = scanner.next();

		register[sum] = new Text01(name, age, phone);
		sum++;

	}
	
	//이름조회
	public void search() {
		System.out.print("이름검색> ");
		name = scanner.next();
		
		for (int i = 0; i < sum; i++) {
			Text01 tx = register[i];
			if (name.equals(tx.name)) {
				register[i].showView();
			} else {
				System.out.println("없는 이름입니다.");
			}
		}
	}
	
	//조회한 이름의 정보 보기
	public void showView() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("전화번호: " + phone);
	}

	

}
