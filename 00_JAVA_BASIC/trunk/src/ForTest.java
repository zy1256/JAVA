/*
	for��
	     -����:
	       	       
	       for(1;2;3){
	       	//1.�ݺ�����(����,�ʱ�ȭ����)
	       	//2.�ݺ������� ���ǰ˻�(��������Ÿ)
	       	//3.�ݺ�������,��(++,--)
	       	//4.�������
	       }
	       
	       1-->
	       2(true)-->4-->3-->
	       2(true)-->4-->3-->
	       2(true)-->4-->3-->
	       2(false)
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       ex>���ѷ���
	       for(;;){
	       	
	       }
	
	*/
public class ForTest {

	public static void main(String[] args) {
		
		System.out.println("1.~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i = 0 ; i < 5 ; i++){
			System.out.println("i = " + i);
		}
		System.out.println("2.~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i = 5 ; i > 0 ; i--){
			System.out.println("i = " + i);
		}
		System.out.println("3. 1~10������ �������� ¦�� ���");
		for (int i = 0; i < 10 ; i++){
			int temp = i+1;
			if(temp%2==0){
				System.out.println(temp + "," );
			}
		}
		System.out.println("3.1 continue");
		for (int i = 0; i < 10 ; i++){
			int temp = i+1;
			if(temp%2==1){
				continue;
			}
			System.out.println(temp + "," );
		}
		System.out.println("4.  1~100 ������ ������ 4�� ��� ���");
		int count = 0;
		for (int i = 0; i < 100 ; i++){
			int temp = i+1;
			if (temp%4!=0){
				continue;
			}
			count++;
			System.out.print(temp + "\t" );
			if(count%5==0){
				System.out.println();
			}
		}

		System.out.println("5.  �ѱ����");
		count=0;
		for (char c = '��'; c <= '�d' ; c++){
			System.out.print(c);
			count++;
			if(count%40==0){
				System.out.println();
			}
		}
		
		

	}

}
