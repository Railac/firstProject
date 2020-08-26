package com.yedam.ref;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[][] iAry = {
				{10,20},
				{30,40,50},
				{60,30},
				{40}
		};
		
		for(int j=0; j<iAry.length; j++) {
			for(int i=0; i<iAry[j].length; i++) {
				System.out.println(iAry[j][i]+" ");
			}
			System.out.println();
		}
	}
}
