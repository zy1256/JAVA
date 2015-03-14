package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
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
public class ButtonActionEventFrame extends Frame{
	
	Button b;
	
	public ButtonActionEventFrame(){
		b = new Button("�̺�Ʈ�ҽ�[]");
		add(b,BorderLayout.SOUTH);
		
		//event
		b.addActionListener(new ButtonActionEventHandler(this));
		
		setSize(300,400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ButtonActionEventFrame();

	}

}
