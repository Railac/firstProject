package com.yedam.oper;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1; //~는 반전연산자
		System.out.println(v1);
		System.out.println(v2+1);
		
		byte b1 = 10;
		byte b2 = 5;
		int b3 = b1 % b2;
		
		double result = 10 /4.0;
		System.out.println(result);
	}
}
