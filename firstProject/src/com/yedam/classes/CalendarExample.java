package com.yedam.classes;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		

//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DATE));
//		
		cal.set(2020, 7, 1);

		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println("해당날짜 요일:" + cal.get(Calendar.DAY_OF_WEEK)); // 8월의 첫번째 날(무슨요일)
		System.out.println("날짜: " + cal.get(Calendar.DATE));

		createCalendar(2020, 7);
	}// end main

	public static void createCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		int j = 1;
		System.out.print("일" + '\t' + "월" + '\t' + "화" + '\t' + "수" + '\t' + "목" + '\t' + "금" + '\t' + "토" + '\n');
		for (int i = 1; i < ++j; i++) {// j= 2부터시작
			cal.set(year, month, i);
			if (cal.get(Calendar.MONTH) != month) {
				break;
			} // end 첫번째 if -- 입력한 월이 아닌값이 될때, 달이넘어갈때 for문 중지

			if (i == 1) { // i==1 일때 즉, 그달의 첫번째날의 시작점(요일)을 체크
				if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
					System.out.print(cal.get(Calendar.DATE) + "\t");
				} else if (cal.get(Calendar.DAY_OF_WEEK) == 2) {
					System.out.print("\t" + cal.get(Calendar.DATE) + "\t");
				} else if (cal.get(Calendar.DAY_OF_WEEK) == 3) {
					System.out.print("\t" + "\t" + cal.get(Calendar.DATE) + "\t");
				} else if (cal.get(Calendar.DAY_OF_WEEK) == 4) {
					System.out.print("\t" + "\t" + "\t" + cal.get(Calendar.DATE) + "\t");
				} else if (cal.get(Calendar.DAY_OF_WEEK) == 5) {
					System.out.print("\t" + "\t" + "\t" + "\t" + cal.get(Calendar.DATE)+ "\t");
				} else if (cal.get(Calendar.DAY_OF_WEEK) == 6) {
					System.out.print("\t" + "\t" + "\t" + "\t" + "\t" + cal.get(Calendar.DATE)+ "\t");
				} else {// 7일때
					System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + cal.get(Calendar.DATE)+ "\t");
				}
			} else { // i에 1이 아닌값이들어갈때, 2일부터~
				if (cal.get(Calendar.DAY_OF_WEEK) == 7) { //세번째 if
					System.out.println(cal.get(Calendar.DATE));
				} else {//토요일이 아닐떄
					System.out.print(cal.get(Calendar.DATE) + "\t");
				}// end 세번째 if

			} // end 두번째 if

		} // end for

	}// end main

}// end CalendarExample class
