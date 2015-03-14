package com.itwill.account.manager.collection;

public class AccountManagerMain {

	public static void main(String[] args) {
		AccountManagerCollection accountManager=new AccountManagerCollection();
		System.out.println("1.AccountManager�� ��ü�������");
		accountManager.print();
		
		System.out.println("2.AccountManager�� ���ܰ� �ּ���");
		int totBalance=accountManager.getTotalBalance();
		System.out.println("���ܰ�:"+ totBalance);
		
		System.out.println("3.AccountManager�� �Ѱ��¼� �ּ���:");
		int allAccountCount = accountManager.allAccountCount();
		System.out.println("�Ѱ��¼� : " + allAccountCount);
		
		System.out.println("4.AccountManager�� ���¹�ȣ�ٲ�(6666) ���°�ü �ּ��ּ���(1��)");
		Account findAccount= accountManager.findByAccountNo("6666");
		//accountManager.findByAccountNo("2222");
		findAccount.headerPrint();
		findAccount.print();
		
		System.out.println("5.AccountManager�� �̸��� KIM �ΰ��µ� �ּ���");
		Account[] findAccounts=accountManager.findByAccountName("KIM");
		findAccounts[0].headerPrint();
		for (int i = 0; i < findAccounts.length; i++) {
			findAccounts[i].print();
		}
		
		System.out.println("6.AccountManager�� �����ܰ� 50000 �̻��ΰ��µ� �ּ���");
		Account[] findBalance = accountManager.findByAccountBalance(50000);
		//findBalance[0].headerPrint();
		for (int i = 0; i < findBalance.length; i++) {
			findBalance[i].print();
		}
		System.out.println("7.AccountManager�� ������ 8.0 �̻��ΰ��µ� �ּ���");
		Account[] findIyul = accountManager.findByIyul(8.0f);
		findIyul[0].headerPrint();
		for (int i = 0; i < findIyul.length; i++) {
			findIyul[i].print();
		}
		
		System.out.println("8.AccountManager�� �Ա�:3333�����¿� 3000���Ա����ּ���");
		Account depositBalance = accountManager.depositByBalance("3333",3000);
		depositBalance.headerPrint();
		depositBalance.print();
		
		System.out.println("9.AccountManager�� ���:9999�����¿��� 10000��������ּ���");
		Account withdrawBalance = accountManager.withdrawBalance("9999",10000);
		withdrawBalance.headerPrint();
		withdrawBalance.print();
		
		System.out.println("10.AccountManager�� ������������: 3000������ ���� 5.0�κ������ּ���");
		Account changeIyul = accountManager.changeIyul("3000",5.0f);
		changeIyul.headerPrint();
		changeIyul.print();
		
	}
}
