package server;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
public class DayTimeServer {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket=
				new ServerSocket(8000);
		while(true){
			System.out.println("1.클라이언트의 소켓연결요청을 대기(8000)");
			Socket socket=serverSocket.accept();
			System.out.println("2.클라이언트의 소켓생성:"+socket);
			
			PrintWriter pw=
					new PrintWriter(
							new OutputStreamWriter(
									socket.getOutputStream()));
			String time= new Date().toLocaleString();
			pw.println("Server Time:"+time);
			pw.flush();
			System.out.println("3.클라이언트에 시간전송:"+time);
			pw.close();
			socket.close();
			System.out.println("4.클라이언트와연결된 소켓닫기");
		}
	}
}
