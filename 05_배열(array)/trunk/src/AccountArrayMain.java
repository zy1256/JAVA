
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
		 *  1. 전체계좌출력
		 *  2. 총잔고
		 *  3. 총계좌수
		 *  4. 계좌번호가 1111출력
		 *  5. 이름이 KIM인계좌출력
		 *  6. 계좌잔고 50000 이상인계좌출력
		 *  7. 이율이 8.0 이상인계좌출력
		 *  8. 입금:3333 번계좌에 3000워입금
		 *  9. 출름:9999 번계좌에서 10000원출금
		 *  10.계좌정보변경 : 3000번계좌 이율 10.F.
		 */
		
		System.out.println("1. 전체계좌출력");
		accounts[0].headerPrint();
		int tot=0;
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
			tot += accounts[i].getBalance();
			
		}
		System.out.println("2. 총잔고 : " + tot);
		System.out.println("3. 총계좌수 : " + accounts.length);
		System.out.println("4. 계좌번호가 6666출력");
		for (int i = 0; i < accounts.length; i++) {
			String tempNo = accounts[i].getNo();
			if (tempNo.equals("6666")){
				accounts[i].print();
				break;
			}
		}
		System.out.println("5. 이름이 KIM인계좌들출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner().equals("KIM")){
				accounts[i].print();
			}
		}
		System.out.println("6. 계좌잔고 50000 이상인계좌들출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>50000){
				accounts[i].print();
			}
		}
		System.out.println("7. 이율이 8.0 이상인계좌들출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>8.0f){
				accounts[i].print();
			}
		}
		System.out.println("8. 입금:3333 번계좌에 3000원입금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals("3333")){
				accounts[i].print();
				accounts[i].ipGum(3000);
				accounts[i].print();
			}
		}
		System.out.println("9. 출금:9999 번계좌에서 10000원출금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals("9999")){
				accounts[i].chulGum(10000);
				accounts[i].print();
			}
		}
		System.out.println("10.계좌정보변경 : 3000번계좌 이율 5.0F");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals("3000")){
				accounts[i].print();
				accounts[i].setIyul(5.0f);
				accounts[i].print();
			}
		}
		
		
	}

}
