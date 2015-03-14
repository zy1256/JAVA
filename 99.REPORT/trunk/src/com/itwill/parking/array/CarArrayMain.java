package com.itwill.parking.array;

public class CarArrayMain {

	public static void main(String[] args) {
		
		Car[] carArray={
				null,null,null,null,null,
				null,new Car ("2665",3),null,null,null,
				null,null,null,new Car("1456",6),null,
				null,new Car("8578",10),null,new Car("3688",15),null,
				null,null,null,null,null,
				null,null,new Car("2449",16),null,null,
		};
		/*
		Car[] carArray = new Car[30];
		carArray[7] = new Car("1456" , 3);
		carArray[29] = new Car("5553" , 4);
		*/
		/*
		0.���������� �������ɴ��(������  �����������)
		
		1.����
			a.����ü����(��ȣ,�����ð�)
			b.���迭��ü�� ����(null�ΰ��� ����)
			
		2.��ü���� �������(null�̾ƴѺ������)
		
		3.1456�� ��������
			a.1456�� ����ã��
			b.����ð�����,��ݰ��,���������
			c.1456������ ����(carArray[7]=null;)
		
		*/
		System.out.println("0.���������� �������ɴ��(������  �����������)");
		int parkingV = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null){
				parkingV += 1;
			}
		}
		System.out.println("�������ɴ�� : " + parkingV);
		int parkingCar = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null){
				parkingCar += 1;
			}
		}
		System.out.println("����������� : " + parkingCar);
		
		System.out.println("1.���� a.����ü����(��ȣ,�����ð�)__b.���迭��ü�� ����(null�ΰ��� ����)");

		int temp = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null ){
				temp = i;
			}
		}
		carArray[temp] = new Car ("1596",13);
		temp = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null ){
				temp = i;
			}
		}
		carArray[temp] = new Car ("1236",2);
		temp = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null ){
				temp = i;
			}
		}
		carArray[temp] = new Car ("5468",2);
		temp = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null ){
				temp = i;
			}
		}
		carArray[temp] = new Car ("4684",2);
		temp = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null ){
				temp = i;
			}
		}
		carArray[temp] = new Car ("1567",2);
		temp = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null ){
				temp = i;
			}
		}
		carArray[temp] = new Car ("4867",2);
		
		//carArray[temp].carInPrint();
		
		System.out.println("2.��ü���� �������(null�̾ƴѺ������)");
		
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null){
				System.out.println(carArray[i].getNo() + "," + carArray[i].getInTime());
			}
		}
		System.out.println("3.1456�� ��������\n a.1456�� ����ã��\n b.����ð�����,��ݰ��,���������\n c.1456������ ����(carArray[7]=null;)");
		System.out.println("��ȣ\t����\t����\t���");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getNo().equals("1456")){
				carArray[i].setOutTime(22);
				carArray[i].calculateFee();
				carArray[i].print();
				carArray[i]=null;
			}
		}
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null){
				carArray[i].carInPrint();
			}
		}
		

	}

}
