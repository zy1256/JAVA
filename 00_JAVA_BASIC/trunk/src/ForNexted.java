
public class ForNexted {

	public static void main(String[] args) {

		/* 
		  ¡Ú¡Ú¡Ú¡Ú¡Ú 
		  ¡Ú¡Ú¡Ú¡Ú¡Ú 
		  ¡Ú¡Ú¡Ú¡Ú¡Ú 
		  ¡Ú¡Ú¡Ú¡Ú¡Ú 
		  ¡Ú¡Ú¡Ú¡Ú¡Ú
		 */
		
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 0; j < 5 ; j++){
			System.out.print('¡Ú');
			}
			System.out.println();
		}
		
		System.out.println("1.--");
		
		/*
		¡Ù¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ù¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ù¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ù¡Ú
		¡Ú¡Ú¡Ú¡Ú¡Ù
		*/

		for (int i = 0 ; i < 5 ; i++){
			for (int j = 0; j < 5 ; j++){
				if(i == j){
					System.out.print('¡Ù');
				}else{
					System.out.print('¡Ú');
				}
			}
			System.out.println();
		}

		System.out.println("2.--");
		/*
		¡Ú
		¡Ú¡Ú
		¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú¡Ú
		*/
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 0; j < 5 ; j++){
				if(i >= j){
					System.out.print("¡Ú");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("3.--");
		/*
		¡Ú¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú
		¡Ú¡Ú
		¡Ú
		*/
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 5; j > 0 ; j--){
				if(i < j){
					System.out.print("¡Ú");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("4.--");
		/*
		¡Ù¡Ù¡Ù¡Ù¡Ú
		¡Ù¡Ù¡Ù¡Ú¡Ú
		¡Ù¡Ù¡Ú¡Ú¡Ú
		¡Ù¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú¡Ú
		*/
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 4; j >= 0 ; j--){
				if(i < j){
					System.out.print("¡Ú");
				}else{
					System.out.print("¡Ù");
				}
			}
			System.out.println();
		}
		
		/*
		¡Ú¡Ú¡Ú¡Ú¡Ú
		  ¡Ú¡Ú¡Ú¡Ú
		    ¡Ú¡Ú¡Ú
		      ¡Ú¡Ú
		        ¡Ú
		*/
		System.out.println("5.--");
		for (int i = 0 ; i < 5 ; i++){
			for (int j = 0; j < 5 ; j++){
				if(i <= j){
					System.out.print("¡Ú");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
