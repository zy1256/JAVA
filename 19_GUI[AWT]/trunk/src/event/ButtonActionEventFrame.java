package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
/*
Event program방법

  1. XXXEvent Source 선정(Button)(XXXEvent의 종류)--> ActionEvent
  2. XXXEvent Handler 작성(클래스)-->ActionEvent Handler작성
  3. Event Source 와 Event Handler를 연결해준다.
  	 ex> EventSource객체.addXXXListener(Event Handler 객체)
  	 	 <<b.addActionListener(.);>>
  
  # XXXEvent Handler 클래스 작성방법
       1.XXXEvent를 감지(처리)할수있는 XXXListener interface를 implement
       (ActionEvent)       (ActionListener)
  	   2.XXXListener 추상메쏘드 구현..
	   (WindowListener)

*/
public class ButtonActionEventFrame extends Frame{
	
	Button b;
	
	public ButtonActionEventFrame(){
		b = new Button("이벤트소스[]");
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
