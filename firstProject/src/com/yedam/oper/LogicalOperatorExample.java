package com.yedam.oper;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println(charCode);
		if (charCode >= 65 & charCode <= 90) {
			System.out.println("대문자입니다");
		}

		int num1 = 10;
		int num2 = 20;
		if (num1++ < 10 && num2++ > 20) {
			System.out.println("참입니다.");
		}
		System.out.println(num1 + ", " + num2);

//		int a = 10, b = 11;
//		int result = a&b;
//		System.out.println(result);

		int a = 10, b = 11;
		int result = a | b;
		System.out.println(result);

		result = a << 2; // 비트이동연산자
		System.out.println(result);

		result = 30 << 3;
		System.out.println(result);

		result += 30;

		result = 80;
		boolean pass = false;
		if (result >= 80) {
			pass = true;
		} else {
			pass = false;
		}

		pass = (result >= 80) ? true : false;
		// result>=80값이 true면 true출력, false면 false출력
	}
}
