/*
 객체의 형변환
   1. 부모자식관계에있는 클래스들에서만 가능하다.
   
   2. 자식객체를 부모클래스타입으로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
   3. 부모 객체를 자식클래스타입으로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체 는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */
public class ParentChildCasting {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.member1 = "멤버1";
		c1.member2 = "멤버2";
		c1.member3 = "멤버3";
		c1.member4 = "멤버4";
		
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		
		//2. 자식객체를 부모클래스타입으로 형변환
		c1.print();//오버라이딩 메쏘드
		Parent p1 = c1;
		
		p1.member1 = "멤버1";
		p1.member2 = "멤버2";
		//p1.member3 = "멤버3";
		//p1.member4 = "멤버4";
		
		p1.method1();
		p1.method2();
		//p1.method3();
		//p1.method4();
		p1.print(); // 오버라이딩메쏘드
		/*
	 	3. 부모 객체를 자식클래스타입으로 형변환
       	- 원칙적으로는 불가능하다
       	- 부모의 탈을쓴 자식객체 는 가능하다.
		 */
		Parent p2 = new Parent();
		p2.member1 = "멤버1";
		p2.member2 = "멤버2";
		p2.method1();
		p2.method2();
		System.out.println("----부모의 탈을쓴 자식객체 는 가능하다.----");
		//Child c2 = p2;
		Parent p3 = new Child();
		Child c3 = (Child)p3;
		c3.method1();
		c3.method2();
		c3.method3();
		c3.method4();
		c3.print();
		
	}

}
