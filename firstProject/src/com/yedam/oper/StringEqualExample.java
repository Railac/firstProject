package com.yedam.oper;

public class StringEqualExample {
	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 30;
		if(v1 == v2) {
			System.out.println("기본타입 일 경우 비교..");
		}
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		if(str1 == str2) {
			System.out.println("str1, str2는 같은문자");
		}
		
		if(str1.equals(str3)) {
			System.out.println("str1, str3는 같은문자");
		}
		
		System.out.println((1==1)&&(2==2));
	}
}
