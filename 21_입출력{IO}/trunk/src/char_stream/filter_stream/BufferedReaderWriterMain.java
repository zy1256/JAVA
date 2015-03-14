package char_stream.filter_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterMain {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new FileReader("OOP.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("OOP_LINE.java"));
		//라인종결자 바로전까지의 문자열을 반환
		String readLine = br.readLine();
		System.out.println("1. " + readLine);
		readLine = br.readLine();
		System.out.println("2. " + readLine);
		int lineCount=0;
		while (true) {
			readLine = br.readLine();
			if(readLine==null)break;
			//console
			System.out.println(readLine+"\n");
			//File
			bw.write(lineCount + readLine + "\n");
			
			
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
