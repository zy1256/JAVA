import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CatchExceptionMain {

	public static void main(String[] args) {
		System.out.println("stmt1");
		try {
			System.out.println("stmt2");
			FileInputStream fis = new FileInputStream("a.txt");
			Class.forName("First");
			int r = 34/0;
			System.out.println("stmt3");
			
		} catch (FileNotFoundException e) {
			System.out.println("stmt4-0");
			System.out.println("FileNotFoundException MSG:"+e.getMessage());
			System.out.println("stmt4-1");
		} catch (ClassNotFoundException e) {
			System.out.println("stmt5-0");
			System.out.println("ClassNotFoundException MSG:"+e.getMessage());
			System.out.println("stmt5-1");
		} catch(Exception e){
			System.out.println("stmt6-0");
			System.out.println("¸ð¸£´ÂException MSG:"+e.getMessage());
			System.out.println("stmt6-1");
		}
		System.out.println("stmt7");
		/*
		try {
			Class.forName("aa");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/
		System.out.println("-------------------------");

		try {
			System.out.println("stmt2");
			FileInputStream fis = new FileInputStream("a.txt");
			Class.forName("First");
			int readByte=fis.read();
			System.out.println((char)readByte);
			int r = 34/0;
			System.out.println("stmt3");
			
		} catch(Exception e){
			System.out.println("stmt4-0");
			System.out.println("Exception MSG:"+e.getMessage());
			e.printStackTrace();
			System.out.println("stmt4-1");
		}
		System.out.println("stmt7");
		//Class.forName("dd");
		
		return;
		
	}

}
