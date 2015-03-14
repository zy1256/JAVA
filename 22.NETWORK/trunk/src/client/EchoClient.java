package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws Exception {
		Socket socket=new Socket("172.16.2.1",9999);
		PrintWriter pw=
					new PrintWriter(
							new OutputStreamWriter(
								socket.getOutputStream()));
		BufferedReader br=
				new BufferedReader(
						new InputStreamReader(
								socket.getInputStream()));
		
		pw.println("æ»≥Á«œªÔ");
		pw.flush();
		String readLine=br.readLine();
		System.out.println(readLine);
		
		
	}

}
