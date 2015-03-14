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
		0.현재주차장 주차가능대수(주차장  주차차량대수)
		
		1.입차
			a.차객체생성(번호,입차시간)
			b.차배열객체에 저장(null인곳에 저장)
			
		2.전체차량 정보출력(null이아닌변수출력)
		
		3.1456번 차량출차
			a.1456번 차량찾기
			b.현재시간셋팅,요금계산,영수증출력
			c.1456번차량 삭제(carArray[7]=null;)
		
		*/
		System.out.println("0.현재주차장 주차가능대수(주차장  주차차량대수)");
		int parkingV = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null){
				parkingV += 1;
			}
		}
		System.out.println("주차가능대수 : " + parkingV);
		int parkingCar = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null){
				parkingCar += 1;
			}
		}
		System.out.println("주차차량대수 : " + parkingCar);
		
		System.out.println("1.입차 a.차객체생성(번호,입차시간)__b.차배열객체에 저장(null인곳에 저장)");

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
		
		System.out.println("2.전체차량 정보출력(null이아닌변수출력)");
		
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null){
				System.out.println(carArray[i].getNo() + "," + carArray[i].getInTime());
			}
		}
		System.out.println("3.1456번 차량출차\n a.1456번 차량찾기\n b.현재시간셋팅,요금계산,영수증출력\n c.1456번차량 삭제(carArray[7]=null;)");
		System.out.println("번호\t입차\t출차\t요금");
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
