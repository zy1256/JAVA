package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ChatFrame extends Frame {
	Label chatL;
	TextArea chatTA;
	Panel chatP;
	TextField chatTF;
	Button chatB;
	
	public ChatFrame(){
		setTitle("ㅋㅋ 채팅");
		setFont(new Font(Font.DIALOG,Font.BOLD, 12));
		chatL = new Label("ㅋㅋ 채팅",Label.CENTER);
		chatL.setBackground(Color.GREEN);
		chatL.setForeground(Color.PINK);
		chatTA = new TextArea();
		chatTA.setEnabled(false);
		chatTA.setText("경호:이따만나요~~~");
		chatP = new Panel();
		chatTF = new TextField(20);
		chatB = new Button("전송");
		
		chatP.setLayout(new FlowLayout());
		chatP.add(chatTF);
		chatP.add(chatB);
		
		setLayout(new BorderLayout());
		add(chatL,BorderLayout.NORTH);
		add(chatTA,BorderLayout.CENTER);
		add(chatP,BorderLayout.SOUTH);
		/*
		addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {
			}
			public void windowIconified(WindowEvent e) {
			}
			public void windowDeiconified(WindowEvent e) {
			}
			public void windowDeactivated(WindowEvent e) {
			}
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			public void windowClosed(WindowEvent e) {
			}
			public void windowActivated(WindowEvent e) {
			}
		});*/
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		SendHandler sendHandler = new SendHandler();
		
		chatB.addActionListener(sendHandler);
		chatTF.addActionListener(sendHandler);
		
		setSize(300, 400);
		setVisible(true);
		
	}
	/***********member inner class*************/
	public class SendHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object sourceObject = e.getSource();
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
			chatTF.setText("");
			chatTA.append("지수:"+chatStr+"\n");
			return;
		}
		
		
	}
	

	/******************************************/
	
	public static void main(String[] args) {
		new ChatFrame();

	}

}
