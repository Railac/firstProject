package com.yedam.ref;

public class MorningCode {
	public static void main(String[] args) {
//		double[] dAry = new double[5];// 길이가 5인 배열생성
//		dAry[0] = 1.2; // 첫번째 자리에 1.2값 저장
//		for(int j=0;j<5;j++) {//5번 루프,
//			System.out.println(dAry[j]);
//		}
	
		int[][] iAry = new int[5][5]; //행 5, 열 5 인 배열
		int num1 =1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				iAry[i][j] = num1++;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", iAry[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", iAry[j][i]);
			}
			System.out.println();
		}
	}
}
