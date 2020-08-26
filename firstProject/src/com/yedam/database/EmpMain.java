package com.yedam.database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain { //시작 지점 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		EmpServiceImp1 service = new EmpServiceImp1();
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int sno;
			try {
				sno = scn.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요!!!! ");
				String a = scn.nextLine();
				continue;
			}
			
			if(sno == 1) { //1. 리스트 출력
//				EmpDAO dao = new EmpDAO(); //객체 생성
				Employee[] emps = service.showList(); //EmpDAO 의 getEmplist 호출(db select 한 값, 배열을 리턴받음)
				//리턴 받은 값 
				for(Employee emp : emps) {
					if(emp !=null) {
						System.out.println(emp.toString());
					}
				}			
			}else if(sno ==2) { //2. 입력
//				EmpDAO dao = new EmpDAO();
//				dao.addEmployee(new Employee(333, "test","test","2020-05-05","IT_PROG"));
				System.out.println("추가할값을 입력하시오.");
				System.out.print("empid> ");
				int empid = scn.nextInt();	
				System.out.print("name> ");
				String name = scn.next();
				System.out.print("email> ");
				String email = scn.next();
				System.out.print("date> ");
				String date = scn.next();
				System.out.print("jobid> ");
				String jobid = scn.next();
				Employee emp = new Employee(empid, name, email, date, jobid);
				service.addEmp(emp);
				
			}else if(sno ==3) {//3. 수정
//				EmpDAO dao = new EmpDAO();
				System.out.println("원하는 사원의 월급을 수정하시오.");
				System.out.print("사원> ");
			    int empid= scn.nextInt();
			    System.out.print("월급> ");
			    int salary = scn.nextInt();
				Employee emp = new Employee();
				emp.setEmployeeId(empid);
				emp.setSalary(salary);
				service.modEmp(emp);
				
				
			}else if (sno ==4) {//4.삭제
//				EmpDAO dao = new EmpDAO();
				
				System.out.println("삭제할값을 입력하시오.");
				System.out.print("empid> ");
				int empid = scn.nextInt();
				service.delEmp(empid);
				
//				Employee emp = new Employee();
//				emp.setEmployeeId(empid);
//				dao.delEmployee(emp);
				
				
			}else if ( sno ==9) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		
	}
}
