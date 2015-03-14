package byte_stream;

import java.io.FileOutputStream;

/*
 * Output(���)
 * 
 * 	1.����ŸŸ�ټ���(File)
 *  2.��Ʈ������(FileOutputStream)
 *  3.�ѹ���Ʈ�� ����.
 */

public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception{
		FileOutputStream fis=new FileOutputStream("fileOut.txt");
		/*
		<< OutputStream >>
		public abstract void write(int b) throws IOException

			- Writes the specified byte to this output stream.
 			- The general contract for write is that 
 			  one byte is written to the output stream.
 			  The byte to be written is the eight low-order bits of the argument b.
 			  The 24 high-order bits of b are ignored. 
			- Subclasses of OutputStream must provide 
			  an implementation for this method.

		 */
		fis.write(65);
		fis.write('A');
		fis.write(66);
		fis.write(67);
		fis.write(2147483647);
		fis.write('ȣ');
		for (int i = 0; i < 256; i++) {
			fis.write(i);
		}
		System.out.println("file output");
		
		
	}

}
