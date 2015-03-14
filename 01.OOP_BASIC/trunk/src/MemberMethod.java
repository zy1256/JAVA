
public class MemberMethod {
	
	public void method1(){
		System.out.println("MemberMethod.method1()실행");
		return;
	}
	public String method2(String str){
		System.out.println("method2()실행");
		String helloStr="안녕";
		return helloStr;
	}
	public int method3(int a,int b){
		System.out.println("method3()실행");
		int result = a+b;
		return result; 
	}

}
