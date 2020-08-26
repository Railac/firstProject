package com.yedam.database;

public class EmpServiceImp1 implements EmpService{
	EmpDAO dao = new EmpDAO();
	
	@Override
	public Employee[] showList() {
		return dao.getEmpList();
	}

	@Override
	public void addEmp(Employee emp) {
		dao.addEmployee(emp);
		
	}

	@Override
	public void modEmp(Employee emp) {
		dao.upEmployee(emp);
	}

	@Override
	public void delEmp(int del) {
		dao.delEmployee(del);
		
	}
	
}
