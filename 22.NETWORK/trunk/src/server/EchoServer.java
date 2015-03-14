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
					"1.Ŭ���̾�Ʈ�� ���Ͽ����û�� ���(9999)");
			Socket socket=serverSocket.accept();
			System.out.println("2.Ŭ���̾�Ʈ ���ϻ���:"+socket);
			
			BufferedReader br=
					new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
			PrintWriter pw=
					new PrintWriter(
							new OutputStreamWriter(
								socket.getOutputStream()));
			
			String readLine=br.readLine();
			System.out.println("2.Ŭ���̾�Ʈ �������κ��� ����Ÿ�б�:"+readLine);
			pw.println("Server send:"+readLine);
			pw.flush();
			System.out.println("3.Ŭ���̾�Ʈ ���Ͽ� ����Ÿ����:Server send:"+readLine);
			br.close();
			pw.close();
			socket.close();
			System.out.println("4.Ŭ���̾�Ʈ ���� �ݱ�");	
			System.out.println("---------------------------");
		}
		

	}

}
