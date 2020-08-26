package com.yedam.test;

import java.util.*;

public class Address {
	String name;
	int age;
	String phone;
	Scanner scan = new Scanner(System.in);
	int rownum =1;
	int cnt = 0;
	Address[] ad = new Address[100]; // 입력된 친구를 담을 배열생성, 클래스 타입

	public Address() {

	}

	public Address(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;

	}


	public void infoInpu() { // 1.정보입력

		System.out.print("이름> ");
		name = scan.next();
		System.out.print("나이> ");
		age = scan.nextInt();
		System.out.print("폰번호> ");
		phone = scan.next();
	
		ad[cnt] = new Address(name, age, phone); // 생성된 배열에 입력한 값 저장
		cnt++;
		
	}

	public void show() { //2.리스트 조회
		for(int i =0; i<cnt; i++) {//3개값들어가면, 0,1,2 3번 루프돔
			System.out.println(rownum + ". 이름:"+ad[i].name+" 나이:"+ad[i].age+" 폰번호:"+ad[i].phone);
			rownum++;
		}
		
	}

	public void search() {
		System.out.print("이름을 입력하세요> ");
		name = scan.next();
		
		for(int i=0; i<cnt;i++) {
			if(ad[i].name.equals(name)) {
				System.out.println("이름:"+ad[i].name+" 나이:"+ad[i].age+" 폰번호:"+ad[i].phone);
			}
		}
		
	}

}
