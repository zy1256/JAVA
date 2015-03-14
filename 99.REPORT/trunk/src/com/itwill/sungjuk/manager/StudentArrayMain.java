package com.itwill.sungjuk.manager;

public class StudentArrayMain {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student(1234, "KIM", 90, 92, 96),
				new Student(2234, "PARK", 50, 62, 95),
				new Student(3234, "LEE", 85, 83, 84),
				new Student(4234, "WON", 78, 72, 90),
				new Student(5234, "KANG", 82, 70, 62),
				new Student(6234, "CHOI", 92, 89, 98),
				new Student(7234, "HAN", 92, 85, 90),
				new Student(8234, "MO", 72, 52, 99),
				new Student(9234, "SUN", 95, 32, 34),
				new Student(0234, "PARK", 80, 85, 10)
		};
		
		//1.��ü�������(����)
		System.out.println("1.��ü�������(����)");
		students[0].headerPrint();
		double stuAveAll = 0;
		for (int i = 0; i < students.length; i++) {
			students[i].stuCalAll();
		}
		for (int j = 0; j < students.length; j++) {
			int ranking = 1;
			for (int k = 0; k < students.length; k++) {
				if(students[j].getStuScore() < students[k].getStuScore()){
					ranking += 1;
				}
			}
			students[j].setStuRank(ranking);
		}
		for (int i = 0; i < students.length; i++) {
			stuAveAll += (students[i].getStuAve())/students.length;
			System.out.println(students[i].getStuNo() + "\t" + students[i].getStuName() + "\t" + students[i].getStuKor() + "\t" + students[i].getStuEng() + "\t" + students[i].getStuMath() + "\t" + students[i].getStuScore() + "\t" + students[i].getStuAve() + "\t" + students[i].getStuGrade() + "\t" + students[i].getStuRank());
			System.out.println("-------------------------------------------------------------");
		}
		
		
		//2.����ü���
		System.out.println("2.����ü���");
		System.out.println(((double)((int)(((double)stuAveAll)*100)))/100);

		//3.�й�(�̸�,���,����)���� ã�� ���
		System.out.println("3.�й�(�̸�,���,����)���� ã�� ���");
		System.out.println("3.1 �̸�");
		students[0].headerPrint();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStuName().equals("PARK")){
				students[i].print();
			}
		}
		System.out.println("3.2 ���");
		students[0].headerPrint();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStuAve()>90){
				students[i].print();
			}
		}
		System.out.println("3.3 ����");
		students[0].headerPrint();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStuGrade()=='C'){
				students[i].print();
			}
		}
		
		//4.����(�й� 2���� �л��� ���� 0��ó��) 
		System.out.println("4.����(�й� 2���� �л��� ���� 0��ó��) ");
		students[0].headerPrint();
		students[1].print();
		students[1].setStuEng(0);
		students[1].setStuKor(0);
		students[1].setStuMath(0);
		students[1].stuCalAll();
		students[1].print();
		
		//5.�л���ü ���������� ����(��������)
		System.out.println("5.�л���ü ���������� ����(��������) ");
		
		students[0].headerPrint();
		for (int i = 0; i < students.length; i++) {
			for (int j = i; j < students.length; j++) {
				if (students[j].getStuScore() < students[i].getStuScore()) {
					Student mid = students[i];
					students[i] = students[j];
					students[j] = mid;
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		 

	}

}
