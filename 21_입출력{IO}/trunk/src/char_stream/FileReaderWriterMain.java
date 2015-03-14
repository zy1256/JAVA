package char_stream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterMain {

	public static void main(String[] args)  throws Exception{
		
		FileWriter fw = new FileWriter("writeOut.txt");
		FileReader fr = new FileReader("writeOut.txt");
		
		fw.write(45000);
		fw.write('±Ë');
		fw.write("∆ƒ¿œ∂Û¿Ã≈Õ∏¶ ªÁøÎ«œ±‚");
		int count = 0;
		for (int i = '±Ë'; i < '¬S'; i++) {
			fw.write(i);
			count++;
			if(count%100 ==0){
				fw.write('\n');
			}
		}
		
		fw.flush();
		fw.close();
		System.out.println("filewrite write....");
		
		int readChar = fr.read();
		System.out.println("1. " + (char)readChar);
		readChar = fr.read();
		System.out.println("2. " + (char)readChar);
		
		while (true) {
			readChar = fr.read();
			if(readChar == -1)break;
			System.out.println((char)readChar);
		}
		
		
	}

}
