/*
		논리연산자
		   - 형태:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - 좌우측의항이 논리형데이타이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false
		*/
public class LogicalOperator {

	public static void main(String[] args) {
		
		boolean b1 = false;
		boolean b2 = false;
		
		/*
		 * LOGICAL OR(논리합) ||
		 */
		boolean result = b1 || b2;
		System.out.println("false || false = " + result);
		/*
		 * LOGICAL AND (논리합) &&
		 */
		b1=true;
		b2=true;
		result = b1 && b2;
		System.out.println("true && true = " + result);
		
		int kor = 88;
		boolean isValid;
		isValid = (kor >= 0) && (kor<=100);
		System.out.println(kor + "은 유효한점수인가요" + isValid);
		
		int age = 23;
		char gender = 'F';
		boolean isPass;
		isPass = !((age >= 30) || (gender == 'M'));
		System.out.println("30세이하이거나 남자인경우 입장불가" + isPass);
		
		boolean isTurn =false;
		System.out.println("1. "+isTurn);
		isTurn = !isTurn;
		System.out.println("2. !(false)-->"+isTurn);
		isTurn = !isTurn;
		System.out.println("3. !(true)-->"+isTurn);
		
	}

}
