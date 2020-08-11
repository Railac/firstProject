package com.yedam.test;

public class Test8 {
	public static void main(String[] args) {
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
//		byte result = byteValue + byteValue; 
		//연산의 결과값은 int타입 , 받는 변수의 타입이 byte라서 오류, 형변환하던지, 받는변수의 타입을 int로 바꿔준다.
		int result1 = 5 + byteValue;
		float result2 =  5 + floatValue;
		double result3 = 5 + doubleValue;
	}
}
