package com.yedam.classes;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("이창호");
		p1.setAge(25);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person cjy = new Person();
		cjy.setName("최재영");
		cjy.setAge(25);
		
		Person ksm = new Person();
		ksm.setName("김상민");
		ksm.setAge(24);
		Person ksm2 = new Person();
		ksm2.setName("김상민");
		ksm2.setAge(26);
		System.out.println(ksm.getName().equals(ksm2.getName()));
		
		
//		Person[] pAry = {cjy, ksm, ksm2};
//		for(int i=0;i<pAry.length;i++) {
//			pAry[i].introduce();
//			System.out.println(pAry[i].introduce());
//		}
		
		Person anoy = new Person();
		System.out.println(anoy.introduce());
	}
}
