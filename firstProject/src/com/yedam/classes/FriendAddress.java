package com.yedam.classes;

import java.util.Scanner;

public class FriendAddress {
		private static Scanner sc = new Scanner(System.in);//main실행되면 메모리에 올라가있음(static)
		static Friend[] friends = new Friend[100]; // 길이가 100인 배열 생성,
	public static void main(String[] args) { /// 실행 메소드
		

		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1.학교친구 2.회사친구 3.친구 4.리스트 9.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			int sno = sc.nextInt();

			if (sno == 1) {
				addUnivFriend();
			} else if (sno == 2) {
				addComFriend();
			} else if (sno == 3) {
				addFriend();
			} else if (sno == 4) {
				friendList();
			} else if (sno == 9) {
				break;
			}

		} // end while
		System.out.println("프로그램 종료.");

	}// end main
	
	//친구 리스트
	public static void friendList() {
		for(Friend friend : friends) {
			if(friend != null) {
			System.out.println(friend.toString());
			}else {
				break;
			}
		}//end for
			
	}// end friendList
	
	//친구 등록
	public static void addFriend() {
		System.out.println("그외친구등록.");
		System.out.print("이름입력: ");
		String name = sc.next();
		System.out.print("전화입력: ");
		String phone = sc.next();
		System.out.print("나이입력: ");
		int age = sc.nextInt();
		
		
		Friend friend = new Friend(); //친구 객체 생성
		friend.setName(name);
		friend.setPhone(phone);
		friend.setAge(age);
		
		
		
		for(int i=0;i<friends.length;i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}//end for
		System.out.println("일반친구 입력 완료");
	}
	//회사 친구 등록(static)
	public static void addComFriend() {
		System.out.println("회사친구등록.");
		System.out.print("이름입력: ");
		String name = sc.next();
		System.out.print("전화입력: ");
		String phone = sc.next();
		System.out.print("회사입력: ");
		String comName = sc.next();
		
		ComFriend friend = new ComFriend(); //학교 친구 객체 생성
		friend.setName(name);
		friend.setPhone(phone);
		friend.setComName(comName);
		
		for(int i=0;i<friends.length;i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}//end for
		System.out.println("회사친구 입력 완료");
	}
	//학교 친구 등록(static)
	public static void addUnivFriend() {
		System.out.println("학교친구등록.");
		System.out.print("이름입력: ");
		String name = sc.next();
		System.out.print("전화입력: ");
		String phone = sc.next();
		System.out.print("전공입력: ");
		String major = sc.next();
		
		UnivFriend friend = new UnivFriend(); //학교 친구 객체 생성
		friend.setName(name);
		friend.setPhone(phone);
		friend.setMajor(major);
		
		for(int i=0;i<friends.length;i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}//end for
		System.out.println("학교친구 입력 완료.");
	}
}// end class
