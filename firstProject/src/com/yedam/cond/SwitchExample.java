package com.yedam.cond;

public class SwitchExample {
	public static void main(String[] args) {
		int m =(int)(Math.random()*6)+1 ;// 1<= randmo < 11 0~10사이의 난수 발생
		System.out.println(m);
		
		
		switch(m) {
		case 1:
			System.out.println("1번이 나왓습니다");
			break;
		case 2:
			System.out.println("2번이 나왓습니다");
			break;
		case 3:
			System.out.println("3번이 나왓습니다");
			break;
		case 4:
			System.out.println("4번이 나왓습니다");
			break;
		case 5:
			System.out.println("5번이 나왓습니다");
			break;
		case 6:
			System.out.println("6번이 나왓습니다");
			break;
		}
	}
}
