package byte_stream;

import java.io.InputStream;

public class ConsoleInputStreamThreadBlockingMain {

	public static void main(String[] args) throws Exception{

		InputStream consoleIn = System.in;
		System.out.println("Thread blocking...(Ű���� �Է½ñ��� ���Ѵ��)");
		
		while (true) {
			int readByte = consoleIn.read();
			if(readByte == -1)break;
			System.out.print((char)readByte);
		}
		
		System.out.println("Thread return...");
		
	}

}
