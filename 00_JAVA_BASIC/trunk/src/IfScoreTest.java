
		/*
		옛날일....
		국어,영어,수학 점수를 가지고 
		총점,평균,평점(A,B,C....)을 출력하시요....
           - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요
           - 평균은 소수점이하 2자리수까지만 출력하세요
           - 출력포맷
			 
			 ************************
			 국어: 78
			 영어: 56
			 수학: 77
			 총점:256
			 평균:78.56
			 평점: C
			 ************************
		*/

public class IfScoreTest 
{
	public static void main(String[] args) 
	{
		int kor,eng,math;
		kor=85;
		eng=63;
		math=82;

		if(kor<0 || kor>100 || eng<0 || eng>100 || math<0 || math>100){
			System.out.println(" 유효한 점수가 아닙니다. ");
			return;
		}
		int score = kor + eng + math;
		
		double ave = (double)score/3;
		ave = ave*100;
		ave = (double)((int)ave);
		ave = ave /100;

		char grade = ' ';
		if (ave >= 90){
			grade = 'A';
		}else if (ave >= 80){
			grade = 'B';
		}else if (ave >= 70){
			grade = 'C';
		}else if (ave >= 60){
			grade = 'D';
		}else{
			grade = 'F';
		}
		
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + score);
		System.out.println("평균: " + ave);
		System.out.println("평점: " + grade);
		return;
		
	}
}
