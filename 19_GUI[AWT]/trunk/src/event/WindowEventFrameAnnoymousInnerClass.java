package event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventFrameAnnoymousInnerClass extends Frame{
	
	public WindowEventFrameAnnoymousInnerClass() {
		setTitle("윈도우이벤트[익명내부클래스]");
		//event
		this.addWindowListener(new WindowListener(){
			public void windowOpened(WindowEvent e) {
				System.out.println("windowOpened");
			}
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				/*
				 Terminates the currently running Java Virtual Machine
				 */
				System.exit(0);
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed");
			}
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified");
			}
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified");
			}
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated");
			}
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated");
			}
		});
		setSize(300, 400);
		setVisible(true);
	}
	/*******inner classs*******/
	//public class WindowEventHandler implements WindowListener
	public static void main(String[] args) {
		new WindowEventFrame();

	}

}
