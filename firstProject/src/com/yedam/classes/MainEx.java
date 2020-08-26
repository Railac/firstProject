package com.yedam.classes;
final class FinalClass{ //final 붙이면 상속불가
	
}
//class ExtendClass extends FinalClass{
//	
//}
//
//class ExString extends String {
//	
//}
public class MainEx {
	final int age= 10;
	public static void main(String[] args) {
		Friend fr = new Friend();
		fr.getAge();
		
//		Calculator cal = new Calculator();
		Calculator.add(10,10);
		
		final int val = 10;
		//val = 20 ; //final은 값고정, 변경 불가
		MainEx ex = new MainEx();
		//ex.age= 20;
		
	}
	
}
