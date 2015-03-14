
public class CarMain {

	public static void main(String[] args) {
		
		//입차
		Car c1 = new Car();
		c1.no="1234";
		c1.inTime=12;
		
		
		Car c2 = new Car();
		c2.no="4567";
		c2.inTime=13;
		
		
		//3시간후
		
		//출차
		c1.outTime = 15;
		c1.fee = (c1.outTime - c1.inTime)*1000;
		System.out.println("-----------------");
		System.out.println("차량번호 : " + c1.no);
		System.out.println("입차시간 : " + c1.inTime);
		System.out.println("출차시간 : " + c1.outTime);
		System.out.println("주차요금 : " + c1.fee);
		System.out.println("-----------------");
		
		c2.outTime = 19;
		c2.fee = (c2.outTime - c2.inTime)*1000;
		System.out.println("-----------------");
		System.out.println("차량번호 : " + c2.no);
		System.out.println("입차시간 : " + c2.inTime);
		System.out.println("출차시간 : " + c2.outTime);
		System.out.println("주차요금 : " + c2.fee);
		System.out.println("-----------------");

	}

}
