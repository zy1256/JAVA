
public class AbstractClassMain {

	public static void main(String[] args) {
		//AbstractClass ac = new AbstractClass();
		AbstractClassChild acc = new AbstractClassChild();
		acc.method1();
		acc.method2();
		
		AbstractClass ac = new AbstractClassChild();
		ac.method1();
		ac.method2();
		
	}

}
