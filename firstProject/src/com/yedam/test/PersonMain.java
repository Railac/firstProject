package com.yedam.test;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {
	public static void main(String[] args) {
		Set<Person> pSet = new HashSet<>();
		pSet.add(new Person("Hong1", 20));
		pSet.add(new Person("Hong2", 21));
		pSet.add(new Person("Hong3", 20));
		
		for(Person p : pSet) {
			System.out.println(p.name + ", "+ p.age);
		}

	}
}
