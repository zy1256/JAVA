/*
		����ȯ(Casting)--> ����������Ÿ������ ����
			- ���� :  (����ŸŸ��)����or����Ÿ(���ͷ�);
		    - �ڵ�����ȯ(��������Ÿ-->ū����Ÿ)upcasting
			     byte-->short-->int-->long-->float-->double
			- ��������ȯ(ū����Ÿ-->��������Ÿ)downcasting
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
		
		//�ڵ�����ȯ(��������Ÿ-->ū����Ÿ)upcasting
		double d1 = i;
		d1=b;
		d1=s;
		
		//��������ȯ(ū����Ÿ-->��������Ÿ)downcasting
		int i1 = (int)d;
		System.out.println("i1=1" + i1);

		//������� ����ȯ
		double d2 = b+s+i+l+f+d;
		System.out.println(d2);		
		
		//byte, short ����(������� int casting ����  ����)
		int i2 = b+s;
		System.out.println(i2);
		
		char c1 = '��';
		System.out.println(c1);
		int i3 = c1;
		System.out.println(i3);
		
		char c2 = 'A' + 1;
		System.out.println(c2);
		
		int i4 = 44608;
		char c3 = (char)i4;
		
		
	}

}
