package com.yedam.oper;

public class OverflowExample {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE - (-10));
		System.out.println(Integer.MAX_VALUE);
		int result = safeAdd(-2147483648, -10); // -2147483648 +(-10)
		System.out.println(result);
	}
	
	
	
	public static int safeAdd(int a, int b) { //int타입의 매개변수 2개를받는
		int sum =0;                           //리턴타입이 int인 safe메소드	
		if (Integer.MAX_VALUE - b < a) { //if (a:6 < b:5 ){~}x
			
			System.out.println("유효값이 아닙니다.");
			sum = 0;
//		}else if(Integer.MIN_VALUE -b > a) { 
//			System.out.println("유효값이 아닙니다.");
		}else {
			sum = a + b;
		}
		return sum;
		
	}
}
