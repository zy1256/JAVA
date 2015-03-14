
public class CarFactoryMain {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setNo(4);
		c1.setModel("K7");
		
		Engine k7e = new Engine();
		k7e.setType("A");
		k7e.setCc(2800);
		
		c1.setEngine(k7e);
		
		c1.print();
		
		
		/************************************************/
		Car car1 = new Car();
		car1.setNo(9999);
		Car car2;
		car2=car1;
		Car car3 = car2;
		
		System.out.println("car1.getNo() -->" + car1.getNo());
		System.out.println("car2.getNo() -->" + car2.getNo());
		System.out.println("car3.getNo() -->" + car3.getNo());
		

	}

}
