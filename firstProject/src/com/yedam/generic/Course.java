package com.yedam.generic;

public class Course<T> {
	private String sourseName;
	private T[] students;
	
	public Course(String courseName, int capacity) {
		this.sourseName = courseName;
		this.students = (T[]) new Object[capacity];
	}

	public String getSourseName() {
		return sourseName;
	}

	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i]==null) {
				students[i] = t;
				break;
			}
		}
	}
	
}
