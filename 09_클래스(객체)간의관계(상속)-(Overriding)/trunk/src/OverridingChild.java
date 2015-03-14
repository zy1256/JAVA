
public class OverridingChild extends Overriding {
	/*
	public void method1(){
		System.out.println("Overriding.method1()");
	}
	public void method2(){
		System.out.println("Overriding.method2()");
	}
	 */
	@Override
	public void method2(){
		System.out.println("OverridingChild애서 재정의한 method()");
	}

}
