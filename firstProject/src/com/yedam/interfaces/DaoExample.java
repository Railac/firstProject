package com.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {
		DataAccessObject dao = new OracleDb();
		
		dao.select();
		dao.insert();
		dao.update();
	}
}
