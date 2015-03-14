package file;

import java.io.RandomAccessFile;

/*
<<RandomAccessFile>>

1. 양방향 입출력 가능
2. 임의 접근 가능
3. 자바 기본 타입별 읽고, 쓰기 가능
4. 파일 입출력에만 사용 가능한 스트림 유틸 클래스
5. 생성: 
    인자   - 파일명(입출력가능 양방향스트림)
             - "r" 읽기만가능 "rw" 읽기쓰기 가능		
  ex>RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
6. 찾기
         - seek 파일포인트를 이동
	ex>raf.seek(34);
         - getfilepointer 포인트위치 찾기
	ex>int pointer=raf.getFilePointer()
*/
public class RandomAccessFileMain {

	public static void main(String[] args) throws Exception{

		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		
		System.out.println("-------RandomAccessFile write--------");
		raf.writeBoolean(true);
		System.out.println("0. 파일포인터위치 : " + raf.getFilePointer());
		raf.writeByte(10);
		System.out.println("1. 파일포인터위치 : " + raf.getFilePointer());
		raf.writeInt(10);
		System.out.println("2. 파일포인터위치 : " + raf.getFilePointer());
		raf.writeChar('김');
		System.out.println("3. 파일포인터위치 : " + raf.getFilePointer());
		raf.writeChar('경');
		System.out.println("4. 파일포인터위치 : " + raf.getFilePointer());
		raf.writeChar('호');
		System.out.println("5. 파일포인터위치 : " + raf.getFilePointer());
		raf.writeDouble(3.14159);
		System.out.println("6. 파일포인터위치 : " + raf.getFilePointer());
		raf.writeUTF("랜덤액세스 파일");
		System.out.println("7. 파일포인터위치 : " + raf.getFilePointer());
		
		System.out.println("----------RandomAccessFile read----------");
		System.out.println("A.위치 : " + raf.getFilePointer());
		System.out.println("B.파일크리 : " +  raf.length());
		raf.seek(0);
		System.out.println("C.위치 : " + raf.getFilePointer());
		System.out.println("boolean : " + raf.readBoolean());
		System.out.println("D.위치 : " + raf.getFilePointer());
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
