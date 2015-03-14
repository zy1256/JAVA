
public class OverloadingMain {

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.method();
		ol.method(100);
		ol.method(100,200);
		ol.method("문자열");
		ol.method("문자열1","문자열2");
		ol.method("문자열",8888);
		

	}

}
