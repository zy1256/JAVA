/*
생성자(constructor)
1. 클래스 이름과동일하며 리턴타입을 명시하지않는 메쏘드(???)
2. 하나의 클래스에는 반드시 하나이상의 생성자가 존재하여야한다
--> 생성자를 정의하지않을경우 컴파일러는 인자가하나도없는
    생성자(디폴드 생성자)를 자동으로 넣어서 컴파일한다.    
3. 객체생성시 단한번 호출된다.
4. 주로 객체초기화의 용도로 사용한다.
5. 객체를 생성할려면 반드시 생성자를 호출하여야한다.
	
	-형태: 
	 	public class Test{
	 		//생성자의 정의(선언)
	 	    public Test(){
	 	    }
	 	}
	 	
    -사용: 
           Test t = new Test(); 
	 	   클래스명 참조변수이름 = new 클래스명();
	 	   new 라는 연산자는 반드시 생성자 앞에있어야하며
	 	   이연산자에의해 객체를 생성한다.
*/

public class Constructor {
	public int i;
	public int j;
	/*
	 * 인자가하나도 없는 생성자 --> 디폴트 생성자
	 */
	//생성자의 정의(선언)
	public Constructor(){
		System.out.println("Constructor() 실행");
		this.i=100;
		this.j=101;
	}
	public Constructor(int i){
		System.out.println("Constructor(int i) 실행 ");
		this.i=i;
		this.j=102;
	}
	public Constructor(int i , int j){
		System.out.println("Constructor(int i , int j) int");
		this.i=i;
		this.j=j;
	}
	public void print(){
		System.out.println("i=" + this.i);
		System.out.println("j=" + this.j);
	}
}
