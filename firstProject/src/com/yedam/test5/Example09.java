package com.yedam.test5;

import java.util.*;

public class Example09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max =0;
		double avg =0;
		int sum =0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();
			// stu 학생수 , scores 각 학생마다 점수
			//
			if (selectNo == 1) {
				System.out.print("학생수 : ");
				studentNum = scanner.nextInt(); // 학생수 studentNum에 저장
			} else if (selectNo == 2) {
				scores = new int[studentNum]; // 크기가 3인 scores 배열
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]: "+ scores[i]);
				}

			} else if (selectNo == 4) {
				for (int i = 0; i < studentNum; i++) {// 0, 1
					if(max < scores[i]) {
						max = scores[i];
					}
					sum = sum + scores[i];
				}
				avg = sum/studentNum;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
