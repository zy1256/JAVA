package com.itwill.wrapper;
/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */
public class WrapperClassMain {

	public static void main(String[] args) {
		
		Object[] objectArray = new Object[5];
		objectArray[0] = new Integer(1);
		objectArray[1] = new Integer(2);
		objectArray[2] = new Integer(3);
		objectArray[3] = new Integer(4);
		objectArray[4] = new Integer(5);
		
		/*******boxing*****/
		Integer wi1 = new Integer(10);
		Integer wi2 = new Integer(20);
		Integer wi3 = 10;
		Integer wi4 = 20;
		
		int x = wi1.intValue();
		int y = wi2.intValue();
		int z = wi3;
		int w = wi4;
		
		int result = wi1.intValue()+wi2.intValue();
		System.out.println(result);
		result = wi1 + wi2;
		System.out.println(result);
		result = wi3+10;
		System.out.println(result);
		if(wi2>wi1){
			System.out.println("wi2>wi1");
		}
		if(wi3>3){
			System.out.println("wi3>3");
		}
		/************Wrapper 비교***********/
		Integer wi5 = new Integer(30);
		Integer wi6 = new Integer(30);
		if(wi5==30){
			System.out.println("wi5==30");
		}
		if(wi5==wi6){
			System.out.println("wi5==wi6 : 주소비교");
		}else{
			System.out.println("wi5!=wi6");
		}
		/********값비교********/
		if(wi5.equals(wi6)){
			System.out.println("wi5 equal wi6");
		}
		
		/**********유용한 메쏘드************/
		//기본형 --> Wrapper
		boolean flag = true;
		Boolean bw1 = new Boolean("true");
		boolean b1 = Boolean.parseBoolean("true");
		
		Integer wi7 = 10;
		Integer wi8 = new Integer("34423");
		int i1 = Integer.parseInt("5645634");
		System.out.println(i1);
		
		int i2 = 2415464;
		String bs = Integer.toBinaryString(i2);
		System.out.println(bs);
		Double wd = new Double("4532.4346546");
		double d1 = wd.doubleValue();
		double d2 = Double.parseDouble("3.14159");
		String numStr = 3.14159+"";
		//"3.14159"
		//Character
		
		Character cw = new Character('김');
		char c1 = cw.charValue();
		char[] ca = {'A','a','*','5','7',' ','$',')'};
		for (int i = 0; i < ca.length; i++) {
			int type = Character.getType(ca[i]);
			if(type==Character.CURRENCY_SYMBOL){
				System.out.println(ca[i]);
			}
			System.out.println(">>>>type" + type);
			if(Character.isAlphabetic(ca[i])){
				System.out.println("isAlphavetic : " + ca[i]);
			}
			if(Character.isDigit(ca[i])){
				System.out.println("isDigit : " + ca[i]);
			}
			if(Character.isUpperCase(ca[i])){
				System.out.println("isUpperCase : " + ca[i]);
			}
			if(Character.isSpaceChar(ca[i])){
				System.out.println("isSpaceChar" + ca[i]);
			}
		}

	}

}
