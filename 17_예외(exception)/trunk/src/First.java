
public class First {
	
	public void first() throws Exception{
		System.out.println("First.first()실행");
		Second second=new Second();
		second.second();
		System.out.println("First.first()반환");
	}
}
