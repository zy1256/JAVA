package com.itwill.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListMain {

	public static void main(String[] args) {
		/***************기본형(String)********************/
		ArrayList pList1 = new ArrayList();
		ArrayList pList2 = new ArrayList();
		
		System.out.println("1.list size : " + pList1.size());
		pList1.add("김경호");
		pList1.add("정경호");
		pList1.add("고경호");
		pList1.add("황경호");
		pList1.add("최경호");
		pList1.add("민경호");
		pList1.add("심경호");
		System.out.println("2.String List 구조 : " + pList1);
		pList1.add(2,"구경호");
		System.out.println("2.pList.add(2, \"구경호\") : " + pList1);
		pList1.add(0,"공경호");		
		System.out.println("2.pList.add(0, \"구경호\")  : " + pList1);
		pList1.remove(pList1.size()-1);
		System.out.println("2.pList1.size()-1 삭제  : " + pList1);
		Collections.sort(pList1);
		System.out.println("3.sort" + pList1);
		String tStr = (String)pList1.get(3);
		System.out.println("4.pList1.get(3)" + tStr);
		
		pList2.add(56);
		pList2.add(78);
		pList2.add(89);
		pList2.add(45);
		pList2.add(88);
		pList2.add(23);
		pList2.add(99);
		System.out.println("4.Integer List 구조 : " + pList2);
		Collections.sort(pList2);
		System.out.println("5.ini sort : " + pList2);
		System.out.println("6.전체출력-String--------------");
		for (int i = 0; i < pList1.size(); i++) {
			String tempString = (String)pList1.get(i);
			System.out.println(tempString);
			
		}
		System.out.println("6.전체출력-Integer--------------");
		for (int i = 0; i < pList2.size(); i++) {
			Integer tempInteger = (Integer)pList2.get(i);
			System.out.println(tempInteger);
			
		}
		/***************참조형********************/
		System.out.println("***********참조형************");
		ArrayList accountList = new ArrayList();
		Account acc1 = new Account("8856", "KIM", 120000, 1.5f);
		Account acc2 = new Account("7546", "LEE", 80000, 2.5f);
		Account acc3 = new Account("8546", "PARK", 6000, 9.5f);
		Account acc4 = new Account("8542", "SIM", 50000, 4.2f);
		Account acc5 = new Account("4345", "KIM", 161000, 10.8f);
		Account acc6 = new Account("4586", "CHIO", 125000, 3.2f);
		Account acc7 = new Account("1325", "SIM", 125000, 3.2f);
		Account acc8 = new Account("4588", "KIM", 125000, 3.2f);
		Account acc9 = new Account("1565", "LEE", 125000, 3.2f);
		
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		accountList.add(acc6);
		accountList.add(acc7);
		accountList.add(acc8);
		accountList.add(acc9);
		System.out.println("1. size : " + accountList.size());
		System.out.println("2. get: ");
		accountList.get(2);
		Account getAccount = (Account)accountList.get(2);
		System.out.println("2. get(2)" + getAccount);
		System.out.println("3. remove");
		Account removeAccount = (Account)accountList.remove(0);
		System.out.println(removeAccount);
		System.out.println("4.list구조" + accountList);
		
		System.out.println("5.전체출력------------------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tAccount = (Account)accountList.get(i);
			tAccount.print();
		}
		System.out.println("6.-------------SIM 씨 삭제-------------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getOwner().equals("SIM")){
				
				accountList.remove(i);
				if(accountList.size() !=i){
					i--;
				}
			}
		}
		System.out.println("7.삭제후 전체출력------------------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tAccount = (Account)accountList.get(i);
			tAccount.print();
		}
		Collections.sort(accountList);
		System.out.println("7.정렬후전체출력------------------");
		for (int i = 0; i < accountList.size(); i++) {
			Account tAccount = (Account)accountList.get(i);
			tAccount.print();
		}
		System.out.println("9--------iteration--------------");
		Iterator accountIter = accountList.iterator();
		while (accountIter.hasNext()) {
			Account tempAccount = (Account) accountIter.next();
			tempAccount.print();
		}
		
		

	}

}
