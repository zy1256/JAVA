package client;

import java.net.Socket;

/*
 * Socket Ŭ����
 *     TCP/IP ����� �����ǿ���
 *     (������ ��Ʈ���� �����ǰ� ����Ÿ �ۼ����� �����ϴ�.)
 * 
 */
public class SocketInfo {

	public static void main(String[] args) throws Exception{
		
		Socket socket=new Socket("125.209.222.142",80);
		System.out.println("remote ip:"+socket.getInetAddress());
		System.out.println("remote port:"+socket.getPort());
		System.out.println("local ip:"+socket.getLocalAddress());
		System.out.println("local port:"+socket.getLocalPort());
	}

}
