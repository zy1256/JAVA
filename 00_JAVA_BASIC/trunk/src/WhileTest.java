/*
반복문
     stmt1;
     while(조건문){
		 //조건문--> 논리형데이타를 반환하는 식 
		stmt2;
	 }
	 stmt3;
     
	 흐름  stmt1 -->조건식의 데이타가 true인동안실행--> stmt3

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
			System.out.println("i출력후실행코드");
		}

		System.out.println("2----------------------------");
		i=0;
		while(true){
			System.out.println("i=" + i);
			i++;
			if(i==10){
				break;
			}
			System.out.println("i출력후실행코드");
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
