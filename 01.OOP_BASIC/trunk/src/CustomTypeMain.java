
public class CustomTypeMain {
	
	public static void main(String[] args){		
		int i;
		i = 900;
		//Ŭ����Ÿ��(����Ÿ��) ���� ����
		CustomType cr; 
		//�۷����� ��ü�� ����
		cr = new CustomType(); 
		
		cr.member1 = 123;
		cr.member2 = "���ڿ�";
		cr.member3 = 'A';
		cr.member4 = true;
		
		System.out.println(cr.member1);
		System.out.println(cr.member2);
		System.out.println(cr.member3);
		System.out.println(cr.member4);
				
	}

}
