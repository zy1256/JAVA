package com.itwill.sungjuk.method;

public class CalculatorStaticMain {

	public static void main(String[] args) {
		
		int result = Calculator.add(12, 454545);
		System.out.println("result : " + result);
		result = Calculator.sub(12, 454545);
		System.out.println("result : " + result);
		result = Calculator.mul(12, 454545);
		System.out.println("result : " + result);
		result = Calculator.div(12, 454545);
		System.out.println("result : " + result);
		System.out.println("------잘못된사용---");
		/*Calculator cal = new Calculator();
		result = cal.add(12,123);
		 */
	}

}
