package client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class PortScannerMain {

	public static void main(String[] args) {
		
		for (int i = 79; i < 100; i++) {
			
			try {
				Socket socket=new Socket("www.google.com",i);
				System.out.println(i+" �� ��Ʈ�� ���Ͽ��Ἲ��");
			} catch (Exception e){
				System.out.println(i+" �� ��Ʈ�� ���Ͽ������<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			}
			
		}
		
		

	}

}
