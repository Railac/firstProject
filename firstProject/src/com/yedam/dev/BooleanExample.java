package com.yedam.dev;

public class BooleanExample {
	public static void main(String[] args) {
		long l1 = 10L;
		int i1 = 10;
		
		boolean trueOrFalse = false;
		trueOrFalse = l1==i1;  // l1과 i1의 값이 같냐? 아니냐? 에서 true, false 값을 왼쪽으로 넘김
		
		if(trueOrFalse) {
			System.out.println("이 내용은 참일 경우에 출력됩니다.");
		}
		System.out.println(trueOrFalse);
	}
}
