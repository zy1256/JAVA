package com.itwill.collection;

public class Car implements Comparable{
	
	private String no; //차량번호
	private int inTime; // 입차시간
	private int outTime; // 출차시간
	private int fee; //주차요금
	//시긴당 주차요금
	private static int moneyPerHour = 1000;
	
	
	public Car(){
		
	}
	public Car(String no, int inTime){
		this.no=no;
		this.inTime=inTime;
	}
	
	//입력
	public static void headerPrint(){
		System.out.println("------------------------------------");
		System.out.println("번호\t입차\t출차\t요금");
		System.out.println("------------------------------------");
	}
	//출력
	public void print(){
		//this : self 참조변수
		System.out.println(no + "\t" + inTime + "\t" + outTime + "\t" + fee);
		
	}
	public void carInPrint(){
		System.out.println(no + "\t" + inTime);
	}
	public void carOutPrint(){
		System.out.println(no + "\t" + inTime + "\t" + outTime + "\t" + fee);
	}
	
	//주차요금계산
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
