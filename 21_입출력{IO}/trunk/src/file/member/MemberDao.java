package file.member;

import java.io.RandomAccessFile;
import java.util.ArrayList;

/*
 * DAO(Data Access Object)
 * 
 * �������Ÿ�� �����ϰ��ִ� ����Ÿ����(���̺�,����)�� �����ؼ�
 * �������(create),����б�(read),�������(update),�������(delete)
 * �� �Ҽ��ִ� �������(�޽��)�� �����ϴ� Ŭ����(��ü)
 */
public class MemberDao {

	/*
	 * 
	 * ----------------------------------------------- |memberCount(4)
	 * |��ȣ(4byte)|�̸�(10byte)|����(4)|�ּ�(60byte)|
	 * |��ȣ(4byte)|�̸�(10byte)|����(4)|�ּ�(60byte)|
	 * |��ȣ(4byte)|�̸�(10byte)|����(4)|�ּ�(60byte)|
	 * |��ȣ(4byte)|�̸�(10byte)|����(4)|�ּ�(60byte)|
	 * |��ȣ(4byte)|�̸�(10byte)|����(4)|�ּ�(60byte)|
	 */

	private RandomAccessFile raf;
	// ��ϵȷ��ڵ��(�����)
	private int recordCount;
	// 1�� ������ڵ��� �ѹ���Ʈ��
	public static final int RECORD_LENGTH = 78;
	// ��ϵȷ��ڵ��(�����) ���� ������
	public static final int RECORD_COUNT_LENGTH = 4;

	public MemberDao() throws Exception {
		raf = new RandomAccessFile("memberDao.dat", "rw");
		if (raf.length() != 0) {
			recordCount = raf.readInt();
			System.out.println(recordCount + " �� ���");
		} else {
			/*
			 * ���ϻ���,��ϵȸ������
			 */
			System.out.println(recordCount + " �� ���(���ϻ�����)");
		}

	}
	private boolean isDuplicateNo(int no){
		Member member = new Member();
		
		return true;
	}
	// ȸ������
	public int createMember(Member member) {
		/*
		 * ����:0
		 * ����(���̵��ߺ�):1
		 * ����(�𸣴¾ַ�):2
		 */
		int isCreate=2;
		try {

			// ��ȣ�ߺ�üũ??
			if(isDuplicateNo(member.getNo())){
				isCreate=1;
				return isCreate;
			}
			// 1.������ ������ �����ͷ��̵�
			raf.seek((recordCount * RECORD_LENGTH) + RECORD_COUNT_LENGTH);
			// 2.���ο��� ����
			int no = member.getNo();// 4
			String name = member.getName();// 10
			int age = member.getAge();// 4
			String address = member.getAddress();// 60

			// ��ȣ
			raf.writeInt(no);
			// �̸�

			int charCount = name.length();
			for (int i = 0; i < 5; i++) {
				if (i < charCount) {
					raf.writeChar(name.charAt(i));
				} else {
					raf.writeChar(' ');
				}
			}
			// ����
			raf.writeInt(age);
			// �ּ�
			for (int i = 0; i < 30; i++) {
				if (i < address.length()) {
					raf.writeChar(address.charAt(i));
				} else {
					raf.writeChar(' ');
				}
			}
			// ���ڵ� �߰��Ŀ� �����͸� ó�������̵����� ���ڵ������
			raf.seek(0);
			raf.writeInt(++recordCount);
			isCreate=0;
		} catch (Exception e) {
			isCreate =2;
		}
		return isCreate;
	}

	// ȸ��ã��(��ȣ)
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

	// ȸ��ã��(�̸�)
	public ArrayList<Member> findByName(String name) {
		return null;
	}

	// ȸ����üã��
	public ArrayList<Member> findByAll() throws Exception {
		ArrayList<Member> memberList = new ArrayList<Member>();
		for (int i = 0; i < recordCount; i++) {
			Member member = findByIndex(i);
			memberList.add(member);
		}
		return memberList;
	}

	// ȸ�� index��ã��
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

	// ȸ������
	public void updateMember(Member member) {

	}

	// ȸ������
	public void deleteMember(int no) {

	}
}
