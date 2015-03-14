package client;

import java.net.Socket;

/*
 * Socket 클래스
 *     TCP/IP 기반의 가상의연결
 *     (가상의 스트림이 생성되고 데이타 송수신이 가능하다.)
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
