package com.yedam.exam;

import java.util.Scanner;

public class ExampleTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		int gap;
		int i;
		int tmp;
		
		for (i = 0; i < 3; i++) { //3번의 값을 입력받겠다
			System.out.print("값을 입력하세요 : ");
			gap = scanner.nextInt();     
			a[i]= gap;
			
//			if(a[i]<gap) { //gap값이 0보다크면    
//				a[i]= gap; //배열에 입력한값 저장
//				System.out.println(a[i]);
//				if(i!=0 && a[i]<a[i-1]){
//					tmp=a[i];
//				    a[i]=a[i-1];
//				    a[i-1]=tmp;
//				}else{
//					a[i]=a[i];
//				}
//			}//첫번째 if문 end	
		}//for문 종료
		System.out.println("i값"+i);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
//		System.out.println(a[3]);
		
			
	
		

//		int su = gap;

//		if(su > gap) {
//			
//		}

	}
}
