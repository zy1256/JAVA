package client;

import java.net.InetAddress;

public class InetAddressMain {

	public static void main(String[] args) throws Exception{
		/*
		This class represents an Internet Protocol (IP) address. 
		 */
		System.out.println("-----InetAddress--");
		InetAddress ia1=InetAddress.getByName("www.naver.com");
		System.out.println("host name:"+ia1.getHostName());
		System.out.println("host address:"+ia1.getHostAddress());
		
		InetAddress ia2=InetAddress.getByName("www.google.com");
		System.out.println("host name:"+ia2.getHostName());
		System.out.println("host address:"+ia2.getHostAddress());
		
		//multi address
		System.out.println("-----multi address--");
		InetAddress[] iaArray=InetAddress.getAllByName("www.google.com");
		for (int i = 0; i < iaArray.length; i++) {
			System.out.println(iaArray[i]);
		}
		System.out.println("----local address---");
		
		InetAddress localAddress= InetAddress.getLocalHost();
		System.out.println(localAddress);
	}

}
