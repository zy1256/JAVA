package layout;

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

public class ChatFrame extends Frame {
	Label chatL;
	TextArea chatTA;
	Panel chatP;
	TextField chatTF;
	Button chatB;
	
	public ChatFrame(){
		setTitle("ㅋㅋ 채팅");
		setFont(new Font(Font.DIALOG,Font.BOLD, 18));
		chatL = new Label("ㅋㅋ 채팅",Label.CENTER);
		chatL.setBackground(Color.GREEN);
		chatL.setForeground(Color.PINK);
		chatTA = new TextArea();
		chatTA.setEnabled(false);
		chatTA.setText("경호:이따만나요~~~");
		chatP = new Panel();
		chatTF = new TextField(28);
		chatB = new Button("전송");
		
		chatP.setLayout(new FlowLayout());
		chatP.add(chatTF);
		chatP.add(chatB);
		
		setLayout(new BorderLayout());
		add(chatL,BorderLayout.NORTH);
		add(chatTA,BorderLayout.CENTER);
		add(chatP,BorderLayout.SOUTH);
		
		setSize(300, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ChatFrame();

	}

}
