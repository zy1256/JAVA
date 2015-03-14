/*
		형변환(Casting)--> 숫자형데이타간에만 가능
			- 형식 :  (데이타타입)변수or데이타(리터럴);
		    - 자동형변환(작은데이타-->큰데이타)upcasting
			     byte-->short-->int-->long-->float-->double
			- 강제형변환(큰데이타-->작은데이타)downcasting
			     double-->float-->long-->int-->short-->byte
		*/
		//upcasting(promotion)
public class CastingExam {

	public static void main(String[] args) {
		
		byte b = 12;
		short s = 20;
		int i = 300;
		long l = 900;
		
		float f = 1.14f;
		double d = 3.14159;
		
		//자동형변환(작은데이타-->큰데이타)upcasting
		double d1 = i;
		d1=b;
		d1=s;
		
		//강제형변환(큰데이타-->작은데이타)downcasting
		int i1 = (int)d;
		System.out.println("i1=1" + i1);

		//연산시의 형변환
		double d2 = b+s+i+l+f+d;
		System.out.println(d2);		
		
		//byte, short 연산(모든함이 int casting 된후  연산)
		int i2 = b+s;
		System.out.println(i2);
		
		char c1 = '김';
		System.out.println(c1);
		int i3 = c1;
		System.out.println(i3);
		
		char c2 = 'A' + 1;
		System.out.println(c2);
		
		int i4 = 44608;
		char c3 = (char)i4;
		
		
	}

}
