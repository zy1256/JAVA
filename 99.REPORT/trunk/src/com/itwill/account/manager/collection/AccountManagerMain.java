package com.itwill.account.manager.collection;

public class AccountManagerMain {

	public static void main(String[] args) {
		AccountManagerCollection accountManager=new AccountManagerCollection();
		System.out.println("1.AccountManager야 전체계좌출력");
		accountManager.print();
		
		System.out.println("2.AccountManager야 총잔고 주세요");
		int totBalance=accountManager.getTotalBalance();
		System.out.println("총잔고:"+ totBalance);
		
		System.out.println("3.AccountManager야 총계좌수 주세요:");
		int allAccountCount = accountManager.allAccountCount();
		System.out.println("총계좌수 : " + allAccountCount);
		
		System.out.println("4.AccountManager야 계좌번호줄께(6666) 계좌객체 주소주세요(1개)");
		Account findAccount= accountManager.findByAccountNo("6666");
		//accountManager.findByAccountNo("2222");
		findAccount.headerPrint();
		findAccount.print();
		
		System.out.println("5.AccountManager야 이름이 KIM 인계좌들 주세요");
		Account[] findAccounts=accountManager.findByAccountName("KIM");
		findAccounts[0].headerPrint();
		for (int i = 0; i < findAccounts.length; i++) {
			findAccounts[i].print();
		}
		
		System.out.println("6.AccountManager야 계좌잔고 50000 이상인계좌들 주세요");
		Account[] findBalance = accountManager.findByAccountBalance(50000);
		//findBalance[0].headerPrint();
		for (int i = 0; i < findBalance.length; i++) {
			findBalance[i].print();
		}
		System.out.println("7.AccountManager야 이율이 8.0 이상인계좌들 주세요");
		Account[] findIyul = accountManager.findByIyul(8.0f);
		findIyul[0].headerPrint();
		for (int i = 0; i < findIyul.length; i++) {
			findIyul[i].print();
		}
		
		System.out.println("8.AccountManager야 입금:3333번계좌에 3000원입금해주세요");
		Account depositBalance = accountManager.depositByBalance("3333",3000);
		depositBalance.headerPrint();
		depositBalance.print();
		
		System.out.println("9.AccountManager야 출금:9999번계좌에서 10000원출금해주세요");
		Account withdrawBalance = accountManager.withdrawBalance("9999",10000);
		withdrawBalance.headerPrint();
		withdrawBalance.print();
		
		System.out.println("10.AccountManager야 계좌정보변경: 3000번계좌 이율 5.0로변경해주세요");
		Account changeIyul = accountManager.changeIyul("3000",5.0f);
		changeIyul.headerPrint();
		changeIyul.print();
		
	}
}
