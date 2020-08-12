package com.yedam.test;

public class Example08 {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		// 0으로 나누거나 % 는 사용안됨
		System.out.println(z);
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result = z+ 10;
			System.out.println("결과: "+ result);
		}
	}
}
