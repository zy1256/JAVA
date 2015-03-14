package byte_stream.filter_stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception{
		
		PrintStream ps = new PrintStream(new FileOutputStream("print.txt"));
		ps.write(65);
		ps.write(54);
		ps.write(53);
		
		ps.print(65);
		
		ps.println(1);
		ps.print(2.3654);
		ps.write('\n');
		String ds = "2.3654";
		for (int i = 0; i < ds.length(); i++) {
			char c = ds.charAt(i);
			ps.write(c);
		}
		ps.println("\n오늘은 아이오를 해요~~");
		System.out.println("print");
		
		ps.close();
		
	}

}
