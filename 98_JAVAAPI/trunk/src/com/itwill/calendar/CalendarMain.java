package com.itwill.calendar;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;
		int date = ca.get(Calendar.DATE);
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int sec = ca.get(Calendar.SECOND);
		System.out.println("현재시간 : " + year + "년 " + month + "월 " + date + "일 " + hour + "시 " + min + "분 " + sec + "초");

	}

}
