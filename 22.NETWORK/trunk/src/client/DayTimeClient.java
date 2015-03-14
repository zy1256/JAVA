package client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class DayTimeClient {

	public static void main(String[] args) throws Exception{
		//1.연결
		Socket socket=new Socket("172.16.2.1",8000);
		//2.읽기
		InputStream in=socket.getInputStream();
		/*
		 * byte stream --> Reader
		 * InputStreamReader: bridge stream
		 */
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		
		String readLine=br.readLine();
		System.out.println("client:"+readLine);
	}

}
