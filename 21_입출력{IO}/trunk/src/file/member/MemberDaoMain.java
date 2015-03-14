package file.member;

import java.util.ArrayList;

public class MemberDaoMain {

	public static void main(String[] args)throws Exception {
		//create
		MemberDao memberDao=new MemberDao();
		int isCreate = memberDao.createMember(new Member(1, "���ȣ", 30, "SEOUL"));
		
		memberDao.createMember(new Member(2, "����ȣ", 33, "LA"));
		memberDao.createMember(new Member(3, "�ɰ�ȣ", 34, "SEOUL"));
		memberDao.createMember(new Member(4, "���ȣ", 29, "BUSAN"));
		memberDao.createMember(new Member(5, "�ڰ�ȣ", 28, "DAEGU"));
		memberDao.createMember(new Member(6, "�ΰ�ȣ", 25, "ILSAN"));
	
		//read
		Member findMember=memberDao.findByNo(2);
		System.out.println("----------findByNo(2)-------");
		System.out.println(findMember);
		//update
		memberDao.updateMember(null);
		//delete
		memberDao.deleteMember(3);
		System.out.println("---------��ü���-----------");
		ArrayList<Member> memberList=memberDao.findByAll();
		for (Member member : memberList) {
			System.out.println(member);
		}
	}

}
