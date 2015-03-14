package com.itwill.sungjuk.manager;

public class StudentManagerMain {

	public static void main(String[] args) {
		StudentManager students = new StudentManager();
		//1.전체성적계산(석차)
		System.out.println("1.전체성적계산(석차)");
		Student.headerPrint();
		students.print();
		//2.반전체평균
		System.out.println("2.반전체평균" );
		double stuAveAll = students.getStuAveAll();
		System.out.println("반전체평균" + stuAveAll);
		//3.학번(이름,평균,평점)으로찾아 출력
		System.out.println("-------------------------------------------" );
		System.out.println("3-1. 학생 KANG 찾아 출력" );
		Student[] studentsName = students.getStudentsName("KIM");
		Student.headerPrint();
		for (int i = 0; i < studentsName.length; i++) {
			studentsName[i].print();
		}
		System.out.println("3-2. 평균 74이 찾아 출력" );
		Student[] studentsAve = students.getStudentsAve((double)80.0);
		Student.headerPrint();
		for (int i = 0; i < studentsAve.length; i++) {
			studentsAve[i].print();
		}
		System.out.println("3-3. 평점 C 찾아 출력 ");
		Student[] studentsGrade = students.getStudentsGrade('C');
		Student.headerPrint();
		for (int i = 0; i < studentsGrade.length; i++) {
			studentsGrade[i].print();
		}
		
		//4.갱신(학번 8234번인학생의 성적 0점처리 )
		System.out.println("4.갱신(학번 8234번인학생의 성적 0점처리 )");
		Student studentNo = students.getStudentNo(8234,0,0,0);
		Student.headerPrint();
		studentNo.print();
		
		//5.학생객체 석차순으로 정렬(오름차순)
		System.out.println("5.학생객체 석차순으로 정렬(오름차순)");
		Student.headerPrint();
		students.rankChangePrint();
		

	}

}
