package com.yedam.dong;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
//		String subject="자바 프로그래밍";
//		char charValue = subject.charAt(3);
//		System.out.println(charValue);
//		subX("990205-1234567");
//		subX("010205/3234567");
//		subX("980205*2234567");
		subX("0102054834567");
		boolean run = true;
		while (run) {
			Scanner sc = new Scanner(System.in);
			System.out.print("주민번호를 입력하세요> ");
			String id = sc.next();
			subX(id);
//			if(id.length()==14) {
//				subX(id);
//			}else {
//				System.out.println("형식이 다릅니다.");
//				System.out.println("다시 입력하세요.");
//				continue;
//			}
		}
	}

	public static void subX(String id) {
		String subStr=id.substring(6);
		String newStr;
		System.out.println(subStr.length());
		if(subStr.length()!=8) {
			newStr = subStr.replace(subStr, " "+subStr);
			System.out.println(newStr);		
		}else {
			newStr = subStr;
		}
		char Value = newStr.charAt(1);

		if (Value == '1' || Value == '3') {
			System.out.println(id + "는 남자입니다.");
		}
		if (Value == '2' || Value == '4') {
			System.out.println(id + "는 여자입니다.");
		}
		
		
	}
}
