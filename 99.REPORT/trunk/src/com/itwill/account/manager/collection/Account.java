package com.itwill.account.manager.collection;

public class Account {

	private String no;     //계좌
	private String owner;  //계좌주
	private int balance;   //잔고
	private float iyul;    //이율
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String no, String owner, int balance, float iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	//AccountData Setter
	/*public void setData(String no, String owner, int balance, float iyul){
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}*/
	
	//입금
	public void ipGum(int m){
		this.balance = this.balance+m;
	}
	
	//출금
	public void chulGum(int m){
		if(this.balance-m < 0){
			//잔고부족
			System.out.println(">>잔고부족합니다.");
			return;
		}
		this.balance = this.balance-m;
		return;
	}
	
	//header출력
	public void headerPrint(){
		System.out.println("------------------------------------");
		System.out.println("번호\t이름\t잔고\t이율");
		System.out.println("------------------------------------");
	}
	
	//출력
	public void print(){
		System.out.println(no+"\t"+owner+"\t"+balance+"\t"+iyul);
		System.out.println("------------------------------------");
		
	}

	//setter,getter
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public float getIyul() {
		return iyul;
	}

	public void setIyul(float iyul) {
		this.iyul = iyul;
	}
	
	

}
