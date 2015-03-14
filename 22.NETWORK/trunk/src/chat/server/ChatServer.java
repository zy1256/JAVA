package chat.server;

import java.net.ServerSocket;
import java.net.Socket;

/*
 * ���Ѵ���ϸ鼭 Ŭ���̾�Ʈ�� ���Ͽ����ûó�� 
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
				System.out.println("2.ChatServer socket����:"+socket);
				//�����ȼ����� ��������
				clientHandlerManager
					.addClientHandler(
							new ChatServerClientHandler(socket,clientHandlerManager));
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
