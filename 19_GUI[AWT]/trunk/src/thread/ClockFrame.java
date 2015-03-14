package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

public class ClockFrame extends Frame implements MouseListener{
	boolean isAlive;
	String timeStr="0000.00.00 000";
	ClockThread ct;
	boolean flag;
	int timeX,timeY;
	
	public ClockFrame() {
		
		setSize(300, 150);
		setVisible(true);
		//event
		this.addMouseListener(this);
		
		timeX=70;
		timeY=80;
		flag = true;
		clockStart();
	}
	public void clockStart(){
		ct=new ClockThread();
		isAlive=true;
		ct.start();
	}
	public void clockStop(){
		isAlive=false;
		ct=null;
	}
	@Override
	public void paint(Graphics g) {
		g.drawString(timeStr, timeX, timeY);
	}
	/*********MouserListener impl***************/
	public void mouseClicked(MouseEvent e) {
		int cX=e.getX();
		int cY=e.getY();
		timeX = cX;
		timeY = cY;
		repaint();
		System.out.println("click:"+cX+","+cY);
		
		if(flag){
			clockStop();
		}else{
			clockStart();
		}
		flag=!flag;
		setTitle(flag+"");
	}
	public void mousePressed(MouseEvent e) {
		int cX=e.getX();
		int cY=e.getY();
		timeX = cX;
		timeY = cY;
		repaint();
		System.out.println("press:"+cX+","+cY);
		
	}
	public void mouseReleased(MouseEvent e) {
		int cX=e.getX();
		int cY=e.getY();
		System.out.println("realese:"+cX+","+cY);
	}
	public void mouseEntered(MouseEvent e) {
		int cX=e.getX();
		int cY=e.getY();
		System.out.println("enter:"+cX+","+cY);
	}
	public void mouseExited(MouseEvent e) {
		int cX=e.getX();
		int cY=e.getY();
		System.out.println("exit:"+cX+","+cY);
	}
	/***************inner class***********/
	public class ClockThread extends Thread{
		@Override
		public void run() {
			while (isAlive) {
				
				try {
					Thread.sleep(1000);
					/*
					 public void repaint();
					 - this method causes a call 
					   to this component's paint method as soon as possible.
					 */
					Date currentTime=new Date();
					timeStr=currentTime.toLocaleString();
					ClockFrame.this.repaint();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return;
		}
	}
	/******************************************/
	public static void main(String[] args) {
		new ClockFrame();
	}
	
}
