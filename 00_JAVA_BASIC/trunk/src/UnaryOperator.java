/*
		 ���׿�����
		     - ����,���ҿ�����
			   ex> i++ , i-- , ++i , --i 
             - �ڱ��ڽ��ǰ��� ���� 1��ŭ ������Ű�ų� ���ҽ�Ű��
			   ������
 */

public class UnaryOperator {
	public static void main(String[] args) {
		
		int i1 = 5;
		int j1 = 5;
		
		i1++; // i1=i1+1
		++j1; // j1=j1+1
		System.out.println("i1 = "+ i1);
		System.out.println("j1 = "+ j1);

		i1--; //i1=i1-1
		--j1; //j1=j1-1
		System.out.println("i1 = "+ i1);
		System.out.println("j1 = "+ j1);
		
		i1=5;
		j1=5;
		
		int result1,result2;
		
		result1 = ++i1;
		result2 = j1++;
		
		System.out.println("i1 = " + i1);
		System.out.println("j1 = " + j1);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
	}

}
