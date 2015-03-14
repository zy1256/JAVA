package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.ArrayList;

public class TypingGameFrame extends Frame{
	ArrayList letterList1=new  ArrayList();
	ArrayList letterList2=new  ArrayList();
	private void init(){
		letterList1.add(new Letter("자바"));
		letterList1.add(new Letter("JAVA"));
		letterList1.add(new Letter("javA"));
		letterList1.add(new Letter("자바라"));
		
		
		for (int i = 0; i < letterList1.size(); i++) {
			Letter letter = (Letter)letterList1.get(i);
			letter.x=(int)(Math.random()*10)*50;
		}
		
	}
	public TypingGameFrame() {
		init();
		setSize(500, 500);
		setVisible(true);
		new LetterThread().start();
	}
	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < letterList1.size(); i++) {
			Letter letter=(Letter)letterList1.get(i);
			g.drawString(letter.letter,letter.x,letter.y);
		}
	}
	/**************Thread**********/
	public class LetterThread extends Thread{
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < letterList1.size(); i++) {
					Letter letter=(Letter)letterList1.get(i);
					letter.y=letter.y + 5;
				}
				repaint();
			}
		}
	}
	
	public static void main(String[] args) {
		new TypingGameFrame();
	}

}
