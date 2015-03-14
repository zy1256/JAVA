package file;

import java.io.RandomAccessFile;

/*
<<RandomAccessFile>>

1. ����� ����� ����
2. ���� ���� ����
3. �ڹ� �⺻ Ÿ�Ժ� �а�, ���� ����
4. ���� ����¿��� ��� ������ ��Ʈ�� ��ƿ Ŭ����
5. ����: 
    ����   - ���ϸ�(����°��� ����⽺Ʈ��)
             - "r" �б⸸���� "rw" �б⾲�� ����		
  ex>RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
6. ã��
         - seek ��������Ʈ�� �̵�
	ex>raf.seek(34);
         - getfilepointer ����Ʈ��ġ ã��
	ex>int pointer=raf.getFilePointer()
*/
public class RandomAccessFileMain {

	public static void main(String[] args) throws Exception{

		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		
		System.out.println("-------RandomAccessFile write--------");
		raf.writeBoolean(true);
		System.out.println("0. ������������ġ : " + raf.getFilePointer());
		raf.writeByte(10);
		System.out.println("1. ������������ġ : " + raf.getFilePointer());
		raf.writeInt(10);
		System.out.println("2. ������������ġ : " + raf.getFilePointer());
		raf.writeChar('��');
		System.out.println("3. ������������ġ : " + raf.getFilePointer());
		raf.writeChar('��');
		System.out.println("4. ������������ġ : " + raf.getFilePointer());
		raf.writeChar('ȣ');
		System.out.println("5. ������������ġ : " + raf.getFilePointer());
		raf.writeDouble(3.14159);
		System.out.println("6. ������������ġ : " + raf.getFilePointer());
		raf.writeUTF("�����׼��� ����");
		System.out.println("7. ������������ġ : " + raf.getFilePointer());
		
		System.out.println("----------RandomAccessFile read----------");
		System.out.println("A.��ġ : " + raf.getFilePointer());
		System.out.println("B.����ũ�� : " +  raf.length());
		raf.seek(0);
		System.out.println("C.��ġ : " + raf.getFilePointer());
		System.out.println("boolean : " + raf.readBoolean());
		System.out.println("D.��ġ : " + raf.getFilePointer());
		System.out.println("readByte : " + raf.readByte());
		System.out.println("readInt : " + raf.readInt());
		System.out.println("readChar : " + raf.readChar());
		System.out.println("readChar : " + raf.readChar());
		System.out.println("readChar : " + raf.readChar());
		System.out.println("readDouble : " + raf.readDouble());
		System.out.println("readUTF : " + raf.readUTF());
		
		raf.seek(6);
		System.out.println(raf.readChar());
		raf.readChar();
		System.out.println(raf.readChar());
		
	}

}
