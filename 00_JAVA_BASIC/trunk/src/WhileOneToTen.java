
public class WhileOneToTen {

	public static void main(String[] args) {
		
		int i=0;
		System.out.println("1~10");
		while (i<10) {
			System.out.print(i+1+",");
			i++;
		}
		System.out.println();
		System.out.println("1~10 ������Ȧ��");
		i=0;
		int tot=0;
		while (i<10){
			int temp= i+1;
			if(temp%2==1){
				System.out.print(temp + ",");
				tot += temp;
			}
			i++;
		}
		System.out.println("Ȧ����:" + tot);
		System.out.println();
		System.out.println("4. ���ĺ��빮�����");
		
		char c='A';
		int count = 0;
		while ( c <= 'Z' ) {
			System.out.print(c + " ");
			count++;
			if (count%4==0){
				System.out.println();
			}
			c++;
		}
		

	}

}
