
public class ObjectCompareNullMain {

	public static void main(String[] args) {

		/*
		 * �⺻����
		 */
		int a = 3;
		if(a==3){
			System.out.println("3 == 3");
		}
		if(a < 5){
			System.out.println(" 3 < 5");
		}
		/*
		 * ��ü(�ּ�)��
		 */
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = acc1;
		
		if(acc1 == acc2){
			System.out.println(acc1 + "==" + acc2);
		}else{
			System.out.println(acc1 + "!=" + acc2);
		}
		if(acc1 == acc3){
			System.out.println(acc1 + "==" + acc3 );
		}else{
			System.out.println(acc1 + "!=" + acc3);			
		}
		
		/*
		 * String ��ü��
		 */
		String str1 = "�ڹ�";
		String str2 = new String("�ڹ�");
		System.out.println("---------------------");
		if(str1==str2){
			System.out.println("String : str1 == str2" );
		}else{
			System.out.println("String : str1 != str2" );
		}
		System.out.println("---------------------");
		if(str1=="�ڹ�"){
			System.out.println("String : str1 == str2" );
		}else{
			System.out.println("String : str1 != str2" );
		}
		System.out.println("---------------------");
		/*
		 * String��ü ����(�ּ� �񱳴� �������� ����)
		 */
		
		/*
		 * ���� : public boolean equals(String str);
		 * 		  ���ڿ��ǰ���
		 */
		
		boolean isSame = str1.equals(str2);
		System.out.println(isSame);
		if("�ڹ�".equals(str1)){
			System.out.println("\"�ڹ�\".equals(str1)");
		}
		if(str1.equals(str2)){
			System.out.println("str1.equals(str2)");
		}
		if(str2.equals("�ڹ�")){
			System.out.println("str2.equals(\"�ڹ�\")");
		}
		
		System.out.println("--------------null--------------");
		/*
		 * null
		 * 	- ���������ͷ�
		 *  - �ּҾ��� ��
		 */
		//The local variable i may not have been initialized
		//int i;
		//int r=i+9;
		Account acc4 = null;
		if(acc4==null){
			acc4=new Account("999", "KIM", 15200, 5.6f);
		}
		acc4.print();
		if(acc4!=null){
			acc4=null;
		}
		
		
		
	}

}
