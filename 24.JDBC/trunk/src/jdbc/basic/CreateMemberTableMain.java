package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateMemberTableMain {

	public static void main(String[] args) {
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@172.16.2.29:1521:XE";
		String user="scott";
		String password="tiger";
		Connection con = null;
		Statement stmt=null;
		
		String createSql="create table member("
							+ "no number(4) primary key,"
							+ "id varchar2(20),"
							+ "name varchar2(20),"
							+ "phone varchar2(20),"
							+ "address varchar2(60))";
		String dropSql="drop table member";
		try{
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,user,password);
			stmt=con.createStatement();
			int dropSuccess = stmt.executeUpdate(dropSql);
			System.out.println("0.table drop success :  " + dropSuccess);
			int isSuccess = stmt.executeUpdate(createSql);
			System.out.println("1.table create success :  " + isSuccess);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
