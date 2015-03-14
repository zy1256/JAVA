
public class Second {
	public void second() throws Exception{
		System.out.println("Second.second()실행");
		Third t=new Third();
		t.third();
		System.out.println("Second.second()반환");
	}
}
