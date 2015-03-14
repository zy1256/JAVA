package web;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class WebClientMain {
	public static void main(String[] args) throws Exception{
		//1.연결
		Socket socket=new Socket("www.naver.com",80);
		
		//2.웹서버로 데이타요청명령전송
		String requestCommand="GET /index.html HTTP/1.0\r\n\r\n";
		byte[] requestCommandBytes = requestCommand.getBytes();
		OutputStream out=socket.getOutputStream();
		out.write(requestCommandBytes);
		out.flush();
		
		//3.웹서버로부터오는데이타바끼..
		InputStream in=socket.getInputStream();
		InputStreamReader isr=new InputStreamReader(in,"UTF-8");
		while(true){
			int readChar=isr.read();
			if(readChar==-1)break;
			System.out.print((char)readChar);
		}
		out.close();
		in.close();
		
	}

}












