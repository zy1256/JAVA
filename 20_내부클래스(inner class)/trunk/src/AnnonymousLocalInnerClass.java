import java.awt.Color;
import java.awt.Frame;

public class AnnonymousLocalInnerClass {
	
	Object o=new Object(){
		public String toString() {
			return "������";
			
		};
	};
	
	public void method(){
		
		System.out.println(o);
		//MemberInnerClass mic=new MemberInnerClass(); 
		Object ochild=new Object(){
			@Override
			public String toString() {
				return "������";
			}
		};
		
		System.out.println(ochild);
		Frame f=new Frame(){
			@Override
			public void setTitle(String title) {
				super.setTitle("���Ǽ����� ������");
				
			}
			@Override
			public void setBackground(Color bgColor) {
				super.setBackground(Color.RED);
			}
		};
		
		f.setTitle("dfasghfgfhsdgfsd");
		f.setBackground(Color.ORANGE);
		f.setSize(300,400);
		f.setVisible(true);
		
		
		MyInterface mi=new MyInterface(){
			@Override
			public void test1() {
				System.out.println("MyInterface.test1() implement");
			}
			@Override
			public void test2() {
				System.out.println("MyInterface.test2() implement");
			}
			
		};
		mi.test1();
		mi.test2();
		
		
		
		
		
	}
	
	//public class MemberInnerClass extends 
	
}
