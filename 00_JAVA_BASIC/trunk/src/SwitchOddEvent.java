
public class SwitchOddEvent {

	public static void main(String[] args) {
		int number = 34;
		int temp_number = number % 2;
		String msg = "";
		switch (temp_number) {
		case 0:
			msg="¦��";
			break;
		case 1:
			msg="Ȧ��";
			break;
		}
		System.out.println(number + "��" + msg + " �Դϴ�.");

	}

}
