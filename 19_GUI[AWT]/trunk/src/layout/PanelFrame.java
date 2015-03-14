package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class PanelFrame extends Frame{
	Button b1,b2,b3;
	Panel southP;
	CenterPanel centerP;
	public PanelFrame(){
		/******************/
		b1 = new Button("傈价");
		b2 = new Button("秒家");
		b3 = new Button("庇加富");
		
		southP = new Panel();
		southP.setBackground(Color.ORANGE);
		southP.setLayout(new FlowLayout());
		
		southP.add(b1);
		southP.add(b2);
		southP.add(b3);
		/**********************/
		centerP = new CenterPanel();
		
		setLayout(new BorderLayout());
		add(centerP,BorderLayout.CENTER);
		add(southP,BorderLayout.SOUTH);
		
		setSize(300,400);
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		new PanelFrame();
	}

}
