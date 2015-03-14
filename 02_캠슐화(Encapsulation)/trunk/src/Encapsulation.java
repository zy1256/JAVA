
	/* OOP 의 방법 
	 *   1. 캡슐화
	 *   2. 상속성
	 *   3. 다형성(오버로딩,오바라이딩,객체형변환)
	 */

	/*
	 * 1. 캡슐화
	 *    - 외부클래스(객체)에서 멤버변수에 접근을 막고
	 *      멤버 메쏘드에만 접근할수있도록 클래스를 설계하는방법
	 *    - 구현 : 멤버변수 의 접근제한자를 private 
	 *    		   멤버메쏘드의 접근제한자는 public 으로한다. 
	 *             public ==> 어떤 외부클래스에서든지 접근가능
	 *             private==> 어떤 외부클래스에서든지 접근불가능
	 */
public class Encapsulation {
		private int member1;
		private String member2;
		private char member3;
		//setter 
		public void setMember1(int member1){
			this.member1 = member1;
		}
		public void setMember2(String member2) {
			this.member2 = member2;
		}
		public void setMember3(char member3) {
			this.member3 = member3;
		}
		//getter
		public int getMember1(){
			return this.member1;
		}
		public String getMember2() {
			return this.member2;
		}
		public char getMember3() {
			return this.member3;
		}
		
}
