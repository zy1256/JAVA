
public class ForNexted {

	public static void main(String[] args) {

		/* 
		  �ڡڡڡڡ� 
		  �ڡڡڡڡ� 
		  �ڡڡڡڡ� 
		  �ڡڡڡڡ� 
		  �ڡڡڡڡ�
		 */
		
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 0; j < 5 ; j++){
			System.out.print('��');
			}
			System.out.println();
		}
		
		System.out.println("1.--");
		
		/*
		�١ڡڡڡ�
		�ڡ١ڡڡ�
		�ڡڡ١ڡ�
		�ڡڡڡ١�
		�ڡڡڡڡ�
		*/

		for (int i = 0 ; i < 5 ; i++){
			for (int j = 0; j < 5 ; j++){
				if(i == j){
					System.out.print('��');
				}else{
					System.out.print('��');
				}
			}
			System.out.println();
		}

		System.out.println("2.--");
		/*
		��
		�ڡ�
		�ڡڡ�
		�ڡڡڡ�
		�ڡڡڡڡ�
		*/
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 0; j < 5 ; j++){
				if(i >= j){
					System.out.print("��");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("3.--");
		/*
		�ڡڡڡڡ�
		�ڡڡڡ�
		�ڡڡ�
		�ڡ�
		��
		*/
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 5; j > 0 ; j--){
				if(i < j){
					System.out.print("��");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("4.--");
		/*
		�١١١١�
		�١١١ڡ�
		�١١ڡڡ�
		�١ڡڡڡ�
		�ڡڡڡڡ�
		*/
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 4; j >= 0 ; j--){
				if(i < j){
					System.out.print("��");
				}else{
					System.out.print("��");
				}
			}
			System.out.println();
		}
		
		/*
		�ڡڡڡڡ�
		  �ڡڡڡ�
		    �ڡڡ�
		      �ڡ�
		        ��
		*/
		System.out.println("5.--");
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 0; j < 5 ; j++){
				if(i <= j){
					System.out.print("��");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
