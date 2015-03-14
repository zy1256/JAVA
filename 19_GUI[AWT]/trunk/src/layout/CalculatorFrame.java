package layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class CalculatorFrame extends Frame {
	
	Label displayL;
	Panel buttonP;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,equalB,plusB,minusB,divB,mulB,clearB;
	
	public CalculatorFrame(){
		
		setTitle("°è»ê±â");
		displayL = new Label();
		displayL.setBackground(Color.LIGHT_GRAY);
		displayL.setText("0");
		displayL.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 14));
		displayL.setForeground(Color.DARK_GRAY);
		buttonP = new Panel();
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
		equalB = new Button("=");
		plusB = new Button("+");
		minusB = new Button("-");
		divB = new Button("/");
		mulB = new Button("*");
		clearB = new Button("c");
		buttonP.setLayout(new GridLayout(0,4,3,3));
		
		buttonP.add(b1);buttonP.add(b2);buttonP.add(b3);buttonP.add(plusB);
		buttonP.add(b4);buttonP.add(b5);buttonP.add(b6);buttonP.add(minusB);
		buttonP.add(b7);buttonP.add(b8);buttonP.add(b9);buttonP.add(divB);
		buttonP.add(b0);buttonP.add(equalB);buttonP.add(clearB);buttonP.add(mulB);
		
		setLayout(new BorderLayout());
		add(displayL,BorderLayout.NORTH);
		add(buttonP,BorderLayout.CENTER);
		setSize(200,220);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		new CalculatorFrame();

	}

}
