
public class OuterClass {
	InnerClass innerClass;
	public int outer_field;
	public void outer_method(){
		System.out.println("OuterClass.outer_method()");
	}
	/*
	 * OuterClass에서 InnerClass의사용
	 */
	public void outer_inner(){
		innerClass = new InnerClass();
		innerClass.inner_field = 300;
		innerClass.inner_method();
		
		InnerClass innerClass2 = new InnerClass();
		innerClass2.inner_field = 400;
		innerClass2.inner_method();
	}
	
	//member inner class
	public class InnerClass{
		public int inner_field;
		public void inner_method(){
			System.out.println("InnerClass.inner_method()");
		}
		/*
		 * InnerClass --> OuterClass
		 */
		public void inner_outer(){
			InnerClass.this.inner_field = 100;
			InnerClass.this.inner_method();
			OuterClass.this.outer_field = 100;
			OuterClass.this.outer_method();
			outer_field = 200;
			outer_method();
			
		}
		
	}
}
