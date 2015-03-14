package web;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

	public static void main(String[] args)throws Exception {
		
		ServerSocket serverSocket=new ServerSocket(80);
		while(true){
			System.out.println("1. 클라이언트연결요청처리위해 대기(80)");
			Socket socket=serverSocket.accept();
			System.out.println("2. 접속 클라이언트:"+socket);
			System.out.println("3. 클라이언트요청 분석(html,image)");
			OutputStream out=socket.getOutputStream();
			System.out.println("4. 클라이언트요청데이타(html,image)를 전송");
			/**************html**************
			PrintWriter pw=
					new PrintWriter(
							new OutputStreamWriter(out));	
			//server local file(index.html) loading
			FileInputStream fis=new FileInputStream("index.html");
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);
			while (true) {
				String readLine=br.readLine();
				if(readLine==null)break;
				pw.println(readLine);
			}
			pw.flush();
			************image**************/	
			FileInputStream fis=new FileInputStream("female.gif");
			while (true) {
				int readByte=fis.read();
				if(readByte==-1)break;
				out.write(readByte);
			}
			out.flush();
			socket.close();
		}//end while
	}//end main
}//enc class
