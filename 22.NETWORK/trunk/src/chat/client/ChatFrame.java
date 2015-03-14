package chat.client;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;
public class ChatFrame extends Frame{
	Label chatL;
	TextArea chatTA;
	Panel chatP;
	TextField chatTF;
	Button chatB;
	ChatClientHandler clientHandler;
	
	public ChatFrame() {
		setTitle("ㅋㅋ 채팅");
		setFont(new Font(Font.DIALOG, Font.BOLD, 17));
		chatL=new Label("ㅋㅋ 채팅",Label.CENTER);
		chatL.setBackground(Color.GREEN);
		chatL.setForeground(Color.PINK);
		
		chatTA=new TextArea();
		chatTA.setEnabled(false);
		chatTA.setText("경호:이따만나요~~~~\n");
		
		chatP=new Panel();
		chatTF=new TextField(20);
		chatB=new Button("전송");
		
		chatP.setLayout(new FlowLayout());
		chatP.add(chatTF);
		chatP.add(chatB);
		
		setLayout(new BorderLayout());
		add(chatL,BorderLayout.NORTH);
		add(chatTA,BorderLayout.CENTER);
		add(chatP,BorderLayout.SOUTH);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				try {
					
					clientHandler.close();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				System.exit(0);
			}
		});
		SendHandler sendHandler=new SendHandler();
		chatB.addActionListener(sendHandler);
		chatTF.addActionListener(sendHandler);
		setSize(300, 400);
		setVisible(true);
		
		/**************/
		clientHandler=new ChatClientHandler();
		try{
			clientHandler.connect();
			clientHandler.start();
		}catch(Exception e){
			//dialog..
			e.printStackTrace();
		}
	}
	/**************************************************
		서버와의 송수신을 담당하는 Thread객체
		서버에서 오는 데이타를 받기위해 무한대기
	/**************************************************/
	public class ChatClientHandler extends Thread{
		Socket socket;
		DataInputStream dataIn;
		DataOutputStream dataOut;
		String id;
		public void connect() throws Exception{
			this.socket=new Socket("172.16.2.1",8888);
			this.dataIn=new DataInputStream(socket.getInputStream());
			this.dataOut=new DataOutputStream(socket.getOutputStream());
			id = socket.getLocalAddress().getHostAddress()
					+"["+socket.getLocalPort()+"]";
			setTitle(id);
		}
		@Override
		public void run() {
			try{
				while(true){
					System.out.println(
					"1.ChatClientHandler:서버에서전송한 데이타를 읽기위해대기");
					String readData=dataIn.readUTF();
					
					System.out.println(
					"2.ChatClientHandler:읽은데이타를 TextArea에보여준다.");
					chatTA.append(readData+"\n");
				}
			}catch(Exception e){
				
			    try {
					this.close();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
			    
			}
		}//end run
		private void close() throws Exception{
			if(dataIn!=null)
				dataIn.close();
			if(dataOut!=null)
				dataOut.close();
			if(socket!=null)
				socket.close();
		}
		
		public void send(String chatStr)throws Exception{
			dataOut.writeUTF(chatStr);
		}
		

	}
	
	
	
	/************member inner class*********************/
	public class SendHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object sourceObject=e.getSource();
			if(sourceObject instanceof Button){
				System.out.println("Button");
			}else if(sourceObject instanceof TextField){
				System.out.println("TextField");
			}
			
			String chatStr=chatTF.getText();
			if(chatStr.equals("")){
				return;
			}
			//network전송
			
			try {
				clientHandler.send(chatStr);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			chatTF.setText("");
			//chatTA.append("지수:"+chatStr+"\n");
			return;
		}
	}
	/*************************************************/
	
	public static void main(String[] args) {
		new ChatFrame();
	}
}