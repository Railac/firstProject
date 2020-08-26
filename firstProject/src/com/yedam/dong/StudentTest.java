package com.yedam.dong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		boolean run = true;
		First01 first = new First01();
		Scanner sc = new Scanner(System.in);
		
		
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("| 1.학생점수입력 | 2.과목평균 | 3.수학최고점자 | 9.종료 |");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			int sno = sc.nextInt();
			
			
			if(sno ==1) {
				first.stuInput();
			}else if (sno ==2) {
				first.showAvg();
			}else if (sno ==3) {
				first.stuMathMax();
			}else if(sno ==9) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
				
			}
		}
	}

	
}
