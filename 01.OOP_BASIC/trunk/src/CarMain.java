
public class CarMain {

	public static void main(String[] args) {
		
		//����
		Car c1 = new Car();
		c1.no="1234";
		c1.inTime=12;
		
		
		Car c2 = new Car();
		c2.no="4567";
		c2.inTime=13;
		
		
		//3�ð���
		
		//����
		c1.outTime = 15;
		c1.fee = (c1.outTime - c1.inTime)*1000;
		System.out.println("-----------------");
		System.out.println("������ȣ : " + c1.no);
		System.out.println("�����ð� : " + c1.inTime);
		System.out.println("�����ð� : " + c1.outTime);
		System.out.println("������� : " + c1.fee);
		System.out.println("-----------------");
		
		c2.outTime = 19;
		c2.fee = (c2.outTime - c2.inTime)*1000;
		System.out.println("-----------------");
		System.out.println("������ȣ : " + c2.no);
		System.out.println("�����ð� : " + c2.inTime);
		System.out.println("�����ð� : " + c2.outTime);
		System.out.println("������� : " + c2.fee);
		System.out.println("-----------------");

	}

}
