 /*
		switch 문
		 - 형식
		    switch(변수){
		    	case 값_1:
		    	  stmt1;
		    	  break;
		    	case 값_2:
		    	  stmt2;
		    	  break;  
		        case 값_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		switch(변수)  변수값은 byte,short,int char 
		              값이올수있다.(long 은안됨)
*/
public class SwitchTest {

	public static void main(String[] args) {
		/*
		 * level은 1~5 사이의 점수
		 */
		int level =10 ;
		String msg="";
		switch (level) {
		case 1:
			msg = "열실히 하세요";
			break;
		case 2:
			msg = "좀 하시네요";
			break;
		case 3:
		case 4:
		case 5:
			msg = "잘하시네요";
			break;
		default:
			msg = "레벨은 1~5 사이의 정수입니다.";
			break;
		}
		System.out.println(msg);

	}

}
