
public class StaticMain {

	public static void main(String[] args) {
		
		//** ��������, �����޽�� ����(����) **
		/*
		 * Ŭ�����̸�, �����������
		 * Ŭ�����̸�, �����޽��()
		 */
		Static.static_variable = 777;
		System.out.println("Static.static_variable : " + Static.static_variable);
		Static.static_method();
		
		// **��ü����,�޽�� ����(����)**
		Static st =new Static();
		st.instance_variable=888;
		System.out.println(st.instance_variable);
		st.instance_method();
		
		Static st1 =new Static();
		st1.instance_variable=999;
		System.out.println(st1.instance_variable);
		st1.instance_method();
		System.out.println("-----------------");
		
		
		
	}

}
