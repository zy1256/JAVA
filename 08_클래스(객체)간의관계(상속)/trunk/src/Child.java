
public class Child extends Parent{
	/*
	public String member;
	public void method1(){
		System.out.println("Parent.method1()");
	}
	 */
	public String member2;
	public void method2(){
		System.out.println("Child.method2()"+this.member2);
	}
	public void print(){
		System.out.println("member1 : " + this.member1);
		System.out.println("member2 : " + this.member2);
	}
}
