package byte_stream;

import java.io.FileInputStream;

/*
 * Input(출력)
 * 
 * 	1.데이타쏘쓰선정(File)
 *  2.스트림생성(FileInputStream)
 *  3.한바이트씩 읽는다.
 */
public class FileInputStreamMain {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("fileOut.txt");
		/*
		 * public abstract int read() throws IOException
		    - Reads the next byte of data from the input stream.
		    - The value byte is returned as an int in the range 0 to 255.
		    - If no byte is available because 
		      the end of the stream has been reached,
		      the value -1 is returned. 
		    - This method blocks until input data is available,
		      the end of the stream is detected, 
		      or an exception is thrown. 
			- A subclass must provide an implementation of this method.
		 */
		int readByte = fis.read();
		System.out.println("1." + Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("2." + Integer.toBinaryString(readByte));
		readByte= fis.read();
		System.out.println("3." + Integer.toBinaryString(readByte));
		
		while (true) {
			readByte = fis.read();
			if(readByte == -1){
				break;
			}
			//System.out.println(Integer.toBinaryString(readByte));
			System.out.println((char)readByte);
		}
		
		

	}

}
