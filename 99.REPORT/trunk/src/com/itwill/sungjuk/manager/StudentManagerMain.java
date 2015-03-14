package com.itwill.sungjuk.manager;

public class StudentManagerMain {

	public static void main(String[] args) {
		StudentManager students = new StudentManager();
		//1.��ü�������(����)
		System.out.println("1.��ü�������(����)");
		Student.headerPrint();
		students.print();
		//2.����ü���
		System.out.println("2.����ü���" );
		double stuAveAll = students.getStuAveAll();
		System.out.println("����ü���" + stuAveAll);
		//3.�й�(�̸�,���,����)����ã�� ���
		System.out.println("-------------------------------------------" );
		System.out.println("3-1. �л� KANG ã�� ���" );
		Student[] studentsName = students.getStudentsName("KIM");
		Student.headerPrint();
		for (int i = 0; i < studentsName.length; i++) {
			studentsName[i].print();
		}
		System.out.println("3-2. ��� 74�� ã�� ���" );
		Student[] studentsAve = students.getStudentsAve((double)80.0);
		Student.headerPrint();
		for (int i = 0; i < studentsAve.length; i++) {
			studentsAve[i].print();
		}
		System.out.println("3-3. ���� C ã�� ��� ");
		Student[] studentsGrade = students.getStudentsGrade('C');
		Student.headerPrint();
		for (int i = 0; i < studentsGrade.length; i++) {
			studentsGrade[i].print();
		}
		
		//4.����(�й� 8234�����л��� ���� 0��ó�� )
		System.out.println("4.����(�й� 8234�����л��� ���� 0��ó�� )");
		Student studentNo = students.getStudentNo(8234,0,0,0);
		Student.headerPrint();
		studentNo.print();
		
		//5.�л���ü ���������� ����(��������)
		System.out.println("5.�л���ü ���������� ����(��������)");
		Student.headerPrint();
		students.rankChangePrint();
		

	}

}
