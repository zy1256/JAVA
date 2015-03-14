package com.itwill.collection;

public class NoGenricMain {

	public static void main(String[] args) {
		
		

		NoGeneric ng = new NoGeneric();
		ng.setElement(new Account("1234","KIM", 34000, 4.5f));
		//ng.setElement(new Car("1111", 12));
		
		Account getAccount = (Account)ng.getElement();
		System.out.println(getAccount);
		
		//Generic<Account> g = new Generic<Account>();
		//g.setMember(new Account("1325", "CHOI", 50000, 2.8f));
		//g.setMember(new Car("1524", 12));
		//Account getAccount1 = g.getMember();
		//System.out.println(getAccount1);
	}

}
