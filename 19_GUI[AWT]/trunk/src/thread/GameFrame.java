package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameFrame extends Frame implements MouseListener{
	
	final static int LEFT=0;
	final static int RIGHT=1;
	Image backImage;
	Image planeImage;
	int pX, pY;// 비행기위치
	boolean isAlive;
	int direction;
	
	GameThread gt;
	
	public GameFrame() {
		backImage = Toolkit.getDefaultToolkit().getImage("game_back.jpg");
		planeImage = Toolkit.getDefaultToolkit().getImage("plane3.png");
		pX = 30;
		pY = 30;
		isAlive=false;
		direction=RIGHT;
		//event
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cX = e.getX();
				if(cX>pX){
					direction=RIGHT;
				}else if(cX<pX){
					direction=LEFT;
				}
			}
		});
		setSize(400, 400);
		setVisible(true);
		startGame();
	}
	public void startGame(){
		gt=new GameThread();
		isAlive=true;
		gt.start();
		
	}
	public void stopGame(){
		isAlive=false;
		gt=null;
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(backImage, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(planeImage, pX, pY, this);
	}
	@Override
	public void update(Graphics g) {
		//전체지우기
		paint(g);
	}
	/***************inner class*************/
	
	/************* GameThread **************/
	public class GameThread extends Thread {
		@Override
		public void run() {
			while (isAlive) {
				try {
					Thread.sleep(100);
					switch (direction) {
					case RIGHT:
						pX=pX+5;
						pY=pY+1;
						break;
					case LEFT:	
						pX=pX-5;
						pY=pY-1;
						break;
					}
					if(pX<-planeImage.getWidth(GameFrame.this)){
						pX=400;
					}
					if(pY<-planeImage.getHeight(GameFrame.this)){
						pY=400;
					}
					
					if(pX>400){
						pX = -planeImage.getWidth(GameFrame.this);
					}
					if(pY>400){
						pY = -planeImage.getHeight(GameFrame.this);
					}
					repaint();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//end while
		}//end run
	}//end inner class

	/*************************************/

	public static void main(String[] args) {
		new GameFrame();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
