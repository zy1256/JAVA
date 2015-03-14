package jdbc.basic;

public class MyDBbDriverLoadingMain {

	public static void main(String[] args) {
		try {
			Class.forName("jdbc.basic.myDBDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
