
public class Child extends Parent{
	private String member3;
	public Child(){
		super();
		/*
		 * 부모클래스의 기본생성자를 자동으로 호출한다.
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
