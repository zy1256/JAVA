package file.member;

import java.util.ArrayList;

public class MemberDaoMain {

	public static void main(String[] args)throws Exception {
		//create
		MemberDao memberDao=new MemberDao();
		int isCreate = memberDao.createMember(new Member(1, "김경호", 30, "SEOUL"));
		
		memberDao.createMember(new Member(2, "정경호", 33, "LA"));
		memberDao.createMember(new Member(3, "심경호", 34, "SEOUL"));
		memberDao.createMember(new Member(4, "양경호", 29, "BUSAN"));
		memberDao.createMember(new Member(5, "박경호", 28, "DAEGU"));
		memberDao.createMember(new Member(6, "민경호", 25, "ILSAN"));
	
		//read
		Member findMember=memberDao.findByNo(2);
		System.out.println("----------findByNo(2)-------");
		System.out.println(findMember);
		//update
		memberDao.updateMember(null);
		//delete
		memberDao.deleteMember(3);
		System.out.println("---------전체출력-----------");
		ArrayList<Member> memberList=memberDao.findByAll();
		for (Member member : memberList) {
			System.out.println(member);
		}
	}

}
