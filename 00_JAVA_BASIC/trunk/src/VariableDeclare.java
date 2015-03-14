		/*
		변수의선언
          - 의미:JVM 에게메모리를할당해달라고
                                요청하는작업
		  - 형태:
		        데이타타입 이름;
		         ex> int number;

		  - 변수식별자규직(클래스이름,변수이름,메쏘드이름)
			   - 영문이나,한글로시작
			   - 특수문자사용불가(_,$)
			   - 키워드 사용금지
		*/

public class VariableDeclare {

	public static void main(String[] args) {
		// 단문주석
		/*
		 장문주석1
		 장문주석2
		 */
		int score;
		score = 100;
		
		int score1 = 200;
		
		int _score = 300;
		
		//int 2score = 400;
		
		int 스코어 = 500;
		
		System.out.println("score = " + score);
		System.out.println("score = " + score1);
		System.out.println("score = " + _score);
		System.out.println("score = " + 스코어);
		// 1 line copy(ctrl+alt+down arrow)
	}

}
