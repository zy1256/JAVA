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
			System.out.println("1.Ŭ���̾�Ʈ�� ���Ͽ����û�� ���(8000)");
			Socket socket=serverSocket.accept();
			System.out.println("2.Ŭ���̾�Ʈ�� ���ϻ���:"+socket);
			
			PrintWriter pw=
					new PrintWriter(
							new OutputStreamWriter(
									socket.getOutputStream()));
			String time= new Date().toLocaleString();
			pw.println("Server Time:"+time);
			pw.flush();
			System.out.println("3.Ŭ���̾�Ʈ�� �ð�����:"+time);
			pw.close();
			socket.close();
			System.out.println("4.Ŭ���̾�Ʈ�Ϳ���� ���ϴݱ�");
		}
	}
}
