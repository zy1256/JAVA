package com.itwill.academy.manager;

public class Person {

	private int no;
	private String name;
	public Person() {
		
	}
	public Person(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print(){
		System.out.print(no + "\t" + name);
	}
	
}
