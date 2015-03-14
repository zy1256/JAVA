package com.itwill.sungjuk.manager;

public class StudentManager {

	Student[] students = {
			new Student(1234, "KIM", 90, 92, 96),
			new Student(2234, "PARK", 51, 62, 95),
			new Student(3234, "LEE", 85, 83, 84),
			new Student(4234, "WON", 78, 73, 90),
			new Student(5234, "KANG", 82, 70, 62),
			new Student(6234, "CHOI", 92, 89, 98),
			new Student(7234, "KIM", 92, 86, 91),
			new Student(8234, "MO", 72, 52, 99),
			new Student(9234, "KIM", 95, 52, 91),
			new Student(1359, "PARK", 80, 85, 10)
	};
	public void getResult(){
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
	}
	public void print(){
		getResult();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}
	public double getStuAveAll() {
		double stuAveAll = 0.00;
		for (int i = 0; i < students.length; i++) {
			stuAveAll += ( students[i].getStuAve() )/students.length;
		}
		stuAveAll = (double)((int)(((double)stuAveAll*100)+0.5))/100;
		return stuAveAll;
	}
	public Student[] getStudentsName(String name) {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStuName().equals(name)){
				count++;
			}
		}
		Student[] studentsName = new Student[count];
		int temp = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStuName().equals(name)){
				studentsName[temp] = students[i];
				temp++;
			}
		}
		return studentsName;
	}
	public Student[] getStudentsAve(double ave) {

		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStuAve() >= ave){
				count++;
			}
		}
		Student[] studentsAve = new Student[count];
		int temp = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStuAve() >= ave){
				studentsAve[temp] = students[i];
				temp++;
			}
		}
		return studentsAve;
	}
	public Student[] getStudentsGrade(char grade) {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStuGrade() == grade){
				count++;
			}
		}
		Student[] studentsGrade = new Student[count];
		int temp = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStuGrade() == grade){
				studentsGrade[temp] = students[i];
				temp++;
			}
		}
		return studentsGrade;
	}
	public Student getStudentNo(int no, int kor, int eng, int math) {
		Student tempNo = null;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStuNo()==no){
				students[i].setStuKor(kor);
				students[i].setStuEng(eng);
				students[i].setStuMath(math);
				tempNo = students[i];
			}
		}
		getResult();
		return tempNo;
	}
	public void rankChangePrint(){
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
