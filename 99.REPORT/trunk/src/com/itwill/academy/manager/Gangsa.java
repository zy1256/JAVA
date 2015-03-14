package com.itwill.academy.manager;

public class Gangsa extends Person{
	private String subject;//°ú¸ñ
	public Gangsa() {
		// TODO Auto-generated constructor stub
	}
	
	public Gangsa(int no, String name, String subject) {
		super(no, name);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/*public void gangsaPrint(){
		System.out.println(no + "\t" + name + "\t" + subject);
	}*/
	@Override
	public void print(){
		super.print();
		System.out.println("\t" + subject);
	}
	
	
}
