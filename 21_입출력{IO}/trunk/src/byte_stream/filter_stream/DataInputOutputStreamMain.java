package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamMain {

	public static void main(String[] args) throws Exception{

		FileOutputStream fos = new FileOutputStream("dataOut.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		int writeInt = 21483647;
		/*
		int i1 = writeInt>>24;
		int i2 = writeInt>>16;
		int i3 = writeInt>>8;
		int i4 = writeInt;
		
		fos.write(i1);
		fos.write(i2);
		fos.write(i3);
		fos.write(i4);
		*/
		dos.writeInt(writeInt);
		dos.writeBoolean(true);
		dos.writeDouble(3.14159);
		dos.writeUTF("오늘도 우리반 회식날이여요!......");
		
		fos.close();
		dos.close();
		
		DataInputStream dis = new  DataInputStream( new FileInputStream("dataOut.txt"));
		int readInt = dis.readInt();
		System.out.println(readInt);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
	}

}
