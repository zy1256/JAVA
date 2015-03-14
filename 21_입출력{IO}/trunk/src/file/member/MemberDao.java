package file.member;

import java.io.RandomAccessFile;
import java.util.ArrayList;

/*
 * DAO(Data Access Object)
 * 
 * 멤버데이타를 저장하고있는 데이타원본(테이블,파일)에 접근해서
 * 멤버쓰기(create),멤버읽기(read),멤버수정(update),멤버삭제(delete)
 * 를 할수있는 단위기능(메쏘드)를 제공하는 클래스(객체)
 */
public class MemberDao {

	/*
	 * 
	 * ----------------------------------------------- |memberCount(4)
	 * |번호(4byte)|이름(10byte)|나이(4)|주소(60byte)|
	 * |번호(4byte)|이름(10byte)|나이(4)|주소(60byte)|
	 * |번호(4byte)|이름(10byte)|나이(4)|주소(60byte)|
	 * |번호(4byte)|이름(10byte)|나이(4)|주소(60byte)|
	 * |번호(4byte)|이름(10byte)|나이(4)|주소(60byte)|
	 */

	private RandomAccessFile raf;
	// 등록된레코드수(멤버수)
	private int recordCount;
	// 1개 멤버레코드의 총바이트수
	public static final int RECORD_LENGTH = 78;
	// 등록된레코드수(멤버수) 저장 사이즈
	public static final int RECORD_COUNT_LENGTH = 4;

	public MemberDao() throws Exception {
		raf = new RandomAccessFile("memberDao.dat", "rw");
		if (raf.length() != 0) {
			recordCount = raf.readInt();
			System.out.println(recordCount + " 명 멤버");
		} else {
			/*
			 * 파일생성,등록된멤버없음
			 */
			System.out.println(recordCount + " 명 멤버(파일생성시)");
		}

	}
	private boolean isDuplicateNo(int no){
		Member member = new Member();
		
		return true;
	}
	// 회원저장
	public int createMember(Member member) {
		/*
		 * 성공:0
		 * 실패(아이디중복):1
		 * 실패(모르는애로):2
		 */
		int isCreate=2;
		try {

			// 번호중복체크??
			if(isDuplicateNo(member.getNo())){
				isCreate=1;
				return isCreate;
			}
			// 1.파일의 마지막 포인터로이동
			raf.seek((recordCount * RECORD_LENGTH) + RECORD_COUNT_LENGTH);
			// 2.새로운멤버 저장
			int no = member.getNo();// 4
			String name = member.getName();// 10
			int age = member.getAge();// 4
			String address = member.getAddress();// 60

			// 번호
			raf.writeInt(no);
			// 이름

			int charCount = name.length();
			for (int i = 0; i < 5; i++) {
				if (i < charCount) {
					raf.writeChar(name.charAt(i));
				} else {
					raf.writeChar(' ');
				}
			}
			// 나이
			raf.writeInt(age);
			// 주소
			for (int i = 0; i < 30; i++) {
				if (i < address.length()) {
					raf.writeChar(address.charAt(i));
				} else {
					raf.writeChar(' ');
				}
			}
			// 레코드 추가후에 포인터를 처음으로이동시켜 레코드수증가
			raf.seek(0);
			raf.writeInt(++recordCount);
			isCreate=0;
		} catch (Exception e) {
			isCreate =2;
		}
		return isCreate;
	}

	// 회원찾기(번호)
	public Member findByNo(int no) throws Exception {
		Member member = null;
		String name = "";
		int age = 0;
		String address = "";
		for (int i = 0; i < recordCount; i++) {
			raf.seek((i * RECORD_LENGTH) + RECORD_COUNT_LENGTH);
			int tempNo = raf.readInt();
			//System.out.println(tempNo);
			if (tempNo != no) {
				continue;
			}else if (tempNo == no){
				raf.seek((i * RECORD_LENGTH) + RECORD_COUNT_LENGTH);
				no = raf.readInt();
				for (int j = 0; j < 5; j++) {
					name += raf.readChar();
				}
				age = raf.readInt();
	
				for (int j = 0; j < 30; j++) {
					address += raf.readChar();
				}
				member = new Member();
				member.setNo(no);
				member.setName(name.trim());
				member.setAge(age);
				member.setAddress(address.trim());
				break;
			}
		}
		return member;
	}

	// 회원찾기(이름)
	public ArrayList<Member> findByName(String name) {
		return null;
	}

	// 회원전체찾기
	public ArrayList<Member> findByAll() throws Exception {
		ArrayList<Member> memberList = new ArrayList<Member>();
		for (int i = 0; i < recordCount; i++) {
			Member member = findByIndex(i);
			memberList.add(member);
		}
		return memberList;
	}

	// 회원 index로찾기
	private Member findByIndex(int index) throws Exception {
		Member member = null;
		int no = 0;
		String name = "";
		int age = 0;
		String address = "";

		raf.seek((index * RECORD_LENGTH) + RECORD_COUNT_LENGTH);
		no = raf.readInt();
		for (int j = 0; j < 5; j++) {
			name += raf.readChar();
		}
		age = raf.readInt();
		for (int j = 0; j < 30; j++) {
			address += raf.readChar();
		}
		member = new Member();
		member.setNo(no);
		member.setName(name.trim());
		member.setAge(age);
		member.setAddress(address.trim());
		return member;
	}

	// 회원수정
	public void updateMember(Member member) {

	}

	// 회원삭제
	public void deleteMember(int no) {

	}
}
