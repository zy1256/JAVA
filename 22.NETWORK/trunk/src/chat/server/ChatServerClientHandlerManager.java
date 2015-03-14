package chat.server;

import java.util.ArrayList;
/*
 * 클라이언트 객체들의 
 * 추가,
 * 삭제,
 * 찾기,
 * 모든클라이언트에데이타전송(브로드캐스팅)
 * 등 모든클라이어트객체에 관련된일
 * 
 * 
 */
public class ChatServerClientHandlerManager {
	/*
	 * 접속클라이언트객체들
	 */
	ArrayList<ChatServerClientHandler> clientList=
			new ArrayList<ChatServerClientHandler>();
	/*
	 * 클라이언트추가
	 */
	public void addClientHandler(ChatServerClientHandler newClientHandler)throws Exception{
		clientList.add(newClientHandler);
		
		sendBroadcating(">>>>>>"+newClientHandler.id+" 님 입장");
		
		System.out.println(">>>>>>>>>"+newClientHandler.id+" 님 입장");
		printClientHandlerCount();
	}
	private void printClientHandlerCount(){
		System.out.println("ChatServerClientHandlerManager:현재접속자수:"
				+clientList.size()+"명");
	}
	/*
	 *클라이언트 삭제 
	 */
	public void removeClient(ChatServerClientHandler removeClientHandler)throws Exception{
		clientList.remove(removeClientHandler);
		sendBroadcating("<<<<<<<<<< "+removeClientHandler.id+" 님 퇴장");
		System.out.println("<<<<<<<<<< "+removeClientHandler.id+" 님 퇴장");
		printClientHandlerCount();
	}
	/*
	 * 연결된 모든클라이언트에 데이타전송
	 */
	public void sendBroadcating(String readData) throws Exception{
		for (ChatServerClientHandler chatServerClientHandler 
				: clientList) {
			chatServerClientHandler.send(readData);
		}
	}
}









