
public abstract class Employee {
	/*
	 * �μ�Ƽ����(10%)
	 */
	public static final double INCENTIVE_RATE = 0.1;
	private int no; //���
	private String name; // ����̸�
	private int pay; // �޿�
	private int incentive; //�μ�Ƽ��
	public Employee() {
	}
	
	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	/*
	 * ���ް��
	 * ���Employee���� ������ �ؾ��ϴ¸޽��
	 */
	public abstract void calculatePay();
	/*
	 * �μ�Ƽ����
	 * �޿��� 100������ ������ ����
	 * ��� Employee ���� �״�� ��� �ؾ��ϴ¸޽��
	 */
	public final void calculateIncentive(){
		if(pay>=1000000){
			incentive = (int)(pay*INCENTIVE_RATE);
		}
	}
	
	public void print(){
		System.out.println(no + "\t" + name +"\t" + pay + "\t" + incentive);
	}
	
	//setter,getter

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	
	
	
}
