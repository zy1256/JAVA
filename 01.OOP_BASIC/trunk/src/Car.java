/**
 * 주차장에서 사용하는 차객체를 추상화한 클래스
 * @author Administrator
 *
 */
public class Car {
	
	/**
	 * 차량번호
	 */
	public String no; //차량번호
	/**
	 * 입차시간
	 */
	public int inTime; // 입차시간
	/**
	 * 출차시간
	 */
	public int outTime; // 출차시간
	/**
	 * 주차요금
	 */
	public int fee; //주차요금
	
	//멤버메쏘드(행위)
	
	//입력
	//출력
	/**
	 * 출력
	 */
	public void print(){
		
		//this : self 참조변수
		
		System.out.println("----------------------");
		System.out.println("차량번호 : " + this.no);
		System.out.println("입차시간 : " + this.inTime);
		System.out.println("출차시간 : " + this.outTime);
		System.out.println("주차요금 : " + this.fee);
		System.out.println("-----------------");
		
	}
	
	//주차요금계산
	public void calculaterFee(){
		this.fee=(this.outTime-this.inTime)*1000;
	}

}
