
public class ReferenceArrayMain {

	public static void main(String[] args) {
		int[] ia = new int[5];
		//참조형 1차원 배열
		//Account acc1 = new Account();
		
		Account[] accountArray = new Account[5];
		
		accountArray[0] = new Account("5555", "KIM", 53000, 2.8f);
		accountArray[1] = new Account("4444", "LEE", 80000, 5.7f);
		accountArray[2] = new Account("3333", "PARK", 45000, 4.8f);
		accountArray[3] = new Account("2222", "CHOI", 100000, 1.2f);
		accountArray[4] = new Account("1111", "SIM", 5000, 3.5f);
		
		System.out.println("1.전체계좌출력");
		
		accountArray[0].headerPrint();
		
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i].print();
		}
		
		Member[] members={
					new Member(1,"김"),
					new Member(2,"이"),
					new Member(3,"박"),
					new Member(4,"최"),
					new Member(5,"심"),
					new Member(6,"오"),
					new Member(7,"임"),
					new Member(8,"명"),
					new Member(9,"감"),
					new Member(10,"수"),
				};
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i].no + "," + members[i].name);
		}
		
	}

}
