package jdbc.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/*
 * member table 에 접근해서 
 * INSERT,UPDATE,DELETE,SELECT 작업을 하는 DAO(Data Access Object)객체
 */
public class MemberRdbDaoImpl implements MemberDao{
	@Override
	public int insert(MemberDto member) throws Exception {
		Connection con=null;
		Statement stmt=null;
		String insertSql="insert into member values("+member.getNo()+",'"
																+member.getId()+"','"
																+member.getName()+"','"
																+member.getPhone()+"','"
																+member.getAddress()+"')";
		int row=0;
		try {
			con=ConnectionFactory.getConnection();
			stmt=con.createStatement();
			row = stmt.executeUpdate(insertSql);
		} finally {
				try {
					ConnectionFactory.releaseConnection(con);
				} catch (Exception e) {

				}
		}
		return row;
	}
	public int pinsert(MemberDto member) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		String insertSql="insert into member values(?,?,?,?,?)";
		int row=0;
		try {
			con=ConnectionFactory.getConnection();
			pstmt=con.prepareStatement(insertSql);
			pstmt.setInt(1, member.getNo());
			pstmt.setString(2, member.getId());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, member.getAddress());
			row = pstmt.executeUpdate();
		} finally {
				try {
					ConnectionFactory.releaseConnection(con);
				} catch (Exception e) {

				}
		}
		return row;
	}

	@Override
	public int delete(int no) throws Exception{
		Connection con=null;
		Statement stmt=null;
		String insertSql="delete from member where no="+no;
		int row=0;
		try {
			con=ConnectionFactory.getConnection();
			stmt=con.createStatement();
			row = stmt.executeUpdate(insertSql);
		} finally {
				try {
					ConnectionFactory.releaseConnection(con);
				} catch (Exception e) {

				}
		}
		return row;
	}

	@Override
	public int update(MemberDto member) {
		
		return 0;
	}

	@Override
	public MemberDto selectByNo(int no) throws Exception{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		MemberDto member = null;
		String selectSql="select * from member where no="+no;
		try {
			con=ConnectionFactory.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery(selectSql);
			if(rs.next()){
				int n = rs.getInt("no");
				String id = rs.getString("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				member = new MemberDto(n,id,name,phone,address);
			}
		} finally {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			ConnectionFactory.releaseConnection(con);
		}
		return member;
	}

	@Override
	public ArrayList<MemberDto> selectAll() throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectSql="select * from member";
		ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
		try{
			con = ConnectionFactory.getConnection();
			pstmt = con.prepareStatement(selectSql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int no = rs.getInt("no");
				String id = rs.getString("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				MemberDto member = new MemberDto(no,id,name,phone,address);
				memberList.add(member);
			}
		}finally{
			if(con!=null){
				ConnectionFactory.releaseConnection(con);
			}
				
		}
		
		
		return memberList;
	}

}
