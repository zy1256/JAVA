package com.itwill.parking.manager.collection;

import java.util.ArrayList;

public class ParkingManagerCollection {
	private ArrayList<Car> parkingArray;
	public ParkingManagerCollection() {
		parkingArray = new ArrayList<Car>();
	}
	// ÀÔÂ÷
	public void ipCha(Car inCar) {
		parkingArray.add(inCar);
	}
	public int getCarCount() {
		int count = 0;
		count = parkingArray.size();
		return count;
	}
	public void printAll() {
		Car.headerPrint();
		for (int i = 0; i < parkingArray.size(); i++) {
			Car temp = (Car)parkingArray.get(i);
			temp.print();
		}
	}
	public Car findByCarNo(String no) {
		Car tempNo = null;
		for (int i = 0; i < parkingArray.size(); i++) {
			Car temp = (Car)parkingArray.get(i);
			if(temp.getNo().equals(no)){
				tempNo = temp;
			}
		}
		return tempNo;
	}
	public ArrayList<Car> findByCarInTime(int intime) {
		ArrayList<Car> temp = new ArrayList<Car>();
		for (int i = 0; i < parkingArray.size(); i++) {
			Car tempCar = (Car)parkingArray.get(i);
			if(tempCar.getInTime() >= intime){
				temp.add(tempCar) ;
			}
		}
		return temp;
	}
	public Car findByCarNoandOut(String no, int outtime) {
		Car tempNo = null;
		for (int i = 0; i < parkingArray.size(); i++) {
			Car temp = (Car)parkingArray.get(i);
			if(temp.getNo().equals(no)){
				tempNo = temp;
				tempNo.setOutTime(outtime);
				tempNo.calculateFee();
				tempNo.carOutPrint();
				parkingArray.remove(i);
			}
		}
		return tempNo;
	}
}
