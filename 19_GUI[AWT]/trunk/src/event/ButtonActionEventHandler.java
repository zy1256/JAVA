package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionEventHandler implements ActionListener{
	ButtonActionEventFrame f;
	public ButtonActionEventHandler(ButtonActionEventFrame f) {
		this.f = f;
	}
	int count;
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		f.setTitle(count + ",");
		int r = (int) (Math.random()*255);
		int g = (int) (Math.random()*255);
		int b = (int) (Math.random()*255);
		f.setBackground(new Color(r,g,b));
	}

}
