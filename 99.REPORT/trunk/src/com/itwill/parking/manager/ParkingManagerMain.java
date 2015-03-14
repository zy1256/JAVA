package com.itwill.parking.manager;

/*
 * �������� Ŭ������ ����Ͽ� ����
 */
public class ParkingManagerMain {

	public static void main(String[] args) {
		ParkingManager parkingmanager = new ParkingManager(26);
		Car c1 = new Car("1111",1);
		Car c2 = new Car("1562",3);
		Car c3 = new Car("2345",6);
		Car c4 = new Car("3485",7);
		Car c5 = new Car("1456",8);
		Car c6 = new Car("5318",8);
		Car c7 = new Car("6786",10);
		Car c8 = new Car("7831",13);
		Car c9 = new Car("8135",15);
		
		//����(8��)
		System.out.println("����(8��)");
		parkingmanager.ipCha(c1);
		parkingmanager.ipCha(c2);
		parkingmanager.ipCha(c3);
		parkingmanager.ipCha(c4);
		parkingmanager.ipCha(c5);
		parkingmanager.ipCha(c6);
		parkingmanager.ipCha(c7);
		parkingmanager.ipCha(c8);
		parkingmanager.ipCha(c9);

		//��ü���� �������(null�̾ƴѺ������)
		int carCount= parkingmanager.getCarCount();
		System.out.println("���������� �������ɴ��(������  �����������) : " + carCount);
		parkingmanager.printAll();
		
		System.out.println("-------------------------------");
		System.out.println("��ȣ�� ��ã��(1��) 7831�� ã��");
		Car carNo = parkingmanager.findByCarNo("7831");
		Car.headerPrint();
		carNo.print();
		
		System.out.println("-------------------------------");
		System.out.println("�����ð�����ã��(������) 8����");
		Car[] carInTime = parkingmanager.findByCarInTime(8);
		Car.headerPrint();
		for (int i = 0; i < carInTime.length; i++) {
			carInTime[i].print();
		}

		System.out.println("-------------------------------");
		System.out.println("1456�� ����ã�� , ����ð�����,��ݰ�� ");
		Car carOut = parkingmanager.findByCarNoandOut("1456",20);
		Car.headerPrint();
		carOut.carOutPrint();
		System.out.println("1456������ ����-------------");
		String carDelete = parkingmanager.deleteByNo("1456");
		System.out.println(carDelete);
		parkingmanager.printAll();
		
		/*
		0.���������� �������ɴ��(������  �����������)
		
		1.����
			a.����ü����(��ȣ,�����ð�)
			b.���迭��ü�� ����(null�ΰ��� ����)
			
		2.��ü���� �������(null�̾ƴѺ������)
		3-1.��ȣ�� ��ã��(1��)
		3-2.�����ð�����ã��(������)
		4.1456�� ��������
			a.1456�� ����ã��
			b.����ð�����,��ݰ��,���������
			c.1456������ ����(carArray[7]=null;)
		
		*/

	}

}
