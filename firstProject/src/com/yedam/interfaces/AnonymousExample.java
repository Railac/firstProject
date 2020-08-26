package com.yedam.interfaces;

class Anonymous { // childAnonymous의 부모클래스

	// 메소드
	void run() {
		System.out.println("실행.");
	}
}// end Anonymousclass

interface AnonymInterface{
	void run();
}

public class AnonymousExample {
	public static void main(String[] args) {
		AnonymInterface anonymIntf = new AnonymInterface() {//인터페이스의 실체 객체

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("자식 구현 개체 실행.");
				
			}
			
		}; //end interface 객체
		
//		AnonymInterface anonymIntf= () -> {
//			System.out.println("자식 구현 객체 실행.");
//		};
//		anonymIntf.run();
		
		Anonymous anonym = new Anonymous() {// Anonymous 타입을 가진다. Anonymous 객체 생성후 바로 호출
			
			String str;
			
			@Override
			void run() {
				System.out.println("자식 실행");
			}
			
		};//end Anonym 객체
		anonym.run();

	} //end main
}
