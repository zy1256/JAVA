package basic;

import java.awt.Color;
import java.awt.Frame;

/*
 * 
	GUI 프로그램방법
		1. 컨테이너준비(Frame,Dialog,Window)
	    2. 컴포넌트 준비 (Button,List,Canvas,TextArea,TextField)
		3. 컨테이너에 컴포넌트를 부친다(add)
		4. 컨테이너의 크기설정
		5. 컨테이너 보여주기.
 */

public class AwtTestMain {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(300, 400);
		f.setVisible(true);
		f.setBackground(new Color(0xaa0000));
		f.setTitle("나의 첫번째 프레임");
		
		ExtendsFrame f1 = new ExtendsFrame();
		ContainerFrame f2 = new ContainerFrame();
		
	}

}
