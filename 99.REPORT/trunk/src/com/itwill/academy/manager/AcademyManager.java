package com.itwill.academy.manager;

public interface AcademyManager {
	public static final int BAN=0;
	public static final int DEPART=1;
	public static final int SUBJECT=2;
	
	public void allPrint();
	public void addPerson(Person p);
	public void deletePerson(int no);
	public void updatePerson(Person p);
	public Person findByNo(int no);
	public Person[] findByName(String name);	
	public Person[] findByEtc(int etcNo,String etc);
}
