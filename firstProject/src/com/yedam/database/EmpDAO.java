package com.yedam.database;

import java.sql.*;

public class EmpDAO {
	//수정
	public void upEmployee(Employee emp) {
		Connection conn = DBConnection.getConnection();
		String sql = "update emp_temp"+"\n"
				+"set salary =" + emp.getSalary() //바꿀 값 ~
				+" where employee_id="+emp.getEmployeeId(); //바꿀 사원 ~
		
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 수정되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//삭제
	public void delEmployee(int del) {//int del or Employee emp
		Connection conn = DBConnection.getConnection();
		String sql = "delete from emp_temp" +"\n"
				+ " where employee_id = "+del;
		
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 삭제되었습니다..");
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
	//입력
	public void addEmployee(Employee emp) {//Employee 타입의 emp 값을 매개변수로 받는다
		Connection conn = DBConnection.getConnection(); //static 사용해서 객체생성없이 호출 //conn에 DB정보담음
		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id)"
				+ " values("+emp.getEmployeeId()+",\'"+emp.getLastName()+"\',\'"+emp.getEmail()+
				"\',\'"+emp.getHireDate()+"\',\'"+emp.getJobId()+"\')";
		
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 입력되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	
	//조회
	public Employee[] getEmpList() {
		
		Connection conn = DBConnection.getConnection(); //static 사용해서 객체생성없이 호출
		Employee[] employees = new Employee[100];
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * "+"\n"+"from emp_temp");
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				String firstName = rs.getString("first_name");
				emp.setFirstName(firstName);
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
			
				
				
				
				employees[idx++] = emp;
			}
			
			System.out.println("-- end of data --");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return employees;
	}
	
}
