 /*
		switch ��
		 - ����
		    switch(����){
		    	case ��_1:
		    	  stmt1;
		    	  break;
		    	case ��_2:
		    	  stmt2;
		    	  break;  
		        case ��_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		switch(����)  �������� byte,short,int char 
		              ���̿ü��ִ�.(long ���ȵ�)
*/
public class SwitchTest {

	public static void main(String[] args) {
		/*
		 * level�� 1~5 ������ ����
		 */
		int level =10 ;
		String msg="";
		switch (level) {
		case 1:
			msg = "������ �ϼ���";
			break;
		case 2:
			msg = "�� �Ͻó׿�";
			break;
		case 3:
		case 4:
		case 5:
			msg = "���Ͻó׿�";
			break;
		default:
			msg = "������ 1~5 ������ �����Դϴ�.";
			break;
		}
		System.out.println(msg);

	}

}
