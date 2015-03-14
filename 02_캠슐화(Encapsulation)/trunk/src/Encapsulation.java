
	/* OOP �� ��� 
	 *   1. ĸ��ȭ
	 *   2. ��Ӽ�
	 *   3. ������(�����ε�,���ٶ��̵�,��ü����ȯ)
	 */

	/*
	 * 1. ĸ��ȭ
	 *    - �ܺ�Ŭ����(��ü)���� ��������� ������ ����
	 *      ��� �޽�忡�� �����Ҽ��ֵ��� Ŭ������ �����ϴ¹��
	 *    - ���� : ������� �� ���������ڸ� private 
	 *    		   ����޽���� ���������ڴ� public �����Ѵ�. 
	 *             public ==> � �ܺ�Ŭ������������ ���ٰ���
	 *             private==> � �ܺ�Ŭ������������ ���ٺҰ���
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
