package chat.server;

import java.util.ArrayList;
/*
 * Ŭ���̾�Ʈ ��ü���� 
 * �߰�,
 * ����,
 * ã��,
 * ���Ŭ���̾�Ʈ������Ÿ����(��ε�ĳ����)
 * �� ���Ŭ���̾�Ʈ��ü�� ���õ���
 * 
 * 
 */
public class ChatServerClientHandlerManager {
	/*
	 * ����Ŭ���̾�Ʈ��ü��
	 */
	ArrayList<ChatServerClientHandler> clientList=
			new ArrayList<ChatServerClientHandler>();
	/*
	 * Ŭ���̾�Ʈ�߰�
	 */
	public void addClientHandler(ChatServerClientHandler newClientHandler)throws Exception{
		clientList.add(newClientHandler);
		
		sendBroadcating(">>>>>>"+newClientHandler.id+" �� ����");
		
		System.out.println(">>>>>>>>>"+newClientHandler.id+" �� ����");
		printClientHandlerCount();
	}
	private void printClientHandlerCount(){
		System.out.println("ChatServerClientHandlerManager:���������ڼ�:"
				+clientList.size()+"��");
	}
	/*
	 *Ŭ���̾�Ʈ ���� 
	 */
	public void removeClient(ChatServerClientHandler removeClientHandler)throws Exception{
		clientList.remove(removeClientHandler);
		sendBroadcating("<<<<<<<<<< "+removeClientHandler.id+" �� ����");
		System.out.println("<<<<<<<<<< "+removeClientHandler.id+" �� ����");
		printClientHandlerCount();
	}
	/*
	 * ����� ���Ŭ���̾�Ʈ�� ����Ÿ����
	 */
	public void sendBroadcating(String readData) throws Exception{
		for (ChatServerClientHandler chatServerClientHandler 
				: clientList) {
			chatServerClientHandler.send(readData);
		}
	}
}









