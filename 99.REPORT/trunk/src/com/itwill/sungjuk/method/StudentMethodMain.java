package com.itwill.sungjuk.method;

public class StudentMethodMain {

	public static void main(String[] args) {
		
		//切积按眉积己
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		//切积单捞鸥措涝
		s1.setData(4445, "全辨档", 90, 80, 70);
		s1.stuSum();
		s1.stuAveCalc();
		s1.stuGradeCalc();
		s2.setData(6652, "全", 95, 92, 91);
		s2.stuSum();
		s2.stuAveCalc();
		s2.stuGradeCalc();
		s3.setData(7823, "辫", 65, 66, 60);
		s3.stuSum();
		s3.stuAveCalc();
		s3.stuGradeCalc();
		
		
		//免仿
		s1.headerPrint();
		s1.print();
		s2.print();
		s3.print();
		
	}

}
