package jdbc.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/*
 * member table 에 접근해서 
 * INSERT,UPDATE,DELETE,SELECT 작업을 하는 DAO(Data Access Object)객체
 */
public class MemberDaoImplZY implements MemberDao{
	private String driverClass = "oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@172.16.2.29:1521:XE";
	private String user="scott";
	private String password="tiger";
	private Connection con = null;
	private Statement stmt=null;
	private ResultSet rs=null;
	
	public int mUpdate(String member){
		int countRow = 0;
		try{
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,user,password);
			stmt = con.createStatement();
			countRow = stmt.executeUpdate(member);
		}catch(Exception e){
			System.out.println("ERROR MSG : " + e.getMessage());
			e.printStackTrace();
		}finally{
			try {
				if(rs != null)
				rs.close();
				if(stmt != null)
				stmt.close();
				if(con != null)
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}return countRow;
	}
	public MemberDto mSelect(String str){
		MemberDto member = new MemberDto();
		try{
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,user,password);
			stmt = con.createStatement();
			rs = stmt.executeQuery(str);
			while(rs.next()){
				int no = rs.getInt("no");
				String id =rs.getString("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				//System.out.println(no+" \t "+id+" \t "+name+" \t "+phone+" \t\t "+address);
				member.setNo(no);
				member.setId(id);
				member.setName(name);
				member.setPhone(phone);
				member.setAddress(address);
			}
		}catch(Exception e){
			System.out.println("ERROR MSG : " + e.getMessage());
			e.printStackTrace();
		}finally{
			try {
				if(rs != null)
				rs.close();
				if(stmt != null)
				stmt.close();
				if(con != null)
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return member;
	}
	@Override
	public int insert(MemberDto member) {
		int no = member.getNo();
		String strNo = String.valueOf(no);
		String id = member.getId();
		String name = member.getName();
		String phone = member.getPhone();
		String address = member.getAddress();
		int countRow = mUpdate("insert into member(no,id,name,phone,address) "
				+ "values(" + strNo + ",'"+id+"','"+name+"','"+phone+"','"+address+"')");
		return countRow;
	}

	@Override
	public int delete(int no) {
		String str = String.valueOf(no);
		int countRow = mUpdate("delete from member where no="+str);
		return countRow;
	}

	@Override
	public int update(MemberDto member) {
		
		return 0;
	}

	@Override
	public MemberDto selectByNo(int selectNo) {
		String strNo = String.valueOf(selectNo);
		String str = "select * from member where no="+strNo;
		MemberDto member = mSelect(str);
		return member;
	}

	@Override
	public ArrayList<MemberDto> selectAll() {
		ArrayList<MemberDto> memberAll = new ArrayList<MemberDto>();
		String str = "select * from member";
		MemberDto member = null;
		try{
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,user,password);
			stmt = con.createStatement();
			rs = stmt.executeQuery(str);
			while(rs.next()){
				int no = rs.getInt("no");
				String id =rs.getString("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				member = new MemberDto();
				member.setNo(no);
				member.setId(id);
				member.setName(name);
				member.setPhone(phone);
				member.setAddress(address);
				memberAll.add(member);
			}
		}catch(Exception e){
			System.out.println("ERROR MSG : " + e.getMessage());
			e.printStackTrace();
		}finally{
			try {
				if(rs != null)
				rs.close();
				if(stmt != null)
				stmt.close();
				if(con != null)
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return memberAll;
	}

}
