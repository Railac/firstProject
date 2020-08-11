package com.yedam.test;

public class Test6 {
	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue =5.7;
		String strValue ="A";
		
		double var = (double) intValue; //강제 형변환 -- 자동형변환되기때문에 굳이안써도됨
		byte var1 = (byte) intValue; // 강제 형변환 필요
		int var2 = (int) doubleValue; //강제 형변환 필요
//		char var3 = (char)strValue; // 문자열은 char로 표현불가능 고로 오류
	}
}
