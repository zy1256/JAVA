
public class Parent extends Object{
	private String member1;
	private String member2;
	public Parent(){
		super();
		/*
		 * �θ�Ŭ������ �⺻�����ڸ� �ڵ����� ȣ���Ѵ�.
		 */
		System.out.println("Parent()");
	}
	
	public Parent(String member1, String member2) {
		this.member1 = member1;
		this.member2 = member2;
	}

	public String getMember1() {
		return member1;
	}

	public void setMember1(String member1) {
		this.member1 = member1;
	}

	public String getMember2() {
		return member2;
	}

	public void setMember2(String member2) {
		this.member2 = member2;
	}
	
	
	
}
