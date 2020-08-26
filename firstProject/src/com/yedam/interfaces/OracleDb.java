package com.yedam.interfaces;

public class OracleDb implements DataAccessObject{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("오라클 DB 조회.");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("오라클 DB 입력.");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("오라클 DB 수정.");
		
	}

}
