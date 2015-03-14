package event;
/*
 * 계산기능을 제공하는 클래스
 */
public class Calculator {
	
	//외부에서 입력되는 인자두개를 받아서 더한후에 그결과를
	//호출한 클래스(객체)에게 반환하는 기능정의
	private Calculator() {
		/*
		 * private 생성자:외부(클래스,객체)에서의 생성을 금지
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
