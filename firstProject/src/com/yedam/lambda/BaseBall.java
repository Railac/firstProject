package com.yedam.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList();
		int Magu[] = new int[3]; // 사용자가 던진볼
		int j = 0;
		boolean run = true;

		for (int i = 0; i < ++j; i++) {// start for1

			if (list.size() != 3) {// start if1, 배열의 길이가 3이아닐떄
				int random = (int) (Math.random() * 9) + 1;
				if (list.isEmpty()) { // 배열에 값이 없을경우 , 값을 넣어라
					list.add(random);
				} else { // 배열에 값이 1개라도 있을경우에, 중복검사
					if (!list.contains(random)) {// 동일값이 없을경우 list에 값추가
						list.add(random);
					} else {// 동일값이 있을경우 다시 루프
						continue;
					}
				}
			} else {// 배열의 길이가 3이되면 종료
				System.out.println(list);
				break;
			} // end if1

		} // end for1
		
		while (run) { //start while
			int strike = 0;
			int ball = 0;
			for (int i = 0; i < Magu.length; i++) {
				System.out.println("볼 떤져라");
				int ballshot = sc.nextInt();

				Magu[i] = ballshot;// 내가입력한값
				
			}
			System.out.println("["+Magu[0]+" ," +Magu[1]+" ,"+Magu[2]+"]");
			for (int i = 0; i < Magu.length; i++) {// start for2
				for (int a = 0; a < Magu.length; a++) {// start for3

					if (Magu[i] == list.get(a) && i == a) { // start if A
						strike++;
					} else if (Magu[i] == list.get(a)) {
						ball++;
					} // end if A

				} // end for3
			} // end for2
			System.out.println(ball + " 볼");
			System.out.println(strike + " 스트라이크");
			if (strike == 3) {
				
				System.out.println("프로그램 종료");
				run = false;
			}
		}//end while

	}// end main method
}// end class
