/*
�����ε�(��������)
  1. �ڹ� ������������� �����ϳ��̴�.
  2. ����: �����޽�� �̸����� �������� �����ϴ¹��
           - ��Ģ: 
               * �޽���� �̸��� ���ƾ��Ѵ�.
               * �޽���� ������ ���ڰ� �ٸ��ų�
               * �޽���� ������ Ÿ���� �޶���Ѵ�.
               * �޽���� ����Ÿ��,���������ڴ� �������.

*/
public class Overloading {
	public void method(){
		System.out.println("public void method()����");
	}
	public void method(int i){
		System.out.println("public void method(int i)����");
	}
	public void method(String str){
		System.out.println("public void method(String str)����");
	}
	public void method(int i, int j){
		System.out.println("public void method(int i, int j)����");
	}
	public void method(String str1, String str2){
		System.out.println("public void method(String str1, int str2)����");
	}
	public void method(String str1, int str2){
		System.out.println("public void method(String str1, int str2)����");
	}

}
