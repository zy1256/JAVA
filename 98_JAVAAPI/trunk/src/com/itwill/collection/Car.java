package com.itwill.collection;

public class Car implements Comparable{
	
	private String no; //������ȣ
	private int inTime; // �����ð�
	private int outTime; // �����ð�
	private int fee; //�������
	//�ñ�� �������
	private static int moneyPerHour = 1000;
	
	
	public Car(){
		
	}
	public Car(String no, int inTime){
		this.no=no;
		this.inTime=inTime;
	}
	
	//�Է�
	public static void headerPrint(){
		System.out.println("------------------------------------");
		System.out.println("��ȣ\t����\t����\t���");
		System.out.println("------------------------------------");
	}
	//���
	public void print(){
		//this : self ��������
		System.out.println(no + "\t" + inTime + "\t" + outTime + "\t" + fee);
		
	}
	public void carInPrint(){
		System.out.println(no + "\t" + inTime);
	}
	public void carOutPrint(){
		System.out.println(no + "\t" + inTime + "\t" + outTime + "\t" + fee);
	}
	
	//������ݰ��
	public void calculateFee(){
		this.fee=(this.outTime-this.inTime)*Car.moneyPerHour;
	}
	
	//getter,setter

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
