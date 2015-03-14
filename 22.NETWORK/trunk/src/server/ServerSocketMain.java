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
			System.out.println("1.클라이언트의 소켓연결요청처리하기위해 대기");
			Socket socket=serverSocket.accept();
			System.out.println("2.클라이언트의 소켓생성:"+socket);
			System.out.println("3.클라이언트의 소켓으로 읽고쓰기");
		}
		
		

	}

}
