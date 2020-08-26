package com.yedam.test;
import java.util.*;

public class Friends {
	public static void main(String[] args) {
		boolean run = true;
		Address address = new Address();
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------주소 관리----------------");
			System.out.println("---------------------------------------");
			System.out.println("|1.정보입력 |2.리스트 조회 |3. 친구 검색 |9.종료 |");
			System.out.println("----------------------------------------");
			System.out.print("선택 > ");
			int input = scan.nextInt();
			
			if(input == 1) {
				address.infoInpu();
			}else if(input == 2) {
				address.show();
			}else if(input == 3) {
				address.search();
			}else if(input ==9){
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
			
			
			
			
		}
	}
}
