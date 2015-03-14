package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class CalculatorFrame_copy extends Frame {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSub,bMul,bDiv,bDot,bEql,bClean;
	TextField inputTF;
	TextField outputTF;
	Panel northP;
	Panel centerP;
	public CalculatorFrame_copy(){
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		b0 = new Button("0");
		bAdd = new Button("+");
		bSub = new Button("-");
		bMul = new Button("*");
		bDiv = new Button("/");
		bDot = new Button(".");
		bEql = new Button("=");
		bClean = new Button("C");
		
		inputTF = new TextField();
		outputTF = new TextField();
		
		northP = new Panel(); 
		northP.setBackground(new Color (251,255,250));
		northP.setLayout(new GridLayout(0,1));
		northP.add(inputTF);
		northP.add(outputTF);
		
		centerP = new Panel();
		centerP.setLayout(new GridLayout(0,4,5,5));
		centerP.add(b7);
		centerP.add(b8);
		centerP.add(b9);
		centerP.add(bDiv);
		centerP.add(b4);
		centerP.add(b5);
		centerP.add(b6);
		centerP.add(bMul);
		centerP.add(b1);
		centerP.add(b2);
		centerP.add(b3);
		centerP.add(bSub);
		centerP.add(bEql);
		centerP.add(b0);
		centerP.add(bClean);
		centerP.add(bAdd);
		
		setTitle("°è»ê±â");
		setLayout(new BorderLayout());
		add(northP,BorderLayout.NORTH);
		add(centerP,BorderLayout.CENTER);
		
		setSize(300,400);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		new CalculatorFrame_copy();

	}

}
