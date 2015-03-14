package basic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;

public class ExtendsFrame extends Frame{
	
	public ExtendsFrame(){
		super("나의 프레임[상속]");
		this.setTitle("나의프레임[상속]2");
		this.setBackground(new Color(0x0000aa));
		this.setSize(300,400);
		this.setVisible(true);
	}

}
