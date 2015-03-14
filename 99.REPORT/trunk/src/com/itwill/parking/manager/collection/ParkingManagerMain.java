package com.itwill.parking.manager.collection;

import java.util.ArrayList;

/*
 * 주차관리 클래스를 사용하여 주차
 */
public class ParkingManagerMain {

	public static void main(String[] args) {
		ParkingManagerCollection parkingmanager = new ParkingManagerCollection();
		Car c1 = new Car("1111",5);
		Car c2 = new Car("1562",3);
		Car c3 = new Car("2345",9);
		Car c4 = new Car("3485",7);
		Car c5 = new Car("1456",12);
		Car c6 = new Car("5318",8);
		Car c7 = new Car("6786",6);
		Car c8 = new Car("7831",11);
		Car c9 = new Car("8135",6);
		
		//입차(9대)
		System.out.println("입차(8대)");
		parkingmanager.ipCha(c1);
		parkingmanager.ipCha(c2);
		parkingmanager.ipCha(c3);
		parkingmanager.ipCha(c4);
		parkingmanager.ipCha(c5);
		parkingmanager.ipCha(c6);
		parkingmanager.ipCha(c7);
		parkingmanager.ipCha(c8);
		parkingmanager.ipCha(c9);

		//전체차량 정보출력(null이아닌변수출력)
		int carCount= parkingmanager.getCarCount();
		System.out.println("현재주차장 주차가능대수(주차장  주차차량대수) : " + carCount);
		parkingmanager.printAll();
		System.out.println("-------------------------------");
		System.out.println("번호로 차찾기(1대) 7831번 찾기");
		Car carNo = parkingmanager.findByCarNo("7831");
		Car.headerPrint();
		carNo.print();
		System.out.println("-------------------------------");
		System.out.println("입차시간으로찾기(여러대) 8이후");
		ArrayList<Car> carInTime = parkingmanager.findByCarInTime(8);
		Car.headerPrint();
		for (Car car : carInTime) {
			car.print();
		}
		System.out.println("-------------------------------");
		System.out.println("1456번 차량찾기 , 현재시간셋팅,요금계산-- 1456번차량 삭제");
		Car.headerPrint();
		Car carOut = parkingmanager.findByCarNoandOut("1456",20);
		//parkingmanager.printAll();
		
		/*
		0.현재주차장 주차가능대수(주차장  주차차량대수)
		
		1.입차
			a.차객체생성(번호,입차시간)
			b.차배열객체에 저장(null인곳에 저장)
			
		2.전체차량 정보출력(null이아닌변수출력)
		3-1.번호로 차찾기(1대)
		3-2.입차시간으로찾기(여러대)
		4.1456번 차량출차
			a.1456번 차량찾기
			b.현재시간셋팅,요금계산,영수증출력
			c.1456번차량 삭제(carArray[7]=null;)
		
		*/

	}

}
