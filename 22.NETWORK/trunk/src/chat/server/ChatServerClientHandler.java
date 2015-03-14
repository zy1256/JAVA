package chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/*
 * - 클라이언트 정보를 가지고있는 객체(id,socket,stream)
 * - 클라이언트 소켓을 포함하고있는 쓰레드 클래스
 * - 클라이언트당 1개씩생성
 * - 클라이언트와의 통신을담당
 */
public class ChatServerClientHandler extends Thread{
	String id;// 클라이언트ID
	Socket socket;
	DataInputStream dataIn;
	DataOutputStream dataOut;
	ChatServerClientHandlerManager  clientHandlerManager;
	public ChatServerClientHandler(Socket socket,
			ChatServerClientHandlerManager clientHandlerManager) {
		try {
			this.clientHandlerManager=clientHandlerManager;
			this.socket = socket;
			this.dataIn = new DataInputStream(socket.getInputStream());
			this.dataOut = new DataOutputStream(socket.getOutputStream());
			this.id=socket.getInetAddress().getHostAddress()
					+"["+socket.getPort()+"]";
		} catch (Exception e) {
			try {
				if (dataIn != null) {
					dataIn.close();
				}
				if (dataOut != null) {
					dataOut.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e1) {
				e1.printStackTrace();
				
			}
			
		}
		this.setName(id);
		this.start();
	}
	@Override
	public void run() {
		try{
			while(true){
				System.out.println(
		"1.ChatServerClientHandler:클라이언트데이타를읽기위해무한대기:"+Thread.currentThread().getName());
				String readData=dataIn.readUTF();
				System.out.println(
		"2.ChatServerClientHandler:클라이언트가 전송한데이타읽음:"+readData);
				
		System.out.println(
		"3.ChatServerClientHandler:연결된모든 클라이언트에브로드캐스팅");		
		    	//매니져님모든 클라이언트에브로드캐스팅 해주세요
		       clientHandlerManager.sendBroadcating(id+":"+readData);
			}
		}catch(Exception e){
			//매니져님 Client 리스트에서 나를제거
			try {
				clientHandlerManager.removeClient(this);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	public void send(String readData) throws Exception {
		dataOut.writeUTF(readData);
	}

}
