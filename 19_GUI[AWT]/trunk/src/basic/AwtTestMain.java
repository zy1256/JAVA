package basic;

import java.awt.Color;
import java.awt.Frame;

/*
 * 
	GUI ���α׷����
		1. �����̳��غ�(Frame,Dialog,Window)
	    2. ������Ʈ �غ� (Button,List,Canvas,TextArea,TextField)
		3. �����̳ʿ� ������Ʈ�� ��ģ��(add)
		4. �����̳��� ũ�⼳��
		5. �����̳� �����ֱ�.
 */

public class AwtTestMain {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(300, 400);
		f.setVisible(true);
		f.setBackground(new Color(0xaa0000));
		f.setTitle("���� ù��° ������");
		
		ExtendsFrame f1 = new ExtendsFrame();
		ContainerFrame f2 = new ContainerFrame();
		
	}

}
