
public class EncapsulationMain {

	public static void main(String[] args) {
		
		Encapsulation ec = new Encapsulation();
		System.out.println("---------------set----------------");
		//ec.member1=123;
		ec.setMember1(123);
		//ec.member2="¸â¹ö";
		ec.setMember2("¸â¹ö");
		//ec.member3='±è';
		ec.setMember3('±è');

		System.out.println("---------------get----------------");
		int m1=ec.getMember1();
		System.out.println("member1 : " + m1);
		System.out.println("member1 : " + ec.getMember2());
		System.out.println("member1 : " + ec.getMember2());
		
	}

}
