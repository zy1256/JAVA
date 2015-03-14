package com.itwill.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		
		Object[] oa = new Object[2];
		oa[0] = new Account(); 
		oa[1] = new Account(); 
		for (int i = 0; i < oa.length; i++) {
			Account tempAcc= (Account)oa[i];
			tempAcc.print();
		}
		
		/***********기본형(Wrapper,String)******************/
		HashSet pSet = new HashSet();
		System.out.println("1. size" + pSet.size());
		pSet.add(56);
		pSet.add(61);
		pSet.add(90);
		pSet.add(88);
		pSet.add(78);
		pSet.add(new Integer(97));
		boolean isAdd = pSet.add(88);
		System.out.println();
		System.out.println("2.size " + pSet.size());
		System.out.println("3.set 구조 " + pSet.toString());
		boolean isRemove = pSet.remove(56);
		System.out.println("6.remove set : " + pSet);
		if(pSet.contains(90)){
			System.out.println("pSet.contains(90):" + pSet.contains(90));
		}
		Object[] objectsArray = pSet.toArray();
		for (int i = 0; i < objectsArray.length; i++) {
			Integer tempInt = (Integer)objectsArray[i];
			int tint = tempInt.intValue();
			System.out.print(tint+",");
		}
		System.out.println(" ");
		/*************Interaction**************/
		Iterator setIter = pSet.iterator();
		while (setIter.hasNext()) {
			Integer wi = (Integer)setIter.next();
			System.out.print(wi+",");
			
		}
		System.out.println(" ");
		
		/*************참조형******************/
		
		HashSet rSet = new HashSet();
		Account acc1 = new Account("1111", "KIM", 120000, 1.5f);
		Account acc2 = new Account("2222", "LEE", 80000, 2.5f);
		Account acc3 = new Account("3333", "PARK", 6000, 9.5f);
		Account acc4 = new Account("4444", "MO", 50000, 4.2f);
		Account acc5 = new Account("5555", "KIM", 161000, 10.8f);
		Account acc6 = new Account("6666", "LEE", 125000, 3.2f);
		
		System.out.println("1.set size " + rSet.size());
		rSet.add(acc1);
		rSet.add(acc2);
		rSet.add(acc3);
		rSet.add(acc4);
		rSet.add(acc5);
		rSet.add(acc6);
		System.out.println("2.set size " + rSet.size());
		isAdd = rSet.add(acc5);
		System.out.println("3.isAdd " + isAdd);
		
		rSet.remove(acc3);
		System.out.println("4.remove set size : " + rSet.size());
		System.out.println("5.set 구조" + rSet);
		System.out.println("6.전체출력(iteration)");
		Iterator rSetInter = rSet.iterator();
		while (rSetInter.hasNext()) {
			Account tAccout = (Account) rSetInter.next();
			System.out.println(tAccout);
		}
		
		
	}

}
