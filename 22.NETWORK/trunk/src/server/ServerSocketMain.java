package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) throws Exception{
		/*
		 << ServerSocket class >>
		 A server socket waits for requests to come in over the network. 
		 */
		ServerSocket serverSocket=new ServerSocket(8888);
		System.out.println("ServerSocket port:"+serverSocket.getLocalPort());
		System.out.println("ServerSocket IP:"+serverSocket.getInetAddress());
		/*
		 << ServerSocket class >>
		  public Socket accept() throws IOException;
		   - Listens for a connection to be made 
		     to this socket and accepts it.
		   - The method blocks until a connection is made. 

 		  
		 */
		while(true){
			System.out.println("1.Ŭ���̾�Ʈ�� ���Ͽ����ûó���ϱ����� ���");
			Socket socket=serverSocket.accept();
			System.out.println("2.Ŭ���̾�Ʈ�� ���ϻ���:"+socket);
			System.out.println("3.Ŭ���̾�Ʈ�� �������� �а���");
		}
		
		

	}

}
