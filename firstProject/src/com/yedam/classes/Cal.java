package com.yedam.classes;

public class Cal {

	private int r;
	private double p1 = 3.14;

	public double getArea() {
		double result = r * p1;
		return result;
	}
	
	public int getRadius() {
		return r;
	}
	
	public void setRadius(int r) {
		if(r<0) {
			r=0;
		}else {
			this.r = r;
		}
	}

}
