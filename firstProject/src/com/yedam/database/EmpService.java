package com.yedam.database;

public interface EmpService {
	
	//상수(static final)
	
	
	
	//추상 메소드
	public Employee[] showList();//전체 리스트
	public void addEmp(Employee emp);//입력처리
	public void modEmp(Employee emp);//수정처리
	public void delEmp(int empId);//삭제처리
	

}
