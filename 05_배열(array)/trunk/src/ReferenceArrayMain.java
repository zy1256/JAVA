
public class ReferenceArrayMain {

	public static void main(String[] args) {
		int[] ia = new int[5];
		//������ 1���� �迭
		//Account acc1 = new Account();
		
		Account[] accountArray = new Account[5];
		
		accountArray[0] = new Account("5555", "KIM", 53000, 2.8f);
		accountArray[1] = new Account("4444", "LEE", 80000, 5.7f);
		accountArray[2] = new Account("3333", "PARK", 45000, 4.8f);
		accountArray[3] = new Account("2222", "CHOI", 100000, 1.2f);
		accountArray[4] = new Account("1111", "SIM", 5000, 3.5f);
		
		System.out.println("1.��ü�������");
		
		accountArray[0].headerPrint();
		
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i].print();
		}
		
		Member[] members={
					new Member(1,"��"),
					new Member(2,"��"),
					new Member(3,"��"),
					new Member(4,"��"),
					new Member(5,"��"),
					new Member(6,"��"),
					new Member(7,"��"),
					new Member(8,"��"),
					new Member(9,"��"),
					new Member(10,"��"),
				};
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i].no + "," + members[i].name);
		}
		
	}

}
