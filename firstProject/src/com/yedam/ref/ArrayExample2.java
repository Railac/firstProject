package com.yedam.ref;

public class ArrayExample2 {
	public static void main(String[] args) {
		
	}
	public static int addAry(int[] ary) {
		int sum =0;
		for(int i=0;i<ary.length;i++) {
			sum += ary[i];
		}
		return sum;
	}
}
