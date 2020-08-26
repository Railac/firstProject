package com.yedam.dong;

public class Example01 {
	public static void main(String[] args) {
		// 배열의 크기 3
		// 1~6까지의 임의의 숫자가 반복되지 않도록 배열에 저장해보세요.

		int[] intAry = new int[3];

		for (int i = 0; i < intAry.length; i++) {
			int random = (int) (Math.random() * 6) + 1;
			for (int j = 0; j < intAry.length; j++) {
				
				
				if (intAry[j] == random) {
					random = (int) (Math.random() * 6) + 1;
					
				} else {
					intAry[i] = random;
				}
			} // end for
		}

	}
}
