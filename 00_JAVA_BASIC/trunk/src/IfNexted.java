
public class IfNexted {

	public static void main(String[] args) {
		
		int jumsu = 69;
		
		if(jumsu<0 || jumsu>100){
			System.out.println(" ��ȿ�� ������ �ƴմϴ�. ");
			return;
		}
		System.out.println("�������");
		
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
		System.out.println("1. ����� ������ " + grade + " �Դϴ�.");
		
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
		System.out.println("1. ����� ������ " + grade + " �Դϴ�.");
		
		return;

	}

}
