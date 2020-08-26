package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void getInfo(Map<String, String> m) {
		System.out.println("이름: " +m.get("이름")); //get은 키값맞는걸 들고옴
		System.out.println("전공: " +m.get("전공"));
	}
	
	
	public static void getAge(Map<String, Integer> m ) {
		
		Set<String> keySet = m.keySet();
		for(String ky : keySet) {
			Integer value =m.get(ky);
			System.out.println("이름은 "+ ky + "이고 나이는 " + value+ "입니다.");
		}
		
	}
	
	
	
	public static void main(String[] args) {
//		Map<Integer, Member> map = new HashMap<>();
//		Map<String, String> map1 = new HashMap<>();
		Map<String, Integer> m = new HashMap<>();
		m.put("최재영", 20);
		m.put("김현동", 23);
		m.put("허성준", 26);
		getAge(m);

		
		
	//  map1.put("이름", "홍길동");
//		map1.put("전공", "역사학");
//		getInfo(map1);
		
//		map.put(11, new Member("김현동", 20));
//		map.put(12, new Member("박진규", 21)); 
//		map.put(13, new Member("오재훈", 22));
		
//		map.get(11);
//		
//		System.out.println(map.get(11).getName()+ ", "+map.get(11).getAge());
//		
//		Set<Integer> set = map.keySet();
//		for(Integer i : set) {
//			Member m = map.get(i);
//			System.out.println(m.getName()+", " + m.getAge());
//		}
//		
//		Set<Map.Entry<Integer, Member>> entSet = map.entrySet();
//		for(Map.Entry<Integer, Member> m : entSet) {
//			System.out.println(m.getKey()+ ", " + m.getValue().getName());
//		}
	}
}
