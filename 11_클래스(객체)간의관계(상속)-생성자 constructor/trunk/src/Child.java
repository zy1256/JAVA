
public class Child extends Parent{
	private String member3;
	public Child(){
		super();
		/*
		 * �θ�Ŭ������ �⺻�����ڸ� �ڵ����� ȣ���Ѵ�.
		 */
		System.out.println("Child()");
	}
	public Child(String member1, String member2, String member3) {
		super(member1, member2);
		
		//this.member1 = member1;
		//this.member2 = member2;
		
		//this.setMember1(member1);
		//this.setMember2(member2);
		this.member3 = member3;
	}
	
}
