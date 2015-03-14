
public class StaticMain {

	public static void main(String[] args) {
		
		//** 정적변수, 정적메쏘드 접근(실행) **
		/*
		 * 클래스이름, 정적멤버변수
		 * 클래스이름, 정적메쏘드()
		 */
		Static.static_variable = 777;
		System.out.println("Static.static_variable : " + Static.static_variable);
		Static.static_method();
		
		// **객체변수,메쏘드 접근(실행)**
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
