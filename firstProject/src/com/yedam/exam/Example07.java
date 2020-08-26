package com.yedam.exam;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		boolean run =true;
		
		int balance = 0; //예금액
		int sum;

		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int input =scanner.nextInt();
			
			
			if(input ==1) {
				System.out.print("예금액> ");
				sum =scanner.nextInt();
				balance = balance + sum;		
			}else if(input==2) {
				System.out.print("출금액> ");
				sum = scanner.nextInt();
				balance = balance - sum;
			}else if(input==3) {
				System.out.print("잔고> "+ balance);	
				System.out.println();
			}else if(input==4) {
				run =false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
