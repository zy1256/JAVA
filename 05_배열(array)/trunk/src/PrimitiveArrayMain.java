/*
 	�迭:  
      - ��������Ÿ���� ���� ����(������)�������� ����Ÿ��
      - �迭������ ��������
           ����ŸŸ��[] �̸�; 
	  - ���: 
	       1.�迭��ü�ǻ���	
		   2.�迭��ü�� �ʱ�ȭ 
      -Ư¡   
		  1.��� �迭���� ������ ���������̴�.
		    (�迭�� ��ü��.)
		  2.����Ÿ�Ը� ���ǰ������ϴ� 
		  3.���̰� �����Ǿ��ִ�. 
		 
 */
public class PrimitiveArrayMain {

	public static void main(String[] args) {
		int i =400;
		//�⺻�� 1���� �迭��
		System.out.println("1. ---------------�⺻�� 1���� �迭��*****");
		int[] iArray = new int[5];
		
		for (int j = 0 ; j < iArray.length; j++){
			System.out.println(iArray[j] + ",");
		}
		System.out.println("3. ���� ������ ���");
		iArray[0] = 1;
		iArray[1] = 2;
		iArray[2] = 3;
		iArray[3] = 4;
		iArray[4] = 5;
		
		for (int k = 0; k < iArray.length; k++) {
			
		}
		
		System.out.println("iArray [0]" + iArray[0]);
		System.out.println("iArray [1]" + iArray[1]);
		System.out.println("iArray [2]" + iArray[2]);
		System.out.println("iArray [3]" + iArray[3]);
		System.out.println("iArray [4]" + iArray[4]);

		System.out.println("4. �迭�� size :" + iArray.length);
		
		for (int  j = 0 ; j < iArray.length; j++){
			System.out.println("iArray [" + j + "] =" + iArray [j]);
		}

		System.out.println("�迭�ǻ����� �ʱ�ȭ");
		int[] iArray1 = {1,2,3,4,5,6,7,8,9,10};
		for (int j = 0; j < iArray1.length; j++) {
			System.out.println(iArray1[j]+ ",");
		}
		System.out.println();
		
		char[] ca={'��','��','��','ȸ','��','��','��','��','��'};
		for (int j = 0; j < ca.length; j++) {
			System.out.print(ca[j]);
		}
		System.out.println();
		boolean[] ba={true,false,true,true,false,true};
		int correctAnswer=0;
		int inCorrectAnswer=0;
		for (int j = 0; j < ba.length; j++) {
			if (ba[j]==true) {
				correctAnswer+=1;
			}else{
				inCorrectAnswer+=1;
			}
			
		}
		System.out.println("�����" + correctAnswer);
		System.out.println("�����" + inCorrectAnswer);
		System.out.println("���׼�" + ba.length);
		
		/*
		 * Quiz �������
		 */
/*
		System.out.println();
		int[] avgArray={34,22,45,78,99,44,34,89,88,90};
		int[] rankingArray = new int [10];
		for (int j = 0; j< avgArray.length; j++){
			int ranking = 1;
			for(int k = 0; k < avgArray.length; k++){
				if(avgArray[j] < avgArray[k]){
					ranking+=1;
				}
			}
			rankingArray[j] = ranking;
			System.out.println(avgArray[j] + "-" + rankingArray[j]);
			//System.out.println(rankingArray[j] + "-" + avgArray[j]);
		}
		*/
		/*
		 * Quiz : ����(Sorting)
		 */
		int[] totArray={34,22,45,78,99,44,34,89,88,90};
		int temp = 0;
		for (int j = 0; j < totArray.length-1; j++) {
			for (int k = 0; k < totArray.length-1-i; k++) {
				if(totArray[j]>totArray[k+1]){
					temp = totArray[j];
					totArray[j] = totArray[k+1];
					totArray[k+1] = temp;
				}
			}
			
		}
		for (int j = 0; j < totArray.length; j++) {
			System.out.println(totArray[i] + ",");
		}
		
		
		
	}

}
