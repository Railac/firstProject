package com.yedam.classes;

import java.util.Scanner;

public class TextExample01 {
	public static void main(String[] args) {
		Text01 text = new Text01();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		while (run) {

			System.out.println("--------------------------------");
			System.out.println("친구 주소 관리 ");
			System.out.println("1.정보입력 | 2.리스트 | 9.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			int input = scanner.nextInt();

			if (input == 1) {
				text.input();

			} else if (input == 2) {
				text.search();
			} else if (input == 9) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}
	}
}
