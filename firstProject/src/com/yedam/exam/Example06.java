package com.yedam.exam;

public class Example06 {
	public static void main(String[] args) {
		int i;
		int j;
		for(i=0;i<5;i++) {// 총 5번의 루프
			for(j=0;j<5;j++) {
				if(i==j) {
					System.out.println("*");
					break;
				}else {
					System.out.print("*");
				}
			}
			
		}
	}
}
