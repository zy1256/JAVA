
public class CarEncapsulation {

	public static void main(String[] args) {
		Car car1 = new Car();
		//����
		car1.setNo("1222");
		car1.setInTime(12);
		//����
		car1.setOutTime(19);
		car1.calculateFee();
		car1.print();
		
		

	}

}
