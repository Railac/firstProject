package com.yedam.classes;

class Calculator {
	double pi = 3.14;
	
	public static int add(int x, int y) {
		int sum =0;
		sum = x + y ;
		return sum;
	}
	
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public void getArea(double a) {
		double result = pi * a * a;
		System.out.println("반지름" + a + "의 넓이는 " + result);
	}


	public String getRectangle(int i, int j) {
		
		int result = i * j;
		
		return "가로 "+ i +" 세로 "+j+"의 넓이는 " +result +"입니다.";
	}
}
