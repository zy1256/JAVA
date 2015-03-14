
public class CarMethodMain {

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
		c1.calculaterFee();
		c1.print();
		
		c2.outTime = 19;
		c2.calculaterFee();
		c2.print();
	}

}
