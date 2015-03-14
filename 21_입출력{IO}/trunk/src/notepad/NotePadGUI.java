package notepad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class NotePadGUI extends Frame {
	
	
	TextArea noteTA;
	File readFile = null;
	Label statusL = null;
	//�����̸�
	String fileName = "";
	//���丮
	String dirPath = "";
	//����content
	String content="";
	public NotePadGUI() {
		init();
	}
	private void init() {
		setFont(new Font("Serif", Font.BOLD, 22));
		setFont(new Font("Serif", Font.BOLD, 24));
		noteTA = new TextArea();
		statusL = new Label();
		noteTA.setBackground(Color.PINK);
		// MenuBar
		MenuBar menuBar = new MenuBar();
		// Menu
		Menu fileMenu = new Menu("����");
		Menu editMenu = new Menu("����");
		

		// MenuItem
		MenuItem newItem = new MenuItem("������", new MenuShortcut(KeyEvent.VK_N));
		MenuItem openItem = new MenuItem("����", new MenuShortcut(KeyEvent.VK_O));
		MenuItem saveItem = new MenuItem("����", new MenuShortcut(KeyEvent.VK_S));
		MenuItem saveAsItem = new MenuItem("�ٸ��̸���������", new MenuShortcut(
				KeyEvent.VK_A));
		MenuItem exitItem = new MenuItem("����", new MenuShortcut(KeyEvent.VK_E));

		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(saveAsItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);

		// MenuBar -->Frame�� ��ģ��.
		setMenuBar(menuBar);

		add(noteTA,BorderLayout.CENTER);
		add(statusL, BorderLayout.SOUTH);
		// event
		MenuItemHandler mh = new MenuItemHandler();
		newItem.addActionListener(mh);
		newItem.setActionCommand("new");
		openItem.addActionListener(mh);
		openItem.setActionCommand("open");
		saveItem.addActionListener(mh);
		saveItem.setActionCommand("save");
		saveAsItem.addActionListener(mh);
		saveAsItem.setActionCommand("saveAs");
		exitItem.addActionListener(mh);
		exitItem.setActionCommand("exit");

		this.addWindowListener(new WindowExitHandler());
		setSize(700, 800);
		setVisible(true);
		fileNew();
	}


	private void setMessage(String msg) {
		statusL.setText(msg);
	}
	private void fileNew() {
		/*
		 * 1.������ ������ �ε��Ǿ��ִ������� 
		 * 2.���Ϸε��Ǿ�������쿡�� �������ϵ���Ÿ�� ���ؼ� �ٸ��� �����Ұ���������
		 * 3.�����̷ε��Ǿ�����������쿡�� �ؽ�Ʈ����� �� ����Ÿ���ִ������ΰ˻�
		 */
		noteTA.getText().compareTo(content);
		noteTA.setText(" ");
		noteTA.setText("");
		NotePadGUI.this.fileName="�������.txt";
		NotePadGUI.this.dirPath="";
		setTitle(fileName);
		
	}
	/*
	 * 1.������ ������ �ε��Ǿ��ִ������� 
	 * 2.���Ϸε��Ǿ�������쿡�� �������ϵ���Ÿ�� ���ؼ� �ٸ��� �����Ұ���������
	 * 3.�����̷ε��Ǿ�����������쿡�� �ؽ�Ʈ����� �� ����Ÿ���ִ������ΰ˻�
	 */
	
	private void loadFile(String dirPath, String fileName) {
		try{
			BufferedReader br = new BufferedReader(new FileReader(dirPath+fileName));
			noteTA.setText("");
			StringBuffer sb = new StringBuffer();
			while (true) {
				String readLine = br.readLine();
				if(readLine==null)break;
				//System.out.println(readLine);
				sb.append(readLine+"\n");
			}
			noteTA.setText(sb.toString());
			this.content=sb.toString();
		}catch(Exception e){
			this.setMessage(e.getMessage());
		}
		this.fileName = fileName;
		this.dirPath = dirPath;
		this.setTitle(fileName);
		this.setMessage("load : " + dirPath + fileName);
	}
	
   
	
	private void saveFile(String saveDirPath, String saveFileName) {
		

	}
	
	/************** MenuItem Handler(ActionEvent) *******/
	public class MenuItemHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			e.getSource();
			String actionCommand = e.getActionCommand();
			//System.out.println(actionCommand);
			switch (actionCommand) {
			case "open":
				
				FileDialog fd = new FileDialog(NotePadGUI.this, "����", FileDialog.LOAD);
				fd.setVisible(true);
				//thread blocking
				String dir = fd.getDirectory();
				String file = fd.getFile();
				System.out.println(dir+","+file);
				if(dir == null || file==null){
					return;
				}
				loadFile(dir, file);
				break;
			case "save":
				
				/*
				  1.������ �ε��Ȼ����̸� �ε������Ͽ��ٷ�����
				  	saveFile(saveDirPath, saveFileName);
				  2.������ �ε��Ȼ��°��ƴϸ� saveAs�ͶȰ��ƿ�...
				  	FileDialog fd1 = new FileDialog(NotePadGUI.this, "����",
						FileDialog.SAVE);
				   	fd1.setDirectory(dirPath);
				   	fd1.setFile(fileName);
				   	fd1.setVisible(true);
				 */
				if(fileName.equals("�������.txt") && dirPath.equals("")){
					//���Ϸε��ȵȻ���
					FileDialog sd = new FileDialog(NotePadGUI.this, "����" , FileDialog.SAVE);
					sd.setVisible(true);
					String dirPath = sd.getDirectory();
					String fileName = sd.getFile();
					if(dirPath == null || fileName == null){
						return;
					}
					System.out.println(dirPath+fileName);
					saveFile(dirPath, fileName);
					
				}else{
					saveFile(NotePadGUI.this.dirPath, NotePadGUI.this.fileName);
					
				}
				break;
			case "saveAs":
			     //���Ϸε��ȵȻ���
				FileDialog sd = new FileDialog(NotePadGUI.this, "����" , FileDialog.SAVE);
				if(NotePadGUI.this.fileName.equals("�������.txt") && !NotePadGUI.this.dirPath.equals("")){
					sd.setDirectory(NotePadGUI.this.dirPath);
					sd.setFile(NotePadGUI.this.fileName);
				}
				sd.setVisible(true);
				String dirPath = sd.getDirectory();
				String fileName = sd.getFile();
				if(dirPath == null || fileName == null){
					return;
				}
				System.out.println(dirPath+fileName);
				saveFile(dirPath, fileName);
				break;
			case "new":
				fileNew();
				break;
			case "exit":
				System.exit(0);
				break;
			}

		}

	}

	/**************** WindowAdapter extends ***********/
	public class WindowExitHandler extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	/*****************************************************/
	public static void main(String[] args) {
		new NotePadGUI();
	}
}