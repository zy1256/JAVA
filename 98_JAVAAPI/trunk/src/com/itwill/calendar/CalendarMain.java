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
		System.out.println("����ð� : " + year + "�� " + month + "�� " + date + "�� " + hour + "�� " + min + "�� " + sec + "��");

	}

}
