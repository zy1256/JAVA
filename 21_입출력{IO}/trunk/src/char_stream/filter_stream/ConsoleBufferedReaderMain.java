package char_stream.filter_stream;

import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileReader;

public class ConsoleBufferedReaderMain {

	public static void main(String[] args) throws Exception{
		//String koStr,engStr,mathStr;
		String koStr = "";
		String engStr = "";
		String mathStr ="";
		
		FileReader fr = new FileReader(FileDescriptor.in);
		BufferedReader br =new BufferedReader(fr);
		
		//System.out.println("readLIne : " +readLine);
		
		while (true) {
			System.out.println("���������Է�");
			koStr = br.readLine();
			System.out.println("���������Է�");
			engStr = br.readLine();
			System.out.println("���������Է�");
			mathStr = br.readLine();
			int kor = Integer.parseInt(koStr);
			int eng = Integer.parseInt(engStr);
			int math = Integer.parseInt(mathStr);
			int tot = kor+eng+math;
			double avg = tot/3.0;
			
			System.out.println(br.readLine());
			System.out.println("-------------------");
			System.out.println("���� : " + koStr);
			System.out.println("���� : " + engStr);
			System.out.println("���� : " + mathStr);
			System.out.println("���� : " + tot);
			System.out.println("��� : " + avg);
			System.out.println("--------------------");
			System.out.println("����ҷ��� y/n");
			String yn=br.readLine();
			if(!yn.equalsIgnoreCase("y")){
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
		}
		br.close();
		
		
	}

}
