package com.itwill.sungjuk.method;

public class Student {
	//�������(�Ӽ�)
	/*
	 no,�̸�,����,����,����,����,���,����
	 */
	private int stuNo;
	private String stuName;
	private int stuKor;
	private int stuEng;
	private int stuMath;
	private int stuScore;
	private double stuAve;
	private char stuGrade;
	//data setter
	
	public void setData(int stuNo , String stuName , int stuKor , int stuEng , int stuMath){
		this.stuNo=stuNo;
		this.stuName=stuName;
		this.stuKor=stuKor;
		this.stuEng=stuEng;
		this.stuMath=stuMath;
	}
	
	//����޽��
	//�������
	public void stuSum(){
		this.stuScore = this.stuKor + this.stuEng + this.stuMath;
	}
	
	//��հ��
	public void stuAveCalc(){
		this.stuAve = ((double)((int)(((double)stuScore/3)*100)))/100;
	}
	
	//�������
	public void stuGradeCalc(){
		this.stuGrade = ' ';
		if (this.stuAve >= 90){
			this.stuGrade = 'A';
		}else if (this.stuAve >= 80){
			this.stuGrade = 'B';
		}else if (this.stuAve >= 70){
			this.stuGrade = 'C';
		}else if (this.stuAve >= 60){
			this.stuGrade = 'D';
		}else{
			this.stuGrade = 'F';
		}
	}
	//header print
	public void headerPrint(){
		System.out.println("-------------------------------------------------------------");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("-------------------------------------------------------------");
	}
	//print
	public void print(){
		System.out.println(stuNo + "\t" + stuName + "\t" + stuKor + "\t" + stuEng + "\t" + stuMath + "\t" + stuScore + "\t" + stuAve + "\t" + stuGrade);
		System.out.println("-------------------------------------------------------------");
	}
	
	
	//get,set
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuKor() {
		return stuKor;
	}
	public void setStuKor(int stuKor) {
		this.stuKor = stuKor;
	}
	public int getStuEng() {
		return stuEng;
	}
	public void setStuEng(int stuEng) {
		this.stuEng = stuEng;
	}
	public int getStuMath() {
		return stuMath;
	}
	public void setStuMath(int stuMath) {
		this.stuMath = stuMath;
	}
	public int getStuScore() {
		return stuScore;
	}
	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}
	public double getStuAve() {
		return stuAve;
	}
	public void setStuAve(double stuAve) {
		this.stuAve = stuAve;
	}
	public char getStuGrade() {
		return stuGrade;
	}
	public void setStuGrade(char stuGrade) {
		this.stuGrade = stuGrade;
	}
	

}
