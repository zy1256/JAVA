package char_stream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyMain {

	public static void main(String[] args) throws Exception{

		FileReader fr = new FileReader("OOP.java");
		FileWriter fw = new FileWriter("OOP_copy.java");
		
		while (true) {
			int readChar = fr.read();
			if(readChar==-1)break;
			fw.write(readChar);
		}
		fw.flush();
		fr.close();
		fw.close();
		
		System.out.println(".............");
		
		
	}

}
