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
	//파일이름
	String fileName = "";
	//디렉토리
	String dirPath = "";
	//파일content
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
		Menu fileMenu = new Menu("파일");
		Menu editMenu = new Menu("편집");
		

		// MenuItem
		MenuItem newItem = new MenuItem("새파일", new MenuShortcut(KeyEvent.VK_N));
		MenuItem openItem = new MenuItem("열기", new MenuShortcut(KeyEvent.VK_O));
		MenuItem saveItem = new MenuItem("저장", new MenuShortcut(KeyEvent.VK_S));
		MenuItem saveAsItem = new MenuItem("다른이름으로저장", new MenuShortcut(
				KeyEvent.VK_A));
		MenuItem exitItem = new MenuItem("종료", new MenuShortcut(KeyEvent.VK_E));

		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(saveAsItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);

		// MenuBar -->Frame에 부친다.
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
		 * 1.기존에 파일이 로딩되어있는지여부 
		 * 2.파일로딩되어있을경우에는 원본파일데이타와 비교해서 다르면 저장할것인지여부
		 * 3.파일이로딩되어있지않은경우에는 텍스트에어리어 에 데이타가있는지여부검사
		 */
		noteTA.getText().compareTo(content);
		noteTA.setText(" ");
		noteTA.setText("");
		NotePadGUI.this.fileName="제목없음.txt";
		NotePadGUI.this.dirPath="";
		setTitle(fileName);
		
	}
	/*
	 * 1.기존에 파일이 로딩되어있는지여부 
	 * 2.파일로딩되어있을경우에는 원본파일데이타와 비교해서 다르면 저장할것인지여부
	 * 3.파일이로딩되어있지않은경우에는 텍스트에어리어 에 데이타가있는지여부검사
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
				
				FileDialog fd = new FileDialog(NotePadGUI.this, "열기", FileDialog.LOAD);
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
				  1.파일이 로딩된상태이면 로딩된파일에바로저장
				  	saveFile(saveDirPath, saveFileName);
				  2.파일이 로딩된상태가아니면 saveAs와똑같아요...
				  	FileDialog fd1 = new FileDialog(NotePadGUI.this, "저장",
						FileDialog.SAVE);
				   	fd1.setDirectory(dirPath);
				   	fd1.setFile(fileName);
				   	fd1.setVisible(true);
				 */
				if(fileName.equals("제목없음.txt") && dirPath.equals("")){
					//파일로딩안된상태
					FileDialog sd = new FileDialog(NotePadGUI.this, "저장" , FileDialog.SAVE);
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
			     //파일로딩안된상태
				FileDialog sd = new FileDialog(NotePadGUI.this, "저장" , FileDialog.SAVE);
				if(NotePadGUI.this.fileName.equals("제목없음.txt") && !NotePadGUI.this.dirPath.equals("")){
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