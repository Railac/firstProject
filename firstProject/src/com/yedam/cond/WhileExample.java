package com.yedam.cond;

public class WhileExample {
	public static void main(String[] args) {
		// 1~10값의 합:
//		int i = 1;
//		int sum =0;
//		while(i<=10) {
//			sum = sum +i;	
//		}
//		System.out.println(sum);
		
		int i=1;
//		int j=2;
		
		while(i<=9) {
			int j=2;
			while(j<=9) {
				System.out.print(j+" * "+i+ "= "+j*i + '\t');
				j++; //j = j+1
			    
			}
			System.out.println();
			i++;
		}
		
		
	}
}
