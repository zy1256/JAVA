
public class IfLeafYear {

	public static void main(String[] args) {
		// ������ �Է¹޾Ƽ� ���⿩�� ���
		int year =2012;
		if (((year%4==0) && !(year %100 ==0)) || year% 400 ==0){
			System.out.println(year + " �� ���� �Դϴ�.");
		}else{
			System.out.println(year + " �� ���� �ƴմϴ�.");
		}

	}

}
