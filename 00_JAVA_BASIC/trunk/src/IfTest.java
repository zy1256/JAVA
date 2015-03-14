/*
제어문
   1. if 문
       -형식 : 
	      stmt0;
		  if(조건문 ){
		      //조건문 -->   논리형데이타가 반환되는 연산 
			  //                   혹은 논리형데이타(리터럴),변수
			  stmt1;
		   }else{
		      stmt2;
		   }
		   stmt3;

		   조건데이타가 true인경우  stmt0-->stmt1-->stmt3;
		   조건데이타가 false인경우  stmt0-->stmt2-->stmt3;


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
			System.out.println("논리형상수 : " + true);
		}
		if(false){
			System.out.println("논리형상수 : " + false);
		}
		
	}

}
