package com.itwill.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		
		HashMap<String, Car> carMap= new HashMap<String,Car>();
		System.out.println("1.map size : " + carMap.size());
		carMap.put("3125", new Car("3125", 12));
		carMap.put("4533", new Car("4533", 6));
		carMap.put("8554", new Car("8554", 8));
		carMap.put("5544", new Car("5544", 11));
		carMap.put("8899", new Car("8899", 14));
		carMap.put("2233", new Car("2233", 3));
		System.out.println("2.put size : " + carMap.size());
		System.out.println("3.map±¸Á¶ : " + carMap );
		if(carMap.containsKey("8899")){
			Car removeCar = carMap.remove("8899");
			removeCar.print();
		}
		System.out.println("4.remove size :"+ carMap.size());
		System.out.println("5-----iteration-----");
		//Set<Entry<String,Car>> entrySet = carMap.entrySet();
		//Iterator<Entry<String,Car>> entryIter = entrySet.iterator();
		Set<Entry<String, Car>> entrySet = carMap.entrySet();
		Iterator<Entry<String, Car>> entryIter = entrySet.iterator();
		
		for(Entry<String,Car> entry : entrySet){
			String key=entry.getKey();
			Car car = entry.getValue();
			System.out.println("KEY:" + key+ "-->");
			car.print();
		}
		System.out.println("5----interation[keyset]-----");
		Set<String> keySet = carMap.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()){
			String keyStr = keyIter.next();
			System.out.println(keyStr + "-->");
			Car tempCar=carMap.get(keyStr);
			tempCar.print();
		}
		
		
		
	}

}
