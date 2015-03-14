


public class Third {
	public void third() throws Exception{
		System.out.println("Third.third()실행");
		
		//Excption 발생 던진다
		
		boolean b=true;
		if(b){
			throw new Exception("나의에로사항");
		}
		
		//FileInputStream fis=new FileInputStream("a.txt");
		System.out.println("Third.third()반환");
	}
	
}
