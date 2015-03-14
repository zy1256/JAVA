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
			System.out.println("국어점수입력");
			koStr = br.readLine();
			System.out.println("영어점수입력");
			engStr = br.readLine();
			System.out.println("수학점수입력");
			mathStr = br.readLine();
			int kor = Integer.parseInt(koStr);
			int eng = Integer.parseInt(engStr);
			int math = Integer.parseInt(mathStr);
			int tot = kor+eng+math;
			double avg = tot/3.0;
			
			System.out.println(br.readLine());
			System.out.println("-------------------");
			System.out.println("국어 : " + koStr);
			System.out.println("영어 : " + engStr);
			System.out.println("수학 : " + mathStr);
			System.out.println("총점 : " + tot);
			System.out.println("평균 : " + avg);
			System.out.println("--------------------");
			System.out.println("계속할래요 y/n");
			String yn=br.readLine();
			if(!yn.equalsIgnoreCase("y")){
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		br.close();
		
		
	}

}
