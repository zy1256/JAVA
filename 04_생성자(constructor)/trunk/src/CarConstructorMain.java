
public class CarConstructorMain {

	public static void main(String[] args) {
		Car c1 = new Car("111",12);
		Car c2 = new Car("123",13);
		Car c3 = new Car("124",14);
		Car c4 = new Car("125",15);
		
		c1.setOutTime(19);
		c1.calculateFee();
		c2.setOutTime(19);
		c2.calculateFee();
		c3.setOutTime(19);
		c3.calculateFee();
		c4.setOutTime(19);
		c4.calculateFee();
		
		c1.print();
		c2.print();
		c3.print();
		c4.print();

	}

}
