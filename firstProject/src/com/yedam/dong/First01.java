package com.yedam.dong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class First01 {

	static Scanner sc = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>();

	public static void stuInput() {

		System.out.println("정보를 입력하세요");
		System.out.print("학생이름> ");
		String name = sc.next();
		System.out.print("수학점수> ");
		int mathScore = sc.nextInt();
		System.out.print("영어점수> ");
		int engScore = sc.nextInt();

		Student st = new Student(name, mathScore, engScore);

		list.add(st);
		System.out.println("정보가 저장되었습니다.");

	}

	public static void showAvg() {
		double MathSum = 0.0;
		double EngSum = 0.0;
		for (Student student : list) {
			MathSum = MathSum + student.getMathScore();
			EngSum = EngSum + student.getEngScore();
		}
		double MathAvg = Math.round(MathSum / list.size());
		double EngAvg = Math.round(EngSum / list.size());
		System.out.println("수학평균 > " + MathAvg);
		System.out.println("영어평균> " + EngAvg);

	}

	public void stuMathMax() {//수학 최고점자
		int max =0;
		String name = null ;
		
		for(int i=0;i<list.size();i++) {
			if(max <list.get(i).getMathScore()) {
				max = list.get(i).getMathScore();
			}else {
				max = max;
			}
		}//end for
		
		for(int j=0;j<list.size();j++) {
			if(max == list.get(j).getMathScore()) {
				name=list.get(j).getName();
				break;
			}
		}//end for
		
		System.out.println(name + "은 수학 최고점자이고 점수는 "+ max + "입니다.");
		
		
	}
	
}//end class