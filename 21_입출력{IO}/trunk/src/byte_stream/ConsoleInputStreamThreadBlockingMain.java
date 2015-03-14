package byte_stream;

import java.io.InputStream;

public class ConsoleInputStreamThreadBlockingMain {

	public static void main(String[] args) throws Exception{

		InputStream consoleIn = System.in;
		System.out.println("Thread blocking...(키보드 입력시까지 무한대기)");
		
		while (true) {
			int readByte = consoleIn.read();
			if(readByte == -1)break;
			System.out.print((char)readByte);
		}
		
		System.out.println("Thread return...");
		
	}

}
