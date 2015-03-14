
public class SwitchOddEvent {

	public static void main(String[] args) {
		int number = 34;
		int temp_number = number % 2;
		String msg = "";
		switch (temp_number) {
		case 0:
			msg="Â¦¼ö";
			break;
		case 1:
			msg="È¦¼ö";
			break;
		}
		System.out.println(number + "´Â" + msg + " ÀÔ´Ï´Ù.");

	}

}
