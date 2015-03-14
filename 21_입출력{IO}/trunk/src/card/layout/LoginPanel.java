package card.layout;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

public class LoginPanel extends Panel {
	@Override
	public void paint(Graphics g) {
		Image image=Toolkit.getDefaultToolkit().getImage("koreanfood.png");
		g.drawImage(image, 0,0,getWidth(),getHeight(),this);
	}
	public LoginPanel() {
		this.setBackground(Color.RED);
		
	}
}
