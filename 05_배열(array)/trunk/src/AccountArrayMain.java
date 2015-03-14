
public class AccountArrayMain {

	public static void main(String[] args) {
		Account[] accounts ={
			new Account("1111", "KIM", 120000, 1.5f),
			new Account("2222", "LEE", 80000, 2.5f),
			new Account("3333", "PARK", 6000, 9.5f),
			new Account("4444", "MO", 50000, 4.2f),
			new Account("5555", "KIM", 161000, 10.8f),
			new Account("6666", "LEE", 125000, 3.2f),
			new Account("7777", "MOON", 25000, 9.5f),
			new Account("8888", "NAM", 45600, 6.8f),
			new Account("9999", "NA", 52000, 2.9f),
			new Account("3000", "KIM", 99000, 3.0f)
		};
		/*
		 *  1. ��ü�������
		 *  2. ���ܰ�
		 *  3. �Ѱ��¼�
		 *  4. ���¹�ȣ�� 1111���
		 *  5. �̸��� KIM�ΰ������
		 *  6. �����ܰ� 50000 �̻��ΰ������
		 *  7. ������ 8.0 �̻��ΰ������
		 *  8. �Ա�:3333 �����¿� 3000���Ա�
		 *  9. �⸧:9999 �����¿��� 10000�����
		 *  10.������������ : 3000������ ���� 10.F.
		 */
		
		System.out.println("1. ��ü�������");
		accounts[0].headerPrint();
		int tot=0;
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
			tot += accounts[i].getBalance();
			
		}
		System.out.println("2. ���ܰ� : " + tot);
		System.out.println("3. �Ѱ��¼� : " + accounts.length);
		System.out.println("4. ���¹�ȣ�� 6666���");
		for (int i = 0; i < accounts.length; i++) {
			String tempNo = accounts[i].getNo();
			if (tempNo.equals("6666")){
				accounts[i].print();
				break;
			}
		}
		System.out.println("5. �̸��� KIM�ΰ��µ����");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner().equals("KIM")){
				accounts[i].print();
			}
		}
		System.out.println("6. �����ܰ� 50000 �̻��ΰ��µ����");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>50000){
				accounts[i].print();
			}
		}
		System.out.println("7. ������ 8.0 �̻��ΰ��µ����");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>8.0f){
				accounts[i].print();
			}
		}
		System.out.println("8. �Ա�:3333 �����¿� 3000���Ա�");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals("3333")){
				accounts[i].print();
				accounts[i].ipGum(3000);
				accounts[i].print();
			}
		}
		System.out.println("9. ���:9999 �����¿��� 10000�����");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals("9999")){
				accounts[i].chulGum(10000);
				accounts[i].print();
			}
		}
		System.out.println("10.������������ : 3000������ ���� 5.0F");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals("3000")){
				accounts[i].print();
				accounts[i].setIyul(5.0f);
				accounts[i].print();
			}
		}
		
		
	}

}
