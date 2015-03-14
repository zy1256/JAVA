package card.layout;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CardLayoutFrame extends Frame implements ActionListener {
	LoginPanel loginP ;
	ListPanel listP;
	InsertPanel insertP;
	private Panel cardPane;
	private CardLayout cardLayout;
	Panel buttonPane;
	Button b1;
	Button b2;
	Button loginUIB;
	Button insertUIB;
	Button listUIB;
	Button dialogB;
	Button dialogsB;
	Image image=Toolkit.getDefaultToolkit().getImage("koreanfood.png");
	public CardLayoutFrame(String title) {
		super(title);
		cardLayout = new CardLayout();
		cardPane = new Panel();

		loginP = new LoginPanel();
		listP = new ListPanel();
		insertP = new InsertPanel();

		buttonPane = new Panel();
		b1 = new Button("이전");
		b2 = new Button("다음");
		loginUIB = new Button("로그인"){
			@Override
			public void paint(Graphics g) {
				g.drawImage(image, 0,0,CardLayoutFrame.this);
			}
		};
		
		 
		
		insertUIB = new Button("가입");
		listUIB = new Button("리스트");
		dialogB=new Button("dialog");
		dialogsB=new Button("dialogs");
		cardPane.setLayout(cardLayout);
		cardPane.add("login", loginP);
		cardPane.add("list", listP);
		cardPane.add("insert", insertP);
		
		buttonPane.add(b1);
		buttonPane.add(b2);
		buttonPane.add(loginUIB);
		buttonPane.add(insertUIB);
		buttonPane.add(listUIB);
		buttonPane.add(dialogB);
		buttonPane.add(dialogsB);
		

		this.add(cardPane, BorderLayout.CENTER);
		this.add(buttonPane, "South");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		loginUIB.addActionListener(this);
		listUIB.addActionListener(this);
		insertUIB.addActionListener(this);
		dialogB.addActionListener(this);
		dialogsB.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.setSize(400, 400);
		this.setVisible(true);
		this.setSize(300, 410);
		this.setLocation(300, 300);
		
		Thread t=new Thread(){
			public void run() {
				try {
					Thread.sleep(100);
					loginUIB.repaint();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			};
		};
		t.start();
	
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		String cmd = arg0.getActionCommand();
		if (cmd.equals("이전")) {
			cardLayout.previous(cardPane);
		} else if(cmd.equals("다음")) {
			cardLayout.next(cardPane);
		} else if(cmd.equals("로그인")){
			cardLayout.show(cardPane, "login");
		}else if(cmd.equals("가입")){
			cardLayout.show(cardPane, "list");
		}else if(cmd.equals("리스트")){
			cardLayout.show(cardPane, "insert");
		}else if(cmd.equals("dialog")){
			
			LoginDialog loginD=new LoginDialog(this, "로귄");
			loginD.setModal(true);
			loginD.setVisible(true);
			
			
			
		}else if(cmd.equals("dialogs")){
			
			int type=JOptionPane.showConfirmDialog(this, "로그인할래요!!!");
			System.out.println(type);
			
			String name=JOptionPane.showInputDialog(this, "이름을 입력");
			System.out.println(name);
			
			JOptionPane.showMessageDialog(this, "로그인실퐤", "로그인애로", JOptionPane.WARNING_MESSAGE);
			type=JOptionPane.showOptionDialog(this,
					"message",
					"title", 
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, 
					null, 
					new String[]{"오케바리","치소"},
					null);
			System.out.println(type);
		}
		
	}

	public static void main(String args[]) {
		new CardLayoutFrame("카드레이아웃");
	}
}
