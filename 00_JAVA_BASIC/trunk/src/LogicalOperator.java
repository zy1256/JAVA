/*
		��������
		   - ����:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - �¿��������� ��������Ÿ�̴�.
           - ����� ��������Ÿ�̴�.
		    ex> true || false, false && false
		*/
public class LogicalOperator {

	public static void main(String[] args) {
		
		boolean b1 = false;
		boolean b2 = false;
		
		/*
		 * LOGICAL OR(����) ||
		 */
		boolean result = b1 || b2;
		System.out.println("false || false = " + result);
		/*
		 * LOGICAL AND (����) &&
		 */
		b1=true;
		b2=true;
		result = b1 && b2;
		System.out.println("true && true = " + result);
		
		int kor = 88;
		boolean isValid;
		isValid = (kor >= 0) && (kor<=100);
		System.out.println(kor + "�� ��ȿ�������ΰ���" + isValid);
		
		int age = 23;
		char gender = 'F';
		boolean isPass;
		isPass = !((age >= 30) || (gender == 'M'));
		System.out.println("30�������̰ų� �����ΰ�� ����Ұ�" + isPass);
		
		boolean isTurn =false;
		System.out.println("1. "+isTurn);
		isTurn = !isTurn;
		System.out.println("2. !(false)-->"+isTurn);
		isTurn = !isTurn;
		System.out.println("3. !(true)-->"+isTurn);
		
	}

}
