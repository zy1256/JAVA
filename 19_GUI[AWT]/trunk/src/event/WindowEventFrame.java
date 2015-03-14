package event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventFrame extends Frame{
	
	public WindowEventFrame() {
		
		setTitle("윈도우이벤트");
		//event
		this.addWindowListener(new WindowsEventHandler());
		
		
		setSize(300, 400);
		setVisible(true);
	}
	public class WindowsEventHandler implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("windowOpened");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("windowClosed");
			/*
			 * Terminates the currently running Java Virtual Machine. 
			 * The argument serves as a status code; by convention, 
			 * a nonzero status code indicates abnormal termination. 
			   This method calls the exit method in class Runtime. This method never returns normally. 

			 */
			System.exit(0);
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("windowIconified");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("windowDeiconified");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("windowActivated");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("windowDeactivated");
		}
		
	}

	public static void main(String[] args) {
		new WindowEventFrame();

	}

}
