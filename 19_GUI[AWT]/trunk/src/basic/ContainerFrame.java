package basic;

import java.awt.Color;
import java.awt.Frame;

public class ContainerFrame {
	
	Frame f;
	public ContainerFrame() {
		f = new Frame();
		f.setBackground(Color.cyan);
		f.setSize(300, 400);
		f.setVisible(true);
	}

}
