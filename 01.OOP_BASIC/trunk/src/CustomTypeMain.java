
public class CustomTypeMain {
	
	public static void main(String[] args){		
		int i;
		i = 900;
		//클래스타입(참조타입) 변수 선언
		CustomType cr; 
		//글래스로 객체를 찍어낸다
		cr = new CustomType(); 
		
		cr.member1 = 123;
		cr.member2 = "문자열";
		cr.member3 = 'A';
		cr.member4 = true;
		
		System.out.println(cr.member1);
		System.out.println(cr.member2);
		System.out.println(cr.member3);
		System.out.println(cr.member4);
				
	}

}
