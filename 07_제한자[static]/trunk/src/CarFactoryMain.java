
public class CarFactoryMain {

	public static void main(String[] args) {
		
		Car.count=5;
		
		System.out.println("1." + Car.count);
		Car c1 = new Car("k3", "RED", 2000);
		System.out.println("2." + Car.count);
		Car c2 = new Car("k5", "BLUE", 2400);
		System.out.println("3." + Car.count);
		Car c3 = new Car("k7", "YELLOW", 3000);
		System.out.println("4." + Car.count);
		Car c4 = new Car("k9", "ORANGE", 3300);
		System.out.println("all." + Car.count);
		
		System.out.println("--------------------");
		System.out.println("c1.count = " + c1.count);
		System.out.println("c2.count = " + c2.count);
		System.out.println("c3.count = " + c3.count);
		System.out.println("c4.count = " + c4.count);

	}

}
