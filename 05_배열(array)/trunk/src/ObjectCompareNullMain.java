
public class ObjectCompareNullMain {

	public static void main(String[] args) {

		/*
		 * 기본형비교
		 */
		int a = 3;
		if(a==3){
			System.out.println("3 == 3");
		}
		if(a < 5){
			System.out.println(" 3 < 5");
		}
		/*
		 * 객체(주소)비교
		 */
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = acc1;
		
		if(acc1 == acc2){
			System.out.println(acc1 + "==" + acc2);
		}else{
			System.out.println(acc1 + "!=" + acc2);
		}
		if(acc1 == acc3){
			System.out.println(acc1 + "==" + acc3 );
		}else{
			System.out.println(acc1 + "!=" + acc3);			
		}
		
		/*
		 * String 객체비교
		 */
		String str1 = "자바";
		String str2 = new String("자바");
		System.out.println("---------------------");
		if(str1==str2){
			System.out.println("String : str1 == str2" );
		}else{
			System.out.println("String : str1 != str2" );
		}
		System.out.println("---------------------");
		if(str1=="자바"){
			System.out.println("String : str1 == str2" );
		}else{
			System.out.println("String : str1 != str2" );
		}
		System.out.println("---------------------");
		/*
		 * String객체 값비교(주소 비교는 존재하지 않음)
		 */
		
		/*
		 * 원형 : public boolean equals(String str);
		 * 		  문자열의값비교
		 */
		
		boolean isSame = str1.equals(str2);
		System.out.println(isSame);
		if("자바".equals(str1)){
			System.out.println("\"자바\".equals(str1)");
		}
		if(str1.equals(str2)){
			System.out.println("str1.equals(str2)");
		}
		if(str2.equals("자바")){
			System.out.println("str2.equals(\"자바\")");
		}
		
		System.out.println("--------------null--------------");
		/*
		 * null
		 * 	- 참조형리터럴
		 *  - 주소없다 값
		 */
		//The local variable i may not have been initialized
		//int i;
		//int r=i+9;
		Account acc4 = null;
		if(acc4==null){
			acc4=new Account("999", "KIM", 15200, 5.6f);
		}
		acc4.print();
		if(acc4!=null){
			acc4=null;
		}
		
		
		
	}

}
