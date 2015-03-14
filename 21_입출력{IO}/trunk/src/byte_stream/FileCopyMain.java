package byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception{

		String fileName = "fileOut.txt"; // Car_copy.java
		String copyFileName = "";
		int dotIndex = fileName.lastIndexOf(".");
		String fName = fileName.substring(0,dotIndex);
		String fineExt = fileName.substring(dotIndex);
		copyFileName = fName + "_copy" + fineExt;
		System.out.println("盔夯颇老 : " + copyFileName);
		System.out.println("积己颇老 : " + copyFileName);
		
		FileInputStream fis = new FileInputStream(fileName);
		
		FileOutputStream fos = new FileOutputStream(copyFileName);
		
		int count = 0;
		int count1 = 0;
		while (true) {
			int readByte = fis.read();
			if(readByte == -1) break;
			fos.write(readByte);
			count++;
			if(count%10000 ==0){
				System.out.println("*");
				count1++;
				if(count1%50==0){
					System.out.println("*");
				}
			}
		}
		
		fis.close();
		fos.close();
		
	}

}
