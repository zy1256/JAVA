/*
���
   1. if ��
       -���� : 
	      stmt0;
		  if(���ǹ� ){
		      //���ǹ� -->   ��������Ÿ�� ��ȯ�Ǵ� ���� 
			  //                   Ȥ�� ��������Ÿ(���ͷ�),����
			  stmt1;
		   }else{
		      stmt2;
		   }
		   stmt3;

		   ���ǵ���Ÿ�� true�ΰ��  stmt0-->stmt1-->stmt3;
		   ���ǵ���Ÿ�� false�ΰ��  stmt0-->stmt2-->stmt3;


 */
public class IfTest {

	public static void main(String[] args) {
		int x = 60;
		int y = 30;
		System.out.println("stmt01");
		if( x > y ){
			System.out.println("20 > 30");
		}else{
			System.out.println("20 <= 30");
		}
		System.out.println("stmt02");
		
		if( x!=y ){
			System.out.println("20 != 30");
		}
		System.out.println("stmt03");
		
		if( x==y )
			System.out.println("20 == 30");
		else
			System.out.println("20 != 30");
		System.out.println("stmt04");

		if(x<=y)
			System.out.println("20 <= 30");
		System.out.println("stmt05");
		
		boolean condition = true;
		if(condition){
			System.out.println("condition :" + condition);
		}
		if(true){
			System.out.println("������� : " + true);
		}
		if(false){
			System.out.println("������� : " + false);
		}
		
	}

}
