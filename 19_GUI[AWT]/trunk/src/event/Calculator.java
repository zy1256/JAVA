package event;
/*
 * ������� �����ϴ� Ŭ����
 */
public class Calculator {
	
	//�ܺο��� �ԷµǴ� ���ڵΰ��� �޾Ƽ� �����Ŀ� �װ����
	//ȣ���� Ŭ����(��ü)���� ��ȯ�ϴ� �������
	private Calculator() {
		/*
		 * private ������:�ܺ�(Ŭ����,��ü)������ ������ ����
		 */
	}
	public static int add(int a,int b){
		return a+b;
	}
	public static int sub(int a,int b){
		return a-b;
	}
	public static int mul(int a,int b){
		return a*b;
	}
	public static int div(int a,int b){
		return a/b;
	}
	
	

}
