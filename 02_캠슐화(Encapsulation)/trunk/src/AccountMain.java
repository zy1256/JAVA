
public class AccountMain {

	public static void main(String[] args) {
		
		Account acc1 = new Account();
		acc1.setNo("1234");
		acc1.setOwner("KIM");
		acc1.setBalance(50000);
		acc1.setIyul(2.5f);
		acc1.ipGum(3000);
		Account acc2 = new Account();
		acc2.setData("3333","CHOI", 89000,2.3f);
		acc2.chulGum(4000);
		
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		
		
	}

}
