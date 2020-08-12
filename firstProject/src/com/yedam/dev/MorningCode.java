package com.yedam.dev;

public class MorningCode {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String name = "이창호";
		System.out.println(str1 + "," + str2);
		
		int v1 = 150, v2 = 270;
		int result = add(v1, v2);
		System.out.println(result);
		
		introduce("못생김");
		
		result = minus(v1, v2);
		System.out.println(result);
	}
	public static int minus(int x, int y) {
		int ms = x - y;
		return ms;
	}
	
	public static void introduce(String name) {
		System.out.println("안녕하세요. "+name);
	}
	
	public static int add(int x, int y) {
		int sum = x + y;
		return sum;
		
	}
}
