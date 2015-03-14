package jdbc.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.member.ConnectionFactory;

public class StatementMain {

	public static void main(String[] args) throws Exception{
		Connection con = null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String selectSql="select * from member order by no desc";
		String updateSql="update member set address='서울특별시' where no=1";
		
		String anySql=updateSql;
		
		con = ConnectionFactory.getConnection();
		stmt = con.createStatement();
		int updateRows = stmt.executeUpdate(updateSql);
		System.out.println("1.---------executeUpdate------------");
		System.out.println(updateRows + " 행이 갱신 ");
		
		stmt.setMaxRows(5);
		rs=stmt.executeQuery(selectSql);
		while (rs.next()) {
			System.out.println(rs.getInt("no")+" \t "+rs.getString("id") + " \t " + rs.getString("name"));
		}
		
		boolean isRs =stmt.execute(anySql);
		if(isRs){
			//ResultSet
			rs=stmt.getResultSet();
			while (rs.next()){
				System.out.println(rs.getInt("no")+" \t "+rs.getString("id") + " \t " + rs.getString("name"));
			}
		}else{
			//update count
			updateRows = stmt.getUpdateCount();
			System.out.println(updateRows + " 행이 갱신 ");
		}
		
	}

}
