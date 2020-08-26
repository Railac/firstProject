package com.yedam.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>();
		long startTime = System.nanoTime();
		for(int i=0; i<30000; i++) {
			aList.add(0, new Integer(i));
		}
		long endTime =  System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime));
		
		
		
		List<Integer> aList1 = new LinkedList<>();
		long startTime1 = System.nanoTime();
		for(int i=0; i<30000; i++) {
			aList1.add(0, new Integer(i));
		}
		long endTime1 =  System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime1 - startTime1));
	}
}
