public class WhileNexted {

	public static void main(String[] args) {

		/* 
		  �ڡڡڡڡ� 
		  �ڡڡڡڡ� 
		  �ڡڡڡڡ� 
		  �ڡڡڡڡ� 
		  �ڡڡڡڡ�
		*/
		
		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.print("��["+i+","+j+"]");
				j++;
			}// inner while
			System.out.println("");
			i++;
		} // outer while.

		/* 
		  �١ڡڡڡ� 
		  �ڡ١ڡڡ� 
		  �ڡڡ١ڡ� 
		  �ڡڡڡ١� 
		  �ڡڡڡڡ�
		 */

		System.out.println("��---------------------");
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if(i!=j){
				System.out.print("��");
				}else{
				System.out.print("��");
				}
				j++;
			}// inner while
			System.out.println("");
			i++;
		} // outer while.

		System.out.println("��---------------------");

		/*
		�ڡڡڡڡ�
		�ڡڡڡ�
		�ڡڡ�
		�ڡ�
		��
		*/
		i = 5;
		while (i > 0) {
			int j = 0;
			while (j < 5) {
				if(i>j){
				System.out.print("��");
				}else{
				System.out.print("  ");
				}
				j++;
			}// inner while
			System.out.println("");
			i--;
		} // outer while.


		System.out.println("��---------------------");

		/*
		�١١١١�
		�١١١ڡ�
		�١١ڡڡ�
		�١ڡڡڡ�
		�ڡڡڡڡ�
		*/
		i = 4;
		while (i >= 0) {
			int j = 0;
			while (j < 5) {
				if(i<=j){
				System.out.print("��");
				}else{
				System.out.print("��");
				}
				j++;
			}// inner while
			System.out.println("");
			i--;
		} // outer while.


		/*
		��
		�ڡ�
		�ڡڡ�
		�ڡڡڡ�
		�ڡڡڡڡ�
		*/
		System.out.println("��---------------------");

		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if(i>=j){
				System.out.print("��");
				}else{
				System.out.print("  ");
				}
				j++;
			}// inner while
			System.out.println("");
			i++;
		} // outer while.

		System.out.println("��---------------------");

		/*
		�ڡڡڡڡ�
		  �ڡڡڡ�
		    �ڡڡ�
		      �ڡ�
		        ��
		 */
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if(i==j || i<j){
				System.out.print("��");
				}else{
				System.out.print("  ");
				}
				j++;
			}// inner while
			System.out.println("");
			i++;
		} // outer while.

	}

}
