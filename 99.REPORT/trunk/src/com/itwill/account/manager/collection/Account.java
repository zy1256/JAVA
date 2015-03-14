package com.itwill.account.manager.collection;

public class Account {

	private String no;     //����
	private String owner;  //������
	private int balance;   //�ܰ�
	private float iyul;    //����
	
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
	
	//�Ա�
	public void ipGum(int m){
		this.balance = this.balance+m;
	}
	
	//���
	public void chulGum(int m){
		if(this.balance-m < 0){
			//�ܰ����
			System.out.println(">>�ܰ�����մϴ�.");
			return;
		}
		this.balance = this.balance-m;
		return;
	}
	
	//header���
	public void headerPrint(){
		System.out.println("------------------------------------");
		System.out.println("��ȣ\t�̸�\t�ܰ�\t����");
		System.out.println("------------------------------------");
	}
	
	//���
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
