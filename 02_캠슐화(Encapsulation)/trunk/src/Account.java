
/**
 	��Ŭ������ ���°�ü�� �߻�ȭ�� Ŭ���� �Դϴ�.
 	@author KIM
 	@version 0.1
 */
public class Account {

	private String no;     //���¹�ȣ
	private String owner;  //������
	private int balance;   //�ܰ�
	private float iyul;    //����
	
	//AccountData Setter
	/**
	 * ���°�ü�� ����Ÿ�� ��Ʈ�ϴ� �޽��
	 * 
	 * @param no ���¹�ȣ
	 * @param owner ������
	 * @param balance �ܰ�
	 * @param iyul ����
	 */
	public void setData(String no, String owner, int balance, float iyul){
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	//�Ա�
	/**
	 * �Ա��ϴ¸޽��
	 * @param m �Ա��ҵ�
	 */
	public void ipGum(int m){
		this.balance = this.balance+m;
	}
	
	//���
	/**
	 * ����ϴ� �޽��
	 * @param m
	 */
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
	/**
	 * ������ ������ ���
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
	 * @return �����ܰ�
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
