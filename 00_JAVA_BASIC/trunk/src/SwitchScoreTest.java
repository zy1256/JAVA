
		/*
		������....
		����,����,���� ������ ������ 
		����,���,����(A,B,C....)�� ����Ͻÿ�....
           - 100���� �Ѵ� ���� ������ �ԷµǸ� �޼����� ����ϼ���
           - ����� �Ҽ������� 2�ڸ��������� ����ϼ���
           - �������
			 
			 ************************
			 ����: 78
			 ����: 56
			 ����: 77
			 ����:256
			 ���:78.56
			 ����: C
			 ************************
		*/

public class SwitchScoreTest 
{
	public static void main(String[] args) 
	{
		int kor,eng,math;
		kor=92;
		eng=95;
		math=70;

		if(kor<0 || kor>100 || eng<0 || eng>100 || math<0 || math>100){
			System.out.println(" ��ȿ�� ������ �ƴմϴ�. ");
			return;
		}
		int score = kor + eng + math;
		double ave = (double)score/3;
		ave = ave*100;
		ave = (double)((int)ave);
		ave = ave /100;

		int grade = ((int)ave/10) % 10;
		char msg =' ';
		
		switch (grade) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			msg = 'F';
			break;
		case 6:
			msg = 'D';
			break;
		case 7:
			msg = 'C';
			break;
		case 8:
			msg = 'B';
			break;
		case 0:
		case 9:
			msg = 'A';
			break;
		}
		
		System.out.println("����: " + kor);
		System.out.println("����: " + eng);
		System.out.println("����: " + math);
		System.out.println("����: " + score);
		System.out.println("���: " + ave);
		System.out.println("����: " + msg);
		return;
		
	}
}
