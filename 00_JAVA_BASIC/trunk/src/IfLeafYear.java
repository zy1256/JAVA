
public class IfLeafYear {

	public static void main(String[] args) {
		// 연도를 입력받아서 윤년여부 출력
		int year =2012;
		if (((year%4==0) && !(year %100 ==0)) || year% 400 ==0){
			System.out.println(year + " 는 윤년 입니다.");
		}else{
			System.out.println(year + " 는 윤년 아닙니다.");
		}

	}

}
