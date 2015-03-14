package byte_stream.filter_stream;

import java.io.PrintStream;

public class ConsolePrintStreamMain {

	public static void main(String[] args) {

		System.out.println("system console.....");
		System.out.write(65);		
		System.out.write(66);		
		System.out.write(67);		
		System.out.write(68);		
		System.out.write(69);
		System.out.println("write");
		PrintStream ps = System.out;
		for (int i = 0; i < 255; i++) {
			ps.write(i);
		}
		System.out.println();
		System.out.println("-----------2 byte(ÇÑ±Û) write------------");
		ps.write('±è');
		System.out.println("----------2 byte(ÇÑ±Û) print-------------");
		ps.print('±è');
		ps.print("±è");
	
		
	}

}
