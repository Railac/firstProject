package com.yedam.board;

import java.sql.Connection;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		String id = null;

		while (run) {
			System.out.println("로그인하세요");
			System.out.print("ID> ");
			id = sc.next();
			System.out.print("PASSWORD> ");
			String pwd = sc.next();

			if (DBlogin.login(id, pwd)) {// 테이블에 해당 유저있는지 조회
				System.out.println("로그인 되었습니다.");
				
				while (run) {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("| 1.게시글 작성 | 2.게시글 수정 | 3.게시글 삭제 | 4.전체글 보기 | 5.상세보기 | 9.종료 |");
					System.out.println("---------------------------------------------------------------------");
					System.out.print("선택> ");
					int sno = sc.nextInt();

					if (sno == 1) { // 게시글 작성  --작성하는것도 db이용
						Board.input(id);
					} else if (sno == 2) {// 게시글 수정
						Board.update(id);
					} else if (sno == 3) {// 게시글 삭제
						Board.delete(id);
					} else if (sno == 4) {// 게시글 전체 리스트
						Board.show();
					} else if (sno == 5) {// 상세보기
						Board.details();

					} else if (sno == 9) { //종료하면 다시 로그인창
						System.out.println("프로그램을 종료합니다.");
						break;
					}
				} // end while
				
			}else {
				System.out.println("해당하는 유저가 없습니다.");
			}
		}//end while
	}
}
