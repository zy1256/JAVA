
public class MemberMethodMain {

	public static void main(String[] args) {
		MemberMethod mm = new MemberMethod(); //
		/*
		 ���� public void method1(){
		 */
		/*
		 ȣ��(����)
		 */
		mm.method1();
		
		/*
		 ���� public String method2(String str){
		 */
		/*
		 * ȣ��(����)
		 */
		String msg = mm.method2("KIM");
		System.out.println(msg);
		
		/*
		 ���� : public int method3(int a,int b){
		 */
		int r = mm.method3(23, 45);
		System.out.println(r);
		

	}

}
