package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutFrame extends Frame{

	Button b1,b2,b3,b4,b5;
	public BorderLayoutFrame(){
		b1 = new Button("CENTER");
		b2 = new Button("WEST");
		b3 = new Button("EAST");
		b4 = new Button("SOUTH");
		b5 = new Button("NORTH");
		
		//layout manager
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		
		add(b1,BorderLayout.CENTER);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.SOUTH);
		add(b5,BorderLayout.NORTH);
		
		this.setSize(300,180);
		this.setVisible(true);
	}	
	public static void main(String[] args) {
		new BorderLayoutFrame();

	}

}

