/*
 ��ü�� ����ȯ
   1. �θ��ڽİ��迡�ִ� Ŭ�����鿡���� �����ϴ�.
   
   2. �ڽİ�ü�� �θ�Ŭ����Ÿ������ ����ȯ
       - �ڵ����� �̷������(������)
       Child c = new Child();
       Parent pppp = c; 
   3. �θ� ��ü�� �ڽ�Ŭ����Ÿ������ ����ȯ
       - ��Ģ�����δ� �Ұ����ϴ�
       - �θ��� Ż���� �ڽİ�ü �� �����ϴ�.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */
public class ParentChildCasting {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.member1 = "���1";
		c1.member2 = "���2";
		c1.member3 = "���3";
		c1.member4 = "���4";
		
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		
		//2. �ڽİ�ü�� �θ�Ŭ����Ÿ������ ����ȯ
		c1.print();//�������̵� �޽��
		Parent p1 = c1;
		
		p1.member1 = "���1";
		p1.member2 = "���2";
		//p1.member3 = "���3";
		//p1.member4 = "���4";
		
		p1.method1();
		p1.method2();
		//p1.method3();
		//p1.method4();
		p1.print(); // �������̵��޽��
		/*
	 	3. �θ� ��ü�� �ڽ�Ŭ����Ÿ������ ����ȯ
       	- ��Ģ�����δ� �Ұ����ϴ�
       	- �θ��� Ż���� �ڽİ�ü �� �����ϴ�.
		 */
		Parent p2 = new Parent();
		p2.member1 = "���1";
		p2.member2 = "���2";
		p2.method1();
		p2.method2();
		System.out.println("----�θ��� Ż���� �ڽİ�ü �� �����ϴ�.----");
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
