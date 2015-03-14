package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class ChatFrame_copy extends Frame {
	Button bSend;
	Label nameL;
	TextField chatroomTF;
	TextField chatTF;
	Panel northP;
	Panel centerP;
	Panel southP;
	
	public ChatFrame_copy(){
		bSend = new Button("Àü¼Û");
		nameL = new Label("È«´Ô ´ëÈ­Áß");
		chatroomTF = new TextField();
		chatTF = new TextField();
		northP = new Panel();
		centerP = new Panel();
		southP = new Panel();
		
		northP.setBackground(Color.LIGHT_GRAY);
		northP.setLayout(new GridLayout(0,1));
		northP.add(nameL);
		
		centerP.setBackground(Color.CYAN);
		centerP.setLayout(new GridLayout(0,1));
		centerP.add(chatroomTF);
		
		southP.setBackground(Color.LIGHT_GRAY);
		southP.setLayout(new BorderLayout());
		southP.add(chatTF,BorderLayout.CENTER);
		southP.add(bSend,BorderLayout.EAST);
		
		setLayout(new BorderLayout());
		add(northP,BorderLayout.NORTH);
		add(centerP,BorderLayout.CENTER);
		add(southP,BorderLayout.SOUTH);
		
		setSize(300, 400);
		setVisible(true);
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new ChatFrame_copy();

	}

}
