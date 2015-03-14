package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;

public class CenterPanel extends Panel {
	Button b1,b2,b3,b4,b5;
	public CenterPanel(){
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		
		setLayout(new GridLayout(0,2));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		setBackground(Color.PINK);
	}
	
}
