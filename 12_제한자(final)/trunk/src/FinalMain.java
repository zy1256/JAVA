
public class FinalMain {

	public static void main(String[] args) {
		System.out.println("SuperClass PORT_NUMBER : " + SuperClass.PORT_NUMBER);
		SuperClass superClass = new SuperClass();
		//superClass.PORT_NUMBER=88;
		System.out.println("PORT_NUMBER : " + superClass.PORT_NUMBER);
		
		SubClass subClass = new SubClass();
		subClass.method1();
		superClass.method2();
		
		
	}

}
