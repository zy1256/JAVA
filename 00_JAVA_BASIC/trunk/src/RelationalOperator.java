/*
 ����(��)����
     - ����:  >,<,>=,<=,==,!=
     - ���迬���� ������� ���� ����Ÿ�̴�(true,false)
 */
public class RelationalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean result;
		
		result = a > b;
		System.out.println("10>20 = " + result);
		result = a < b;
		System.out.println("10<20 = " + result);
		result = a >= b;
		System.out.println("10>=20 = " + result);
		result = a <= b;
		System.out.println("10<=20 = " + result);
		result = a == b;
		System.out.println("10=20 = " + result);
		result = a != b;
		System.out.println("10!=20 = " + result);
	}

}
