/*
������(final)
	1. Ŭ�����տ� ���ϰ��
	   ��ӱ��� 
       ex> public final class Test{}
    2. ����޽��տ� ���ϰ�� 
       �������̵� ����
       ex> public final void print(){}
    3. ������� �տ����ϰ��--> ���
       ex> public final int PORT_NUMBER=80;
       ���ȭ�ȴ�.    
       �������
*/
public class SuperClass {
	public static final int PORT_NUMBER = 80;
	public void method1(){
		System.out.println("�� �Ϲ� method1()");
		System.out.println(SuperClass.PORT_NUMBER);
	}
	public final void method2(){
		System.out.println("�� final�޽�� ����������������");
	}
}
