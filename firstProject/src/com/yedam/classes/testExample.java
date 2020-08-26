package com.yedam.classes;

public class testExample {
	public static void main(String[] args) {
		Test test = new Test(111, "홍길동", "역사"); // 객체 생성
//		test.gethak();
//		test.getname();
//		test.getmajor();
		Test test1 = new Test(222, "김유신", "말타기"); // 객체 생성
//		test1.gethak();
//		test1.getname();
//		test1.getmajor();
		Test test2 = new Test(333, "김유신", "역사");
		Test test3 = new Test(444, "김호구", "말타기");

		String name = "김유신";
		String major = "역사";

		Test[] studAry = { test, test1, test2, test3 }; // 길이가 인 배열

		for (int i = 0; i < studAry.length; i++) {

//			if (studAry[i].getname().equals(name)) {
//				System.out.println(studAry[i].profile());
//			}
			if (studAry[i].getmajor().equals(major)) {
				System.out.println(studAry[i].profile());
			}

		}

	}
}
