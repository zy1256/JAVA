/*
 * static ������(������,modifier)
 *   1.���������,�޽��(Ŭ����) �տ� ��ĥ���ִ�
 * 	 2.static �����ڰ� �پ��ִ� �������޽���
 *     ��ü���� ���̵� ����̰����ϴ�.
 *   3.Ŭ������ �������ִ� �������޽���̴�.
 *     -->Ŭ��������,Ŭ�����޽�����Ѵ�.
 *   4.Ŭ�����κ��� �����Ǵ� ��ü���� �����ϴ�
 *     ����(�޽��)�̴�.      
 *     -->���뺯��(�޽��)����Ѵ�.
 *     
 *  -����: 
 *  	�������: public static int i;
 * 		����޽��:public static void print(){}
 * 
 */
public class Static {
	public int instance_variable;
	public static int static_variable;
	public void instance_method(){
		System.out.println("instance_method() ȣ��");
	}
	public static void static_method(){
		
	}
}
