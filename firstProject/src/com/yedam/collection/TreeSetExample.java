package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));
		
		Integer t = tSet.first();
		t = tSet.last();
		t= tSet.floor(new Integer(87)); //기준값보다 같거나 작은값85기준으로해서 85보다 낮은값바로밑에꺼
		t = tSet.lower(new Integer(87));  //기준값보다 작은값만
		t = tSet.ceiling(new Integer(85)); // >= 크거나 같다
		t = tSet.higher(new Integer(85)); //> 큰거
		
		Iterator<Integer> dIter = tSet.descendingIterator(); //반복자
		while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		System.out.println();
		
		NavigableSet<Integer> nSet = tSet.descendingSet(); //set에담아서
		for(Integer icnt : nSet) {
			System.out.println(icnt);
		}
		System.out.println();
		//요소를 하났
		int size = tSet.size();
		for(int i =0; i< size; i++) {
			t = tSet.pollLast();
			System.out.println(t+ ", " + tSet.size());
		}
		
		
		Iterator<Integer> iter = tSet.iterator();
		while(iter.hasNext()) {
			Integer icnt = iter.next();
			System.out.println(icnt);
		}
		
		
	}
}
