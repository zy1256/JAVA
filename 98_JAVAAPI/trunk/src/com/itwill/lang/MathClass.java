package com.itwill.lang;

public class MathClass {

	public static void main(String[] args) {
		/*
		 * java.lang.Math
		 */
		int max = Math.max(12, 15);
		System.out.println(max);
		double round = Math.round(25.859*100)/100;
		System.out.println(round);
		int abs = Math.abs(-8951);
		System.out.println(abs);
		/*
		 * Returns the largest (closest to positive infinity) double value that is less than or equal to 
		 * the argument and is equal to a mathematical integer. Special cases: 
		 */
		double floor = Math.floor(12.568);
		System.out.println(floor);
		double ceil = Math.ceil(12.568);
		System.out.println(ceil);
		double d = Math.random();
		System.out.println(d);
		d = Math.random();
		System.out.println(d);
		d = Math.random();
		System.out.println(d);
		
		System.out.println("------------1~10 정수--------------");
		int rNumber = (int)(Math.random()*10)+1;
		System.out.println(rNumber);
		rNumber = (int)(Math.random()*10)+1;
		System.out.println(rNumber);
		rNumber = (int)(Math.random()*10)+1;
		System.out.println(rNumber);
		rNumber = (int)(Math.random()*10)+1;
		System.out.println(rNumber);
		rNumber = (int)(Math.random()*10)+1;
		System.out.println(rNumber);
		
		/*
		 * 1 ~ 45
		 */

		System.out.println("------------1~45 정수--------------");
		int lottoNumber = (int)(Math.random()*45)+1;
		System.out.println(lottoNumber);
		lottoNumber = (int)(Math.random()*45)+1;
		System.out.println(lottoNumber);
		lottoNumber = (int)(Math.random()*45)+1;
		System.out.println(lottoNumber);
		lottoNumber = (int)(Math.random()*45)+1;
		System.out.println(lottoNumber);
		lottoNumber = (int)(Math.random()*45)+1;
		System.out.println(lottoNumber);
		lottoNumber = (int)(Math.random()*45)+1;
		System.out.println(lottoNumber);
		System.out.println("------------1~45 정수*(for)--------------");
		for (int i = 0; i < 6; i++) {
			lottoNumber = (int)(Math.random()*45)+1;
			System.out.print(lottoNumber + "\t");
		}
		
	}

}
