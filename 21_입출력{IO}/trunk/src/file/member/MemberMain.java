package file.member;

import java.io.RandomAccessFile;
import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) throws Exception{
		RandomAccessFile raf = new RandomAccessFile("member.dat", "rw");
		
		System.out.println("1.---member write--");
		Member member1 = new Member(1,"���ȣ", 30,"��⵵��");
		
		/*
		 * |----------------------------------------------------------|
		 * |��ȣ(4byte)|�̸�(10byte == 5char)|����(4byte)|�ּ�(60byte)|
		 * |----------------------------------------------------------|
		 */
		int recored_size = 78;
		//��ȣ
		raf.seek(recored_size*0);
		raf.writeInt(member1.getNo());
		System.out.println("1.point : " + raf.getFilePointer());
		//�̸�
		String name = member1.getName();
		for (int i = 0; i < 5; i++) {
			if(i < name.length()){
				raf.writeChar(name.charAt(i));
			}else{
				raf.writeChar(' ');
			}
		}
		System.out.println("2.point : " + raf.getFilePointer());
		//����
		raf.writeInt(member1.getAge());
		System.out.println("3.point : " + raf.getFilePointer());
		//�ּ�
		String address = member1.getAddress();
		for (int i = 0; i < 30; i++) {
			if(i < address.length()){
				raf.writeChar(address.charAt(i));
			}else{
				raf.writeChar(' ');
			}
		}
		System.out.println("4.point : " + raf.getFilePointer());
		System.out.println("-------------------------------------------");
		System.out.println("1.---member write--");
		Member member2 = new Member(2,"����", 23,"����ù�");
		//��ȣ
		raf.seek(recored_size*1);
		raf.writeInt(member2.getNo());
		System.out.println("1.point : " + raf.getFilePointer());
		//�̸�
		String name2 = member2.getName();
		for (int i = 0; i < 5; i++) {
			if(i < name2.length()){
				raf.writeChar(name2.charAt(i));
			}else{
				raf.writeChar(' ');
			}
		}
		System.out.println("2.point : " + raf.getFilePointer());
		//����
		raf.writeInt(member2.getAge());
		System.out.println("3.point : " + raf.getFilePointer());
		//�ּ�
		String address2 = member2.getAddress();
		for (int i = 0; i < 30; i++) {
			if(i < address2.length()){
				raf.writeChar(address2.charAt(i));
			}else{
				raf.writeChar(' ');
			}
		}
		System.out.println("4.point : " + raf.getFilePointer());

		System.out.println("��ü ȸ���� : " +  raf.length()/recored_size);
		
		System.out.println("2.----member find(ȸ����ȣ�� ã��)----");
		Member readMember = new Member();
		
		int no=2;//ȸ����ȣ
		for (int i = 0; i < 2; i++) {
			raf.seek(recored_size*i);
			int tempNo = raf.readInt();
			System.out.println(tempNo);
			if(tempNo==2){
				raf.seek(recored_size*i);
				int tno = raf.readInt();
				//�̸�
				String tname="";
				for (int j = 0; j < 5; j++) {
					tname = tname + raf.readChar();
				}
				//����
				int tage = raf.readInt();
				//�ּ�
				String taddress="";
				for (int j = 0; j < 30; j++) {
					taddress = taddress + raf.readChar();
				}
				
				
				readMember.setNo(tno);
				readMember.setName(tname.trim());
				readMember.setAge(tage);
				readMember.setAddress(taddress.trim());
				break;
			}
		}
		System.out.println(readMember);
		
		
		
	}

}
