
public class InterfaceImplMain {

	public static void main(String[] args) {
		InterfaceImpl ii1 = new InterfaceImpl();
		ii1.method1();
		ii1.method2();
		ii1.method3();
		ii1.method4();
		
		Interface1 i1 = ii1;
		i1.method1();
		i1.method2();
		//i1.method3();
		//i1.method4();
		
		Interface2 i2 = ii1;
		//i2.method1();
		//i2.method2();
		i2.method3();
		i2.method4();
		
		Interface1 i11 = new InterfaceImpl();
		i11.method1();
		i11.method2();
		Interface2 i22 = (Interface2)i11;
		i22.method3();
		i22.method4();
		
	}

}
