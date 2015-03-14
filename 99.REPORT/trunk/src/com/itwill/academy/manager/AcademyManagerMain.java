package com.itwill.academy.manager;

public class AcademyManagerMain {

	public static void main(String[] args) {
		AcademyManager academyManager = new AcademyManagerImpl();
		

		System.out.println("-----------전체출력-------------");
		academyManager.addPerson(new Student(1,"KIM","JAVA"));
		academyManager.addPerson(new Staff(2,"LEE","MARKERTING"));
		academyManager.addPerson(new Gangsa(3,"CHOI","LINUX"));
		academyManager.addPerson(new Student(4,"SIN","JAVA"));
		academyManager.addPerson(new Student(5,"HONG","JAVA"));
		academyManager.addPerson(new Staff(6,"KIM","LINUX"));
		academyManager.addPerson(new Staff(7,"ANGEL","WINNT"));
		academyManager.addPerson(new Gangsa(8,"KEN","ORACLE"));
		academyManager.addPerson(new Gangsa(9,"MARK","LINUX"));
		academyManager.addPerson(new Student(10,"SAM","JAVA"));
		academyManager.addPerson(new Student(11,"WILL","JAVA"));
		academyManager.allPrint();
		System.out.println("-----------2번학생삭제----------");
		academyManager.deletePerson(2);
		//academyManager.allPrint();
		System.out.println("---1번 KANG LINUX로 변경----");
		Student studentDto=new Student(1,"KANG","LINUX");
		academyManager.updatePerson(studentDto);
		//academyManager.allPrint();

		System.out.println("---4번 LEE 원장으로 변경-----");
		Staff staffDto=new Staff(4,"LEE","원장");
		academyManager.updatePerson(staffDto);
		//academyManager.allPrint();
		System.out.println("--자바반 학생들--");
		Person[] personArray = academyManager.findByEtc(AcademyManager.BAN, "JAVA");
		for (int i = 0; i < personArray.length; i++) {
			personArray[i].print();
		}
		System.out.println("--리눅스반 강사--");
		personArray = academyManager.findByEtc(AcademyManager.SUBJECT, "LINUX");
		for (int i = 0; i < personArray.length; i++) {
			personArray[i].print();
		}
		System.out.println("--부서 - 원장--");
		personArray = academyManager.findByEtc(AcademyManager.DEPART, "원장");
		for (int i = 0; i < personArray.length; i++) {
			personArray[i].print();
		}
		

	}

}
