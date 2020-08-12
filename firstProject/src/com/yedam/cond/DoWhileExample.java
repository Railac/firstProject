package com.yedam.cond;

public class DoWhileExample {
	public static void main(String[] args) {
		int num = 10;
		do { //무조건 한번실행됨
			System.out.println("num " + num);
		}while(num>10); //false 일때 while종료
	}
}
