package com.yedam.dev;

public class MorningCode13 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum = sum + i;
			System.out.println(i);
		}
		
		int score=90;
		if(score>=90) {
			if(score>=95) {
				System.out.println("95 이상입니다.");
			}else {
				System.out.println("90 이상입니다.");
			}
		}else if(score >= 80){
			System.out.println("80 이상입니다.");
		}else {
			System.out.println("80 미만입니다.");
		}
			
	}
}
