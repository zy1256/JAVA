package chat.server;

import java.net.ServerSocket;
import java.net.Socket;

/*
 * 무한대기하면서 클라이어트의 소켓연결요청처리 
 */
public class ChatServer {

	public static void main(String[] args) {
		ChatServerClientHandlerManager clientHandlerManager;
		ServerSocket serverSocket=null;
		try{
			clientHandlerManager=new ChatServerClientHandlerManager();
			serverSocket=new ServerSocket(8888);
			while(true){
				System.out.println("1.ChatServer: accept() 8888");
				Socket socket=serverSocket.accept();
				System.out.println("2.ChatServer socket생성:"+socket);
				//생성된소켓의 유지관리
				clientHandlerManager
					.addClientHandler(
							new ChatServerClientHandler(socket,clientHandlerManager));
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
