package chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/*
 * - Ŭ���̾�Ʈ ������ �������ִ� ��ü(id,socket,stream)
 * - Ŭ���̾�Ʈ ������ �����ϰ��ִ� ������ Ŭ����
 * - Ŭ���̾�Ʈ�� 1��������
 * - Ŭ���̾�Ʈ���� ��������
 */
public class ChatServerClientHandler extends Thread{
	String id;// Ŭ���̾�ƮID
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
		"1.ChatServerClientHandler:Ŭ���̾�Ʈ����Ÿ���б����ع��Ѵ��:"+Thread.currentThread().getName());
				String readData=dataIn.readUTF();
				System.out.println(
		"2.ChatServerClientHandler:Ŭ���̾�Ʈ�� �����ѵ���Ÿ����:"+readData);
				
		System.out.println(
		"3.ChatServerClientHandler:����ȸ�� Ŭ���̾�Ʈ����ε�ĳ����");		
		    	//�Ŵ����Ը�� Ŭ���̾�Ʈ����ε�ĳ���� ���ּ���
		       clientHandlerManager.sendBroadcating(id+":"+readData);
			}
		}catch(Exception e){
			//�Ŵ����� Client ����Ʈ���� ��������
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
