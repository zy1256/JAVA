package jdbc.resultset;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.member.ConnectionFactory;
/*
 * 이름         널        유형            
---------- -------- ------------- 
ID        		NOT NULL NUMBER(7) 
NAME           			  VARCHAR2(50) 
SHORT_DESC          	  VARCHAR2(255) 
PRICE            			  NUMBER(10,3) 
IPGO_DATE          		  DATE      
 */
public class ResultSetMain {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from s_product");
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			int id =rs.getInt("id");
			String name = rs.getString("name");
			String desc = rs.getString("short_desc");
			double price = rs.getDouble("price");
			Date date = rs.getDate("ipgo_date");
			System.out.println(id+"\t\t"+name+" \t\t   "+desc+"\t\t "+price+" \t "+date);
		}
		
		rs.close();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
	}
}
