package com.itwill.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionMapUseMain {

	public static void main(String[] args) {
		
		/*********전체학생**************/
		HashMap<Integer, ArrayList<Student>> schoolMap = new HashMap<Integer,ArrayList<Student>>();
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1,"KIM",89,85,98));
		studentList.add(new Student(2,"LEE",75,73,79));
		studentList.add(new Student(3,"PARK",61,96,97));
		
		schoolMap.put(1, studentList);
		schoolMap.put(2, new ArrayList<Student>());
		schoolMap.put(3, new ArrayList<Student>());
		
		ArrayList<Student> tempStudentlist = schoolMap.get(2);
		tempStudentlist.add(new Student(1, "SIM", 78, 88, 85));
		tempStudentlist.add(new Student(2, "KANG", 45, 77, 90));
		tempStudentlist.add(new Student(3, "HONG", 90, 44, 22));
		
		tempStudentlist = schoolMap.get(3);
		tempStudentlist.add(new Student(1, "CHOI", 90, 100, 45));
		tempStudentlist.add(new Student(2, "LIM", 22, 11, 99));
		tempStudentlist.add(new Student(3, "PARK", 98, 23, 53));
		
		/*********************************************************/
		ArrayList<Student> ilBan = schoolMap.get(1);
		System.out.println("--1반출력---");
		Student.headerPrint();
		for(Student student : ilBan){
			student.print();
		}
		Student.headerPrint();
		System.out.println("--학생전체출력--");
		Set<Integer> banKeyInt = schoolMap.keySet();
		Iterator<Integer> banIter = banKeyInt.iterator();

		while (banIter.hasNext()) {
			Integer integer = (Integer) banIter.next();
			ArrayList<Student> tStudentList = schoolMap.get(integer);
			System.out.println("**********" + integer + "************");
			for(Student student : tStudentList){
				student.print();
			}
			
		}
		HashMap<String, HashMap<String, Car>> parkingMap= new HashMap<String, HashMap<String,Car>>();
		parkingMap.put("A", new HashMap<String,Car>());
		parkingMap.put("B", new HashMap<String,Car>());
		parkingMap.put("C", new HashMap<String,Car>());
		
		//입차
		parkingMap.get("A").put("1355", new Car("1355",2));
		parkingMap.get("A").put("2548", new Car("2548",5));
		parkingMap.get("A").put("5487", new Car("5487",10));

		parkingMap.get("B").put("7896", new Car("7896",2));
		parkingMap.get("B").put("4567", new Car("4567",5));
		
		parkingMap.get("C").put("5436", new Car("5436",5));
		
		//출차
		Car exitCar = parkingMap.get("A").get("5487");
		exitCar.setOutTime(12);
		exitCar.calculateFee();
		exitCar.print();
		parkingMap.get("A").remove("5487");
		
		Set<String> parkKeySet = parkingMap.keySet();
		Iterator<String> parkKeyIter = parkKeySet.iterator();
		while (parkKeyIter.hasNext()) {
			String parkKeyStr = (String) parkKeyIter.next();
			System.out.println("----"+ parkKeyStr + "----------");
			HashMap<String, Car> tCarMap = parkingMap.get(parkKeyStr);
			Set<String> carKeySet = tCarMap.keySet();
			Iterator<String> CarKeyIter = carKeySet.iterator();
			while (CarKeyIter.hasNext()) {
				String carKey = (String) CarKeyIter.next();
				tCarMap.get(carKey).print();
				
			}
		}
		
	}

}
