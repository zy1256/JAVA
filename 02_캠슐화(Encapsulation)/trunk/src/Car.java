
public class Car {
	
	private String no; //차량번호
	private int inTime; // 입차시간
	private int outTime; // 출차시간
	private int fee; //주차요금
	
	//입력
	//출력
	public void print(){
		
		//this : self 참조변수
		
		
		System.out.println(no+ "\t" + inTime + "\t" + outTime + "\t" + fee);
		
	}
	
	//주차요금계산
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
