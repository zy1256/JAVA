package paint;

/*
 <<< public void paint(Graphics g) >>>
 Paints this component. 
 This method is called when the contents of the 
 component should be painted;
 1.such as when the component is first being shown 
 2.or is damaged and in need of repair.
 3.The clip rectangle in the Graphics parameter
 is set to the area which needs to be painted.

 Subclasses of Component 
 that override this method need not call super.paint(g). 

 */

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintFrame extends Frame implements KeyListener {
	int pX,pY;//펭귄위치
	int imageIndex;
	Image[] penguins=new Image[3];
	public PaintFrame() {
		// event
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		this.addKeyListener(this);

		setSize(300, 400);
		setVisible(true);
		
		pX=110;
		pY=320;
		imageIndex=0;
		for (int i = 0; i < penguins.length; i++) {
			penguins[i]=Toolkit.getDefaultToolkit().getImage("penguin"+(i+1)+".gif");
		}
		
	}

	@Override
	public void paint(Graphics g) {
		// super.paint(g);
		// System.out.println(Thread.currentThread().getName());
		// 배경이미지
		Toolkit tk1 = Toolkit.getDefaultToolkit();
		Image bImage = tk1.getImage("penguin_back.jpg");
		g.drawImage(bImage, 0, 0, 300, 400, this);

		// String
		g.drawString("페인트", 20, 50);

		// 색변경
		g.setColor(Color.BLUE);
		// rect
		g.drawRect(20, 70, 50, 50);
		g.fillRect(20, 130, 50, 50);
		// circle
		g.setColor(Color.RED);
		g.drawOval(getWidth() / 2 - 25, getHeight() / 2 - 25, 50, 50);
		g.fillOval(getWidth() / 2 - 20, getHeight() / 2 - 20, 40, 40);
		// image
		g.drawImage(penguins[imageIndex], pX, pY, this);

	}

	/********** KeyListener impl메쏘드 *******/
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		//System.out.println("pressed");
		int keyCode = e.getKeyCode();
		//System.out.println("keyCode:" + keyCode);
		switch (keyCode) {
		case KeyEvent.VK_RIGHT:
			pX=pX+5;
			break;
		case KeyEvent.VK_LEFT:
			pX=pX-5;
			break;
		}
		//imageIndex++;
		imageIndex=++imageIndex%3;
		repaint();
	}
	public void keyReleased(KeyEvent e) {}
	/****************************************/
	public static void main(String[] args) {
		new PaintFrame();
	}
}
