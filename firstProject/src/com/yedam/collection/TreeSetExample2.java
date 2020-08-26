package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();

		set.add(new Person("Hong1", 10));
		set.add(new Person("Hong2", 14));
		set.add(new Person("Hong3", 12));
		set.add(new Person("Hong4", 11));

		Iterator<Person> iter = set.iterator();
		while (iter.hasNext()) { // hasNext 는 값이있나없나 확인하는거
			System.out.println(iter.next().name + ", " + iter.next().age); // next는 값을 하나씩 빼오는거임

		}
		System.out.println();

		SortedSet<Person> sSet = set.headSet(new Person("Sorted", 11)); //compareto 기준으로 바뀜, 
		sSet = set.tailSet(new Person("So", 12));
		sSet = set.subSet(new Person("Temp", 10), new Person("Temp2",13));//사이의 값 10 ~13
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}
		System.out.println();
		
		NavigableSet<Person> nSet = set.headSet(new Person("Sorted", 12), true); //12도 포함
		nSet = set.tailSet(new Person("Sorted", 12),  false);  //true , false 는 <-- 숫자값을 포함시키냐 안시키냐
		nSet = set.subSet(new Person("SSS",10), true, new Person("TTT", 12), true);
		for (Person person : nSet) {
			System.out.println(person.name + ", " + person.age);
		}
	}
}
