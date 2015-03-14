package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket serverSocket=new ServerSocket(9999);
		while (true) {
			System.out.println("---------------------------");
			System.out.println(
					"1.클라이언트의 소켓연결요청을 대기(9999)");
			Socket socket=serverSocket.accept();
			System.out.println("2.클라이언트 소켓생성:"+socket);
			
			BufferedReader br=
					new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
			PrintWriter pw=
					new PrintWriter(
							new OutputStreamWriter(
								socket.getOutputStream()));
			
			String readLine=br.readLine();
			System.out.println("2.클라이언트 소켓으로부터 데이타읽기:"+readLine);
			pw.println("Server send:"+readLine);
			pw.flush();
			System.out.println("3.클라이언트 소켓에 데이타쓰기:Server send:"+readLine);
			br.close();
			pw.close();
			socket.close();
			System.out.println("4.클라이언트 소켓 닫기");	
			System.out.println("---------------------------");
		}
		

	}

}
