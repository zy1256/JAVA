
public class VariableTypes {

	public static void main(String[] args) {
		
		//����(������:true,false)
		boolean bool1;
		boolean bool2;
		bool1 = true;
		bool2 = false;
		
		
		//������ (����Ÿ: 'A' , 'b' , '��' , '�d')
		System.out.println("------------������-----------");
		char munja1, munja2, munja3, munja4,munja5,munja6;
		munja1 = 'A';
		munja2 = 'B';
		munja3 = '��';
		munja4 = '�d';
		munja5 = 65;
		munja6 = 45123;
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		
		
		//������
		//������(������:12,3,4,1234)
		byte b;
		short s;
		int i;
		long l;
		
		b = 127;
		s = 32767;
		i = 2147483647;
		l = 2147483648L;

		//�Ǽ���(����Ÿ: 0,1,10.0,10, 3.14159)
		float f;
		double d;
		
		f = 1.0f;
		d = 1.0;
		
		
		//���ڿ���(��ü��)
		
		String str1,str2;
		str1="�ڹٹ� ȭ����!!";
		str2="������!!";
		
		String str3 = str1+str2;
		System.out.println(str3);
		
	}

}
