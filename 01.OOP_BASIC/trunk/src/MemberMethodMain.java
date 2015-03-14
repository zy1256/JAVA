
public class MemberMethodMain {

	public static void main(String[] args) {
		MemberMethod mm = new MemberMethod(); //
		/*
		 정의 public void method1(){
		 */
		/*
		 호출(실행)
		 */
		mm.method1();
		
		/*
		 정의 public String method2(String str){
		 */
		/*
		 * 호출(실행)
		 */
		String msg = mm.method2("KIM");
		System.out.println(msg);
		
		/*
		 정의 : public int method3(int a,int b){
		 */
		int r = mm.method3(23, 45);
		System.out.println(r);
		

	}

}
