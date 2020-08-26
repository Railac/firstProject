package com.yedam.ref;

public class ArrayExample {
	public static void main(String[] args) {
		int score1 = 10, score2 = 20, score3 = 30, score4=40;
		int sum = score1 + score2 + score3 + score4;
		
		int[] intAry = {10, 20, 30, 40};
		sum = intAry[0] + intAry[1] + intAry[2] + intAry[3];
		
		for(int i=0;i<intAry.length;i++) {
			
			System.out.println(intAry[i]);
			sum = sum + intAry[i];
		}
		System.out.println("sum : " +sum);
		
		
		String[] sAry = {"hello", "world", "nice", "good"};
		for(int i=0;i<sAry.length;i++) {
			System.out.println(sAry[i]);
		}
		
//		double[] scoreAry = new double[5]; //객체생성, 0값저장됨
//		for(int i=0;i<scoreAry.length;i++) { 
//			System.out.println(scoreAry[i]);
//		}
		
		String[] scoreAry = new String[5];
		scoreAry[0] = "one";
		scoreAry[1] = "two";
		scoreAry[2] = "three";
		for(int i=0;i<scoreAry.length;i++) {
			System.out.println(scoreAry[i]);
		}
		
		int[] mathAry;
		mathAry = new int[] {1,2,3,4};
		
		
	}
}
