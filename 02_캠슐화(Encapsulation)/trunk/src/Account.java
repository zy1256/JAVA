
/**
 	이클래스는 계좌객체를 추상화한 클래스 입니다.
 	@author KIM
 	@version 0.1
 */
public class Account {

	private String no;     //계좌번호
	private String owner;  //계좌주
	private int balance;   //잔고
	private float iyul;    //이율
	
	//AccountData Setter
	/**
	 * 계좌객체의 데이타를 셋트하는 메쏘드
	 * 
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 잔고
	 * @param iyul 이율
	 */
	public void setData(String no, String owner, int balance, float iyul){
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	//입금
	/**
	 * 입금하는메쏘드
	 * @param m 입금할돈
	 */
	public void ipGum(int m){
		this.balance = this.balance+m;
	}
	
	//출금
	/**
	 * 출금하는 메쏘드
	 * @param m
	 */
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
	/**
	 * 계좌의 정보를 출력
	 */
	public void print(){
		System.out.println(no+"\t"+owner+"\t"+balance+"\t"+iyul);
		
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
	/**
	 * 
	 * @return 계좌잔고
	 */

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
