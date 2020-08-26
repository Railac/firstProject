package com.yedam.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String str = "Hello";

		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("Null 값을 참조하고 있습니다.");
		} catch (Exception e1) {
			System.out.println("알 수 없는 예외가 발생했습니다.");
		}

		int[] intAry = new int[5];
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("i의 값: " + intAry[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다.");

			}

		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		try {
			int menu = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.print("숫자를 다시 입력하세요: ");
			String a= sc.next();
			int put = sc.nextInt();
			
			
		}
		System.out.println("정상종료.");
		
	}

}
