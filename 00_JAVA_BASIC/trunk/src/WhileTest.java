/*
�ݺ���
     stmt1;
     while(���ǹ�){
		 //���ǹ�--> ��������Ÿ�� ��ȯ�ϴ� �� 
		stmt2;
	 }
	 stmt3;
     
	 �帧  stmt1 -->���ǽ��� ����Ÿ�� true�ε��Ƚ���--> stmt3

*/
public class WhileTest {

	public static void main(String[] args) {
		System.out.println("stmt0");
		/*
		while(true){
			System.out.println("stmt1");
		}
		*/
		System.out.println("1----------------------------");
		int i=0;
		boolean isAlive = true;
		while (isAlive){
			System.out.println("i = " + i);
			i++;
			if( i == 10 ){
				isAlive = false;
			}
			System.out.println("i����Ľ����ڵ�");
		}

		System.out.println("2----------------------------");
		i=0;
		while(true){
			System.out.println("i=" + i);
			i++;
			if(i==10){
				break;
			}
			System.out.println("i����Ľ����ڵ�");
		}

		System.out.println("3----------------------------");
		i=0;
		while(i<10){
			System.out.println("i=" +i);
			i++;
		}
		
		System.out.println("stmt99");

	}

}
