
public class AccountConstructorMain {

	public static void main(String[] args) {
		
		Account acc1 = new Account ("1111", "KIM" , 56000, 3.4f);
		Account acc2 = new Account ("1211", "LEE" , 67000, 2.4f);
		Account acc3 = new Account ("1131", "PARK" , 46000, 1.3f);
		Account acc4 = new Account ("1114", "CHOI" , 100000, 3.6f);
		Account acc5 = new Account ("5111", "SIM" , 90000, 7.8f);
		
		acc1.ipGum(1000);
		acc2.ipGum(1000);
		acc3.ipGum(1000);
		acc4.ipGum(1000);
		acc5.ipGum(1000);
		
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		acc4.print();
		acc5.print();

	}

}
