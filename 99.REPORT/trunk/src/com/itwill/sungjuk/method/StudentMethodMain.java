package com.itwill.sungjuk.method;

public class StudentMethodMain {

	public static void main(String[] args) {
		
		//�л���ü����
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		//�л�����Ÿ����
		s1.setData(4445, "ȫ�浵", 90, 80, 70);
		s1.stuSum();
		s1.stuAveCalc();
		s1.stuGradeCalc();
		s2.setData(6652, "ȫ", 95, 92, 91);
		s2.stuSum();
		s2.stuAveCalc();
		s2.stuGradeCalc();
		s3.setData(7823, "��", 65, 66, 60);
		s3.stuSum();
		s3.stuAveCalc();
		s3.stuGradeCalc();
		
		
		//���
		s1.headerPrint();
		s1.print();
		s2.print();
		s3.print();
		
	}

}
