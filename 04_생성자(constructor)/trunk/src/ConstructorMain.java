
public class ConstructorMain {

	public static void main(String[] args) {
		Constructor c1;
		c1 = new Constructor();
		c1.print();
		
		Constructor c2 = new Constructor (500);
		c2.print();
		
		Constructor c3 = new Constructor (600,700);
		c3.print();
		
		Constructor c4 = new Constructor();
		c4.i=888;
		c4.j=999;
		c4.print();
		
	}

}
