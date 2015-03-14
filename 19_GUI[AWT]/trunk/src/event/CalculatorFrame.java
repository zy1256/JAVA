package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorFrame extends Frame implements ActionListener {
	Label displayL;
	Panel buttonP;
	String[] name = {"1" , "2" ,  "3" , "+",  
								 "4" , "5" ,  "6" , "-",
								 "7" , "8" ,  "9" , "*",
								 "0" , "=" ,  "c" ,"/"};
	Button[] allButton = new Button[name.length];
	public CalculatorFrame() {
		setTitle("허접계산기");
		displayL = new Label();
		displayL.setBackground(Color.LIGHT_GRAY);
		displayL.setText("0");
		displayL.setAlignment(Label.RIGHT);
		displayL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
		displayL.setForeground(Color.DARK_GRAY);
		buttonP = new Panel();
		buttonP.setLayout(new GridLayout(0, 4, 3, 3));
		setLayout(new BorderLayout());
		add(displayL, BorderLayout.NORTH);
		add(buttonP, BorderLayout.CENTER);
		// event
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	    for (int i = 0; i < name.length; i++) {
			allButton[i] = new Button(name[i]);
			buttonP.add(allButton[i]);
			allButton[i].addActionListener(this);
		}
		setSize(200, 220);
		setVisible(true);
	}
	public final static int FIRST_STATE=0;
	public final static int SECOND_STATE=1;
	public final static int THIRD_STATE=2;
	String first="";
	char op='+';
	String second="";
	String result="";
	int firstNumber ;
	int secondNumber;
	int resultNumber;
	boolean state = true;
	int status=FIRST_STATE;
	@Override
	public void actionPerformed(ActionEvent e) {
		Object sourceButton=e.getSource();
		String cmd=e.getActionCommand();
		if(cmd.equals("c")){
			displayL.setText("0");
			firstNumber = 0;
			state = true;
		}
		if(cmd.charAt(0)>='0' && cmd.charAt(0)<='9'){
			if(state){
				displayL.setText("");
				state = false;
			}
			displayL.setText(displayL.getText()+cmd);
		}else{
			System.out.print(""+firstNumber+op+displayL.getText()+"=");
			switch (op) {
			case '+':
				firstNumber += Integer.parseInt(displayL.getText());
				break;
			case '-':
				firstNumber -= Integer.parseInt(displayL.getText());
				break;
			case '*':
				firstNumber *= Integer.parseInt(displayL.getText());
				break;
			case '/':
				firstNumber /= Integer.parseInt(displayL.getText());
				break;
			}
			displayL.setText(""+ firstNumber);
			op = cmd.charAt(0);
			state=true;
		}
	}
	public static void main(String[] args) {
		new CalculatorFrame();
	}
}
