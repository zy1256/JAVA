package jdbc.member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberDaoMain {

	public static void main(String[] args) throws Exception{

		MemberDao memberDao = new MemberRdbDaoImpl();
		MemberDto insertMmber = new MemberDto(10,"newm","�嵿��","010-5484-4731","����");
		
		System.out.println("1.------insert-----------");
		int insertRow = memberDao.insert(insertMmber);
		System.out.println("�߰� : "+insertRow+"�����߰�");
		
		System.out.println("2.-------selectByNo-----");
		MemberDto selectMember = memberDao.selectByNo(5);
		if(selectMember==null){
			System.out.println("�׷��������");
		}else{
			MemberDto.headerPrint();
			System.out.println(selectMember.toString());
		}
		
		System.out.println("3.------delete---------");
		int deleteRows = memberDao.delete(10);
		System.out.println("3.delete : "+deleteRows+"���̻���");
		
		System.out.println("4.------update---------");
		MemberDto updateMember = new MemberDto();
		int updateRows = memberDao.update(updateMember);
		System.out.println("4.delete : "+updateRows+"���̻���");
		
		System.out.println("5.------selectAll-------");
		ArrayList<MemberDto> memberList = memberDao.selectAll();
		MemberDto.headerPrint();
		for (MemberDto memberDto : memberList) {
			System.out.println(memberDto);
		}
	}

}
