
public class IfNexted {

	public static void main(String[] args) {
		
		int jumsu = 69;
		
		if(jumsu<0 || jumsu>100){
			System.out.println(" 유효한 점수가 아닙니다. ");
			return;
		}
		System.out.println("평점계산");
		
		char grade =' ';
		if( jumsu >= 90 ){
			grade='A';
		}else{
			if( jumsu>=80 ){
				grade='B';
			}else{
				if ( jumsu>=70 ){
					grade='C';
				}else{
					if (jumsu>=60){
						grade='D';
					}else{
						grade='F';
					}
				}
			}
		}
		System.out.println("1. 당신의 평점은 " + grade + " 입니다.");
		
		grade= ' ';
		if(jumsu>=90){
			grade='A';
		}else if(jumsu>=80){
			grade='B';
		}else if(jumsu>=70){
			grade='C';
		}else if(jumsu>=60){
			grade='D';
		}else{
			grade='F';
		}
		System.out.println("1. 당신의 평점은 " + grade + " 입니다.");
		
		return;

	}

}
