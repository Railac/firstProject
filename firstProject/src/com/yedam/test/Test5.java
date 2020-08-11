package com.yedam.test;

public class Test5 {
	public static void main(String[] args) {
		byte byteValue =10;
		char charValue = 'A';
		
//		int intValue = byteValue;//자동 형변환
//		int intValue = charValue; //자동 형변환
//		short shortValue = charValue; -- 오류 , 강제 형변환 필요
		double doublevalue = byteValue; //자동 형변환
	}
}
