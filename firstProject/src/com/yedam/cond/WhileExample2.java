package com.yedam.cond;

public class WhileExample2 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int keyCode = 0;
		int num = 10;
		while (run) {
			
			if (keyCode != 13 & keyCode != 10) {
				System.out.print("키를 누르세요.: ");
			}
				keyCode = System.in.read(); // 키보드입력값숫자로 읽어옴
				System.out.println(keyCode);
			if (keyCode == 57) {
				run = false;
			} // end if

//			System.out.println("num: "+ num);
//			if(num-- ==0) {//num = num -1
//				run = false;//break;

		} // end while

		System.out.println("프로그램 종료");
	}// end main
}// end class
