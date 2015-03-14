package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDeleteUpdateSelectMemberTableMain {

	public static void main(String[] args) {
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@172.16.2.29:1521:XE";
		String user="scott";
		String password="tiger";
		Connection con = null;
		Statement stmt=null;
		ResultSet rs=null;
		String insertSql="insert into member(no,id,name,phone,address) "
							+ "values(10,'guard10','왕경호','010-554-8437','경기도민')";
		String deleteSql="delete from member where no=10";
		String updateSql="update member set phone='000-000-0000' where no>5";
		String selectSql="select * from member";
		
		try{
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,user,password);
			stmt = con.createStatement();
			int insertRow = stmt.executeUpdate(insertSql);
			System.out.println("1.memeber insert : "+ insertRow + "행이 삽입");
			int deleteRows = stmt.executeUpdate(deleteSql);
			System.out.println("2.member delete : " + deleteRows + "행이 삭제");
			int updateRows = stmt.executeUpdate(updateSql);
			System.out.println("3.member update : " + updateRows + "행이 갱신");
			rs = stmt.executeQuery(selectSql);
			System.out.println("--------------------------------------------");
			System.out.println("no \t id \t name \t phone \t\t address");
			System.out.println("--------------------------------------------");
			while(rs.next()){
				int no = rs.getInt("no");
				String id =rs.getString("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				System.out.println(no+" \t "+id+" \t "+name+" \t "+phone+" \t\t "+address);
				
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
	}

}
