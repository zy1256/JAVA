public class WhileNexted {

	public static void main(String[] args) {

		/* 
		  ¡Ú¡Ú¡Ú¡Ú¡Ú 
		  ¡Ú¡Ú¡Ú¡Ú¡Ú 
		  ¡Ú¡Ú¡Ú¡Ú¡Ú 
		  ¡Ú¡Ú¡Ú¡Ú¡Ú 
		  ¡Ú¡Ú¡Ú¡Ú¡Ú
		*/
		
		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.print("¡Ú["+i+","+j+"]");
				j++;
			}// inner while
			System.out.println("");
			i++;
		} // outer while.

		/* 
		  ¡Ù¡Ú¡Ú¡Ú¡Ú 
		  ¡Ú¡Ù¡Ú¡Ú¡Ú 
		  ¡Ú¡Ú¡Ù¡Ú¡Ú 
		  ¡Ú¡Ú¡Ú¡Ù¡Ú 
		  ¡Ú¡Ú¡Ú¡Ú¡Ù
		 */

		System.out.println("¡Û---------------------");
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if(i!=j){
				System.out.print("¡Ú");
				}else{
				System.out.print("¡Ù");
				}
				j++;
			}// inner while
			System.out.println("");
			i++;
		} // outer while.

		System.out.println("¡Û---------------------");

		/*
		¡Ú¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú
		¡Ú¡Ú
		¡Ú
		*/
		i = 5;
		while (i > 0) {
			int j = 0;
			while (j < 5) {
				if(i>j){
				System.out.print("¡Ú");
				}else{
				System.out.print("  ");
				}
				j++;
			}// inner while
			System.out.println("");
			i--;
		} // outer while.


		System.out.println("¡Û---------------------");

		/*
		¡Ù¡Ù¡Ù¡Ù¡Ú
		¡Ù¡Ù¡Ù¡Ú¡Ú
		¡Ù¡Ù¡Ú¡Ú¡Ú
		¡Ù¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú¡Ú
		*/
		i = 4;
		while (i >= 0) {
			int j = 0;
			while (j < 5) {
				if(i<=j){
				System.out.print("¡Ú");
				}else{
				System.out.print("¡Ù");
				}
				j++;
			}// inner while
			System.out.println("");
			i--;
		} // outer while.


		/*
		¡Ú
		¡Ú¡Ú
		¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú¡Ú
		*/
		System.out.println("¡Û---------------------");

		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if(i>=j){
				System.out.print("¡Ú");
				}else{
				System.out.print("  ");
				}
				j++;
			}// inner while
			System.out.println("");
			i++;
		} // outer while.

		System.out.println("¡Û---------------------");

		/*
		¡Ú¡Ú¡Ú¡Ú¡Ú
		  ¡Ú¡Ú¡Ú¡Ú
		    ¡Ú¡Ú¡Ú
		      ¡Ú¡Ú
		        ¡Ú
		 */
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if(i==j || i<j){
				System.out.print("¡Ú");
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
