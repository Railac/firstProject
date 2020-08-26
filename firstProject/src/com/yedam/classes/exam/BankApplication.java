package com.yedam.classes.exam;

import java.util.*;

public class BankApplication {
	private static Account01[] acArray = new Account01[100];
	private static Scanner sc = new Scanner(System.in);

	static int cnt = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("|1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 |");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int input = sc.nextInt();

			if (input == 1) { // 1.계좌생성
				createAccount();
			} else if (input == 2) { // 2.계좌목록
				accountList();
			} else if (input == 3) { // 3.예금
				deposit();
			}else if(input ==4) { // 4.출금
				withdraw();
			}else if(input ==5) { //5.종료
				System.out.println("프로그램 종료");
				run= false;
			}
		}
	}

	private static void createAccount() {// 1.계좌생성
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("계좌주: ");
		String owner = sc.next();
		System.out.print("초기입금액: ");
		int balnace = sc.nextInt();

		acArray[cnt] = new Account01(ano, owner, balnace);
		cnt++;
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	private static void accountList() {// 2.계좌목록
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		for (int i = 0; i < cnt; i++) {
			System.out.println(acArray[i].getAno() + "\t" + acArray[i].getOwner() + "\t" + acArray[i].getBalance());
		}
	}
	
	private static void deposit() {//3.예금하기
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		Account01 a=findAccount(sc.next());
		System.out.print("예금액: ");
		int balance = sc.nextInt();
		a.setBalance(a.getBalance()+balance);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	private static void withdraw() {//4.출금하기
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		Account01 b=findAccount(sc.next());
		System.out.print("출금액: ");
		int balance = sc.nextInt();
		b.setBalance(b.getBalance()-balance);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	
	private static Account01 findAccount(String ano) {//계좌번호 정보를 호출하는 메소드
		Account01 a01 = null;
		for(int i =0; i<cnt; i++) {
			if(acArray[i].getAno().equals(ano)) {
				 a01 = acArray[i];
				 break;
			}	 
			
		}
		return a01;	 //우리가 입력한값에 상관없이 for문이 한번도 실행 안될경우도 java는 계산하기때문에 return값은 for문밖에
	}
}
