package com.yedam.lambda;

//함수적 인터페이스(functional Interface)
interface MyFunctionalInterface {
	public void run(); // 추상메소드(abstract method)
}

class MyFuncClass implements MyFunctionalInterface {

	@Override
	public void run() {
		System.out.println("runnnnnn.");

	}

}

public class LambdaExample {
	public static void main(String[] args) {
		MyFunctionalInterface myintf = () -> {// 람다식(구현해야될 메소드가 하나만있는경우)
			System.out.println("run..");
		}; // end new~
		myintf.run();

		ShowContent sc = (content) -> {
			System.out.println("내용은 " + content + " 입니다");
		};
		sc.show("바나나");
		
		ShowContent sc2 = content ->{
			System.out.println("This is "+ content );
		};
		sc2.show("바나나");
		
		Calculate cal = (a, b) -> a + b;
	
		System.out.println("결과:" +cal.sum(10, 5));
	}
}
