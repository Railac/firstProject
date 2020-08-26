package com.yedam.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;


public class TreeMapExample3 {
	public static void main(String[] args) {
		
	
		TreeMap<Student, String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");
		
		
		SortedMap<Student, String> sMap = tMap.headMap(new Student("Base", 80, 88));
		Set<Student> set = sMap.keySet();
		for(Student s : set) {
			System.out.println(s.getName()+ ", " + s.getMathSum());
		}
		System.out.println();
		
		NavigableMap<Student, String> hMap = tMap.headMap(new Student("Sort", 80, 88), true); //80점이하
		Set<Student> set1 =hMap.keySet();
		for(Student s : set1) {
			System.out.println(s.getName()+ "- "+s.getMathSum());
		};
		System.out.println();
		
		NavigableMap<Student, String> hMap1 = tMap.tailMap(new Student("Sort", 80, 88), true); //80이상
		Set<Student> set2 =hMap1.keySet();
		for(Student s : set2) {
			System.out.println(s.getName()+ "- "+s.getMathSum());
		};
		System.out.println();
		
//		NavigableMap<Student, String> hMap1 = tMap.tailMap(new Student("Sort", 80, 88), true); //80이상
//		Set<Entry<Student, String>> map = hMap1.entrySet();
//		for(Entry<Student, String> s : map) {
//			System.out.println(s.getKey().getName()+ "- "+s.getKey().getMathSum());
//		};            //////////////////////// 엔트리로 값받아오기
		
		NavigableMap<Student, String> hMap2 = tMap.subMap(new Student("Sort", 70, 88), true, new Student("Sort", 80, 88), true); //70에서 80사이
		Set<Student> set3 =hMap2.keySet();
		for(Student s : set3) {
			System.out.println(s.getName()+ "- "+s.getMathSum());
		};	
		
		
	}
}
