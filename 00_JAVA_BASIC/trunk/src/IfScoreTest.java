
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

public class IfScoreTest 
{
	public static void main(String[] args) 
	{
		int kor,eng,math;
		kor=85;
		eng=63;
		math=82;

		if(kor<0 || kor>100 || eng<0 || eng>100 || math<0 || math>100){
			System.out.println(" ��ȿ�� ������ �ƴմϴ�. ");
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
		
		System.out.println("����: " + kor);
		System.out.println("����: " + eng);
		System.out.println("����: " + math);
		System.out.println("����: " + score);
		System.out.println("���: " + ave);
		System.out.println("����: " + grade);
		return;
		
	}
}
