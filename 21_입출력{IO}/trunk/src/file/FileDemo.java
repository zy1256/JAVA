package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		System.out.println("1.File 구분자:"+File.separator);
		File file1 = new File("sample"+File.separator+"01.ArithmaticOerator.txt");
		File file2 = new File("sample","00.VariableDeclare.txt");
		System.out.println("2.file1 path: "+file1.getPath());
		System.out.println("3.file1 name: "+file1.getName());
		System.out.println("4.file1 parent dir: "+file1.getParent());
		System.out.println("5.file1 absolute path: " + file1.getAbsolutePath());
		System.out.println("----------------------------------");
		System.out.println("6.file2 path: "+file2.getPath());
		System.out.println("7.file2 name: "+file2.getName());
		System.out.println("8.file2 parent dir: "+file2.getParent());
		System.out.println("9.file2 absolute path: " + file2.getAbsolutePath());
		
		//directory
		File dir = new File("sample");
		if(dir.isDirectory()){
			System.out.println("10.DIR:"+dir.getName());
		}else if(dir.isFile()){
			System.out.println("10.FILE:"+dir.getName());
		}
		System.out.println("11.디렉토리안의 파일목록");
		String[] fileNames = dir.list();
		for (int i = 0; i < fileNames.length; i++) {
			System.out.println("\t"+fileNames[i]);
		}
		System.out.println("12.디렉토리안의 파일객체목록");
		
		File[] files=dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()){
				System.out.println("[DIR]"+files[i].getName());
				File[] subFiles = files[i].listFiles();
				for (int j = 0; j < subFiles.length; j++) {
					if(subFiles[j].isDirectory()){
						//Directory
					}else if(subFiles[j].isFile()){
						System.out.println("\t\t[FILE]"+subFiles[j].getName());
					}
				}
				
			}else if(files[i].isFile()){
				System.out.println("\t[FILE]"+files[i].getName());
			}
		}
		
		System.out.println("13. -------root directory-------");
		File[] roots = File.listRoots();
		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i].getPath());
		}
		File cDrive = roots[0];
		System.out.println("AbsolutePath : " + cDrive.getAbsolutePath());
		//c drive 파일 디렉토리의 목록
		System.out.println("14.--------c: drive-----------");
		File[] cFiles = cDrive.listFiles();
		for (int i = 0; i < cFiles.length; i++) {
			if(cFiles[i].isDirectory()){
				System.out.println("["+cFiles[i].getName()+"]");
			}else if(cFiles[i].isFile()){
				System.out.println("FILE" + cFiles[i].getName());
			}
		}
		//directory
		File newDir1 = new File("newDir1");
		File newDir2 = new File("newDir2");
		File newDir3 = new File("sample","newDir3");
		//생성
		newDir1.mkdir();
		newDir2.mkdir();
		newDir3.mkdir();
		System.out.println("----directory 생성-------");
		//이름변경
		boolean isRename = newDir2.renameTo(new File("renameDir2"));
		System.out.println("----directory rename-----" + isRename);
		//삭제
		boolean isDelete = newDir3.delete();
		System.out.println("----directory delete-----" + isDelete);
		//파일
		//생성
		File newFile1 = new File("newDir1","newFile1.txt");
		File newFile2 = new File("newDir1","newFile2.txt");
		
		try {
			boolean isCreate = newFile1.createNewFile();
			System.out.println("----file1 생성여부 : " + isCreate);
			isCreate = newFile2.createNewFile();
			System.out.println("----file2 생성여부 : " + isCreate);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		isRename= newFile2.renameTo(new File("newDir1","renameFile2.txt"));
		System.out.println("----file rename 여부 : " + isRename);
		newFile2.deleteOnExit();
		System.out.println("----file deleteOnExit()---");
		
		
		
	}
}
