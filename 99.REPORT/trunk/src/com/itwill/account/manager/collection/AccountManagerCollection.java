package com.itwill.account.manager.collection;
/*
 *Account 객체들을 관리하는객체 
 */
public class AccountManagerCollection {
	private Account[] accounts={
			new Account("1111", "KIM", 80000, 3.0f),
			new Account("2222", "LEE", 40000, 7.9f),
			new Account("3333", "PARK", 50000, 4.4f),
			new Account("4444", "MO", 30000, 8.3f),
			new Account("5555", "KIM", 49000, 3.5f),
			new Account("6666", "LEE", 51000, 8.5f),
			new Account("7777", "MOON", 110000, 5.4f),
			new Account("8888", "NAM", 50200, 8.0f),
			new Account("9999", "NA", 520000, 8.1f),
			new Account("3000", "KIM", 50000, 7.2f) 
	};
	/*
	 * 총잔고계산후반환
	 */
	public int getTotalBalance(){
		int tot=0;
		for (int i = 0; i < accounts.length; i++) {
			tot+=accounts[i].getBalance();
		}
		return tot;
	}
	/*
	 * 전제계좌출력
	 */
	public void print(){
		accounts[0].headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	public int allAccountCount(){
		int all = 0;
		for (int i = 0; i < accounts.length; i++) {
			all += 1;
		}
		return all;
	}
	/*
	 * 계좌번호를 인자로받아서 계좌객체반환
	 */
	public Account findByAccountNo(String no){
		Account tempNo = null;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo().equals(no)){
				tempNo = accounts[i];
				break;
			}
		}
		return tempNo;
	}
	/*
	 * 이름을 인자로받아서 계좌객체들반환
	 */
	public Account[] findByAccountName(String name){
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner().equals(name)){
				count += 1;
			}
		}
		Account[] tempName = new Account[count];
		int temp = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner().equals(name)){
				tempName[temp] = accounts[i];
				temp++;
			}
		}
		return tempName;
	}
	public Account[] findByAccountBalance(int balance) {
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance() >= balance){
				count += 1;
			}
		}
		Account[] tempBalance = new Account[count];
		int temp = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance() >= balance){
				tempBalance[temp] = accounts[i];
				temp++;
			}
		}
		return tempBalance;
	}
	public Account[] findByIyul(float iyul) {
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul() >= iyul){
				count += 1;
			}
		}
		Account[] tempIyul = new Account[count];
		int temp = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul() >= iyul){
				tempIyul[temp] = accounts[i];
				temp++;
			}
		}
		return tempIyul;
	}
	public Account depositByBalance(String no, int balance) {
		Account tempBa = null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals(no)){
				accounts[i].ipGum(balance);
				tempBa = accounts[i];
				break;
			}
		}

		return tempBa;
	}
	public Account withdrawBalance(String no, int balancei) {
		Account tempBa = null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals(no)){
				accounts[i].chulGum(balancei);
				tempBa = accounts[i];
				break;
			}
		}
		return tempBa;
	}
	public Account changeIyul(String no, float iyul) {
		Account tempBa = null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals(no)){
				accounts[i].setIyul(iyul);
				tempBa = accounts[i];
				break;
			}
		}
		return tempBa;
	}
	
	
}
