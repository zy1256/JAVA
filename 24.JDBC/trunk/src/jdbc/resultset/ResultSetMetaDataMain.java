package jdbc.resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import jdbc.member.ConnectionFactory;

public class ResultSetMetaDataMain {

	public static void main(String[] args) throws Exception{
		
		Connection con = ConnectionFactory.getConnection();
		Statement stmt = con.createStatement();
		String anySql = "select * from emp";
		stmt.executeQuery(anySql);
		ResultSet rs = stmt.executeQuery(anySql);
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int columnCount = rsmd.getColumnCount();
		System.out.println("column count : " + columnCount);
		
		for(int i=1;i<=columnCount;i++){
			System.out.println("--------------"+i+"��° �÷�-------------");
			System.out.println("�÷��̸� : "+rsmd.getColumnName(i));
			System.out.println("�÷�DBŸ�� : "+rsmd.getColumnTypeName(i));
			System.out.println("NULL��뿩�� : "+rsmd.isNullable(i));
			System.out.println("�÷��ڹ�Ÿ�� : "+rsmd.getColumnClassName(i));
			System.out.println("�÷����÷��̻����� : "+rsmd.getColumnDisplaySize(i));
		}
		
	}

}
