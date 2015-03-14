package com.itwill.parking.manager;

/*
 * 주차관리 클래스
 */
public class ParkingManager {
	private Car[] parkingArray;
	public ParkingManager() {
		parkingArray = new Car[30];
	}
	public ParkingManager(int number){
		parkingArray = new Car[number];
	}
	// 입차
	public void ipCha(Car inCar) {
		for (int i = 0; i < parkingArray.length; i++) {
			if(parkingArray[i]==null){
				parkingArray[i]=inCar;
				break;
			}
		}
	}
	public int getCarCount() {
		int count = 0;
		for (int i = 0; i < parkingArray.length; i++) {
			if(parkingArray[i]!=null){
				count++;
			}
		}
		return count;
	}
	public void printAll() {
		Car.headerPrint();
		for (int i = 0; i < parkingArray.length; i++) {
			if(parkingArray[i]!=null){
				parkingArray[i].print();
			}
		}
	}
	public Car findByCarNo(String no) {
		Car tempNo = null;
		for (int i = 0; i < parkingArray.length; i++) {
			if(parkingArray[i]!=null && parkingArray[i].getNo().equals(no)){
				tempNo = parkingArray[i];
			}
		}
		return tempNo;
	}
	public Car[] findByCarInTime(int intime) {
		int count = 0;
		for (int i = 0; i < parkingArray.length; i++) {
			if(parkingArray[i]!=null && parkingArray[i].getInTime()>=intime){
				count += 1;
			}
		}
		Car[] tempNo = new Car[count];
		int temp = 0;
		for (int i = 0; i < parkingArray.length; i++) {
			if(parkingArray[i]!=null && parkingArray[i].getInTime()>=intime){
				tempNo[temp] = parkingArray[i];
				temp++;
			}
		}
		return tempNo;
	}
	public Car findByCarNoandOut(String no, int outtime) {
		Car tempNo = null;
		for (int i = 0; i < parkingArray.length; i++) {
			if(parkingArray[i]!=null && parkingArray[i].getNo().equals(no)){
				parkingArray[i].setOutTime(outtime);
				parkingArray[i].calculateFee();
				tempNo = parkingArray[i];
			}
		}
		return tempNo;
	}
	public String deleteByNo(String no) {
		String tempNo = null;
		for (int i = 0; i < parkingArray.length; i++) {
			if(parkingArray[i]!=null && parkingArray[i].getNo().equals(no)){
				parkingArray[i] = null;
				tempNo = no + "삭제되었습니다.";
			}
		}
		return tempNo;
	}
	
	
	
	
}
