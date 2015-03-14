package char_stream.filter_stream;

import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterBufferredReaderMain {

	public static void main(String[] args) throws Exception{
		
		FileReader fr=new FileReader(FileDescriptor.in);
		BufferedReader br=new BufferedReader(fr);
		
		PrintWriter pw= new PrintWriter(new FileWriter("consoleFile.txt"));
		
		
		while (true) {
			//Console
			String readLine=br.readLine();
			if(readLine==null){
				break;
			}
			pw.println(readLine);
			pw.flush();
		}
		

	}

}
