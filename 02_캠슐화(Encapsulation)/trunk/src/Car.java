
public class Car {
	
	private String no; //������ȣ
	private int inTime; // �����ð�
	private int outTime; // �����ð�
	private int fee; //�������
	
	//�Է�
	//���
	public void print(){
		
		//this : self ��������
		
		
		System.out.println(no+ "\t" + inTime + "\t" + outTime + "\t" + fee);
		
	}
	
	//������ݰ��
	public void calculateFee(){
		this.fee=(this.outTime-this.inTime)*1000;
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
	

}
