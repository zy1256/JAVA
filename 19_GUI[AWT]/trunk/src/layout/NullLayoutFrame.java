package layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class NullLayoutFrame extends Frame{
	Label idL;
	Label passL;
	Button loginB;
	Button cancelB;
	TextField idTF;
	TextField passTF;
	
	public NullLayoutFrame(){
		
		idL = new Label("���̵�");
		passL = new Label("�о�����");
		loginB = new Button("�α���");
		cancelB = new Button("���");
		idTF = new TextField();
		passTF = new TextField();
		idL.setBounds(50, 50, 60, 20);
		idTF.setBounds(110, 50, 130, 20);
		passL.setBounds(50,90,60,20);
		passTF.setBounds(110, 90, 130, 20);
		loginB.setBounds(50, 130, 80, 20);
		cancelB.setBounds(160, 130, 80, 20);
		
		this.add(idL);
		this.add(idTF);
		this.add(passL);
		this.add(passTF);
		this.add(loginB);
		this.add(cancelB);
		this.setLayout(null);
		this.setResizable(false);
		this.setSize(300,180);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		NullLayoutFrame f = new NullLayoutFrame();

	}

}
