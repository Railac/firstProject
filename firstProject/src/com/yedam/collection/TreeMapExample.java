package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "최재영");
		scores.put(new Integer(98), "최재영");
		scores.put(new Integer(75), "최재영");
		scores.put(new Integer(95), "최재영");
		scores.put(new Integer(80), "최재영");

		Map.Entry<Integer, String> entry = scores.firstEntry();
		System.out.println("점수: " + entry.getKey() + ", 이름: " + entry.getValue());
		System.out.println();

		Integer icnt = scores.firstKey();
		System.out.println("점수: " + icnt + ", 이름: " + scores.get(icnt)); // get(key값) -- key값에 해당하는 value값을 가져옴
		System.out.println();

		Map.Entry<Integer, String> pEntry = scores.pollFirstEntry();
		System.out.println("점수: " + pEntry.getKey() + ", 이름: " + pEntry.getValue()); //값을 빼온다?
	}

}
