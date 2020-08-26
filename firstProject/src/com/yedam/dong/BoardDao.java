package com.yedam.dong;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("어린왕자", "재미없다"));
		list.add(new Board("톨스토이", "재미없다2"));
		list.add(new Board("슬램덩크", "재미있다"));
		
		int size = list.size();//총객체수
		System.out.println("총 객체수: " + size);
		
			
		return list;
	}

}
