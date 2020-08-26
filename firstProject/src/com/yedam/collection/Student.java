package com.yedam.collection;

public class Student implements Comparable<Student>{
	String name;
	int mathSum;
	int engSum;
	
	public Student(String name, int mathSum, int engSum) {
		this.name = name;
		this.mathSum = mathSum;
		this.engSum = engSum;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathSum() {
		return mathSum;
	}
	public void setMathSum(int mathSum) {
		this.mathSum = mathSum;
	}
	public int getEngSum() {
		return engSum;
	}
	public void setEngSum(int engSum) {
		this.engSum = engSum;
	}
	
	
	@Override
	public int compareTo(Student o) {
		
//		return this.mathSum -o.mathSum; //음수(오름차순), 양수(내림차순)
		if((this.mathSum + this.engSum)<(o.mathSum + o.engSum)) {
			return -1;
		}else {
			return 1;
		}
		
	}
	
	
	
	
	
	
}
