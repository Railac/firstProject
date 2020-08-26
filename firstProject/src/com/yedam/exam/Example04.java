package com.yedam.exam;

public class Example04 {
	public static void main(String[] args) {
		boolean run = true;
		int su;  
		int su1; 
		int sum;
			
		
		while(run) { //run값이 false가 될때까지 반복
			su = (int)(Math.random()*6) +1;
			su1 = (int)(Math.random()*6) +1;
			System.out.println("("+su+", "+su1+")");
			sum = su + su1;
			if(sum==5) {
				run=false;
				//break;
			}
		}
	}
}
