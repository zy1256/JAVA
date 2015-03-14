/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
	       	//1.반복변수(선언,초기화가능)
	       	//2.반복변수의 조건검사(논리형데이타)
	       	//3.반복변수증,감(++,--)
	       	//4.문장실행
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
	       ex>무한루프
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
		System.out.println("3. 1~10사이의 정수에서 짝수 출력");
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
		System.out.println("4.  1~100 사이의 정수중 4의 배수 출력");
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

		System.out.println("5.  한글출력");
		count=0;
		for (char c = '가'; c <= '햏' ; c++){
			System.out.print(c);
			count++;
			if(count%40==0){
				System.out.println();
			}
		}
		
		

	}

}
