/*
산술연산자
    	- 형태:	+,-,*,/,%, <<
 */

public class ArithmaticOperator {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		int result = a + b;
		System.out.println("1+2= "+result);
		result = a - b;
		System.out.println("1-2= "+result);
		result = a * b;
		System.out.println("1*2= "+result);
		result = a / b;
		System.out.println("1/2= "+result);
		double dresult = (double)a/b;
		System.out.println("double" + dresult);
		int year = 2014;
		result = year % 4;
		System.out.println("2014%4= "+result);

		int c = 1;
		result = c << 2;
		System.out.println("1<<2 = "+result);
		
	}

}
