
public class Child extends Parent {
	public String member3;
	public String member4;
	public void method3(){
		System.out.println("Child.method3()");
	}
	public void method4(){
		System.out.println("Child.method4()");
	}
	public void print(){
		System.out.println(member1 + "," + member2 + "," +  member3 + "," +  member4);
	}
}
