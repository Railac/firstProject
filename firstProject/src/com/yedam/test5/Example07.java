package com.yedam.test5;

public class Example07 {
	public static void main(String[] args) {
		int max=0;
		int[] array = {1,5,3,8,2};
		
		for(int ary : array) {
			if(max < ary) {
				max = ary;
			}
		}
		
		System.out.println("max: " + max);
	}
}
