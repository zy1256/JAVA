package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
Event program���

  1. XXXEvent Source ����(Button)(XXXEvent�� ����)--> ActionEvent
  2. XXXEvent Handler �ۼ�(Ŭ����)-->ActionEvent Handler�ۼ�
  3. Event Source �� Event Handler�� �������ش�.
  	 ex> EventSource��ü.addXXXListener(Event Handler ��ü)
  	 	 <<b.addActionListener(.);>>
  
  # XXXEvent Handler Ŭ���� �ۼ����
       1.XXXEvent�� ����(ó��)�Ҽ��ִ� XXXListener interface�� implement
       (ActionEvent)       (ActionListener)
  	   2.XXXListener �߻�޽�� ����..
	   (WindowListener)

*/
public class ButtonActionEventFrameInnerClass extends Frame{
	
	Button b;
	
	public ButtonActionEventFrameInnerClass(){
		b = new Button("�̺�Ʈ�ҽ�[]");
		add(b,BorderLayout.SOUTH);
		
		//event
		b.addActionListener(new ButtonActionEventHandlerInnerClass());
		
		setSize(300,400);
		setVisible(true);
		
	}
	/***************************member inner class*******************************/
	public class ButtonActionEventHandlerInnerClass implements ActionListener{
		int count;
		@Override
		public void actionPerformed(ActionEvent e) {

			System.out.println(e.toString());
			setTitle(count + ",");
			int r = (int) (Math.random()*255);
			int g = (int) (Math.random()*255);
			int b = (int) (Math.random()*255);
			setBackground(new Color(r,g,b));
			
		}
		
	}
	/****************************************************************************/
	
	public static void main(String[] args) {
		new ButtonActionEventFrameInnerClass();

	}

}
