package com.itwill.sungjuk.field;

public class StudentMain {

	public static void main(String[] args) {
		
		//학생객체생성
		Student s1 = new Student();
		Student s2 = new Student();
		
		//학생데이타대입
		s1.stuNo = 222;
		s1.stuName = "길";
		s1.stuKor = 80;
		s1.stuEng = 76;
		s1.stuMath = 95;
		
		s2.stuNo = 654;
		s2.stuName = "홍";
		s2.stuKor = 85;
		s2.stuEng = 40;
		s2.stuMath = 72;
		
		//총점,평균,평점계산후 대입
		
		s1.stuScore = s1.stuKor + s1.stuEng + s1.stuMath;
		s1.stuAve = (s1.stuScore)/3;
		s1.stuGrade = ' ';
		if (s1.stuAve >= 90){
			s1.stuGrade = 'A';
		}else if (s1.stuAve >= 80){
			s1.stuGrade = 'B';
		}else if (s1.stuAve >= 70){
			s1.stuGrade = 'C';
		}else if (s1.stuAve >= 60){
			s1.stuGrade = 'D';
		}else{
			s1.stuGrade = 'F';
		}

		s2.stuScore = s2.stuKor + s2.stuEng + s2.stuMath;
		s2.stuAve = (s2.stuScore)/3;
		s2.stuGrade = ' ';
		if (s2.stuAve >= 90){
			s2.stuGrade = 'A';
		}else if (s2.stuAve >= 80){
			s2.stuGrade = 'B';
		}else if (s2.stuAve >= 70){
			s2.stuGrade = 'C';
		}else if (s2.stuAve >= 60){
			s2.stuGrade = 'D';
		}else{
			s2.stuGrade = 'F';
		}
		
		//출력
		System.out.println("1--------------------");
		System.out.println("학생번호 : " + s1.stuNo);
		System.out.println("학생이름 : " + s1.stuName);
		System.out.println("국어점수 : " + s1.stuKor);
		System.out.println("영어점수 : " + s1.stuEng);
		System.out.println("수학점수 : " + s1.stuMath);
		System.out.println("총점     : " + s1.stuScore);
		System.out.println("평균점수 : " + s1.stuAve);
		System.out.println("평점     : " + s1.stuGrade);

		System.out.println("2---------------------");
		System.out.println("학생번호 : " + s2.stuNo);
		System.out.println("학생이름 : " + s2.stuName);
		System.out.println("국어점수 : " + s2.stuKor);
		System.out.println("영어점수 : " + s2.stuEng);
		System.out.println("수학점수 : " + s2.stuMath);
		System.out.println("총점     : " + s2.stuScore);
		System.out.println("평균점수 : " + s2.stuAve);
		System.out.println("평점     : " + s2.stuGrade);

		
	}

}
