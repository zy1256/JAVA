package jdbc.member;

import java.util.ArrayList;

public interface MemberDao {
	public int insert(MemberDto member) throws Exception;
	public int delete(int no) throws Exception;
	public int update(MemberDto member);
	public MemberDto selectByNo(int no) throws Exception;
	public ArrayList<MemberDto> selectAll() throws Exception;
}
