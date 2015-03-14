package byte_stream.filter_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputFileCopy {

	public static void main(String[] args) throws Exception{
		
		String fileName = "ALZip928.exe"; // Car_copy.java
		String copyFileName = "";
		int dotIndex = fileName.lastIndexOf(".");
		String fName = fileName.substring(0,dotIndex);
		String fineExt = fileName.substring(dotIndex);
		copyFileName = fName + "_copy" + fineExt;
		System.out.println("盔夯颇老 : " + copyFileName);
		System.out.println("积己颇老 : " + copyFileName);
		
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(copyFileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int count = 0;
		int count1 = 0;
		while (true) {
			int readByte = bis.read();
			if(readByte == -1) break;
			bos.write(readByte);
			count++;
			if(count%10000 ==0){
				System.out.println("*");
				count1++;
				if(count1%50==0){
					System.out.print("*");
				}
			}
		}
		
		fis.close();
		fos.close();

	}

}
