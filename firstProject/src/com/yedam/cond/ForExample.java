package com.yedam.cond;

public class ForExample {
	public static void main(String[] args) {
//		int sum =0;
//		
//		for(int a=0;a<3;a++) {
//			sum = sum +1;
//		}
//		
//		for(int a=3; a>0; a--){
//			sum = sum + 1;
//		}
//		
//		System.out.println(sum);
//		
//		sum =0;
//		for(int i=1;i<=10;i++) {
//			sum=sum + i;
//			
//		}
//		System.out.println(sum);
//	}
		int i;
		int j;
		
		for(i=1;i<=9;i++) {
			for(j=2;j<=9;j++) {
				System.out.print(j+" * "+i+" = "+j*i +'\t');
			}
			System.out.println();
			
		}
	}	
}
