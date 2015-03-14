package jdbc.sqlminus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Statement;

import jdbc.member.ConnectionFactory;

public class SQLMinus {

	public static void main(String[] args) throws Exception{
		
		Connection con = ConnectionFactory.getConnection();
		Statement stmt = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try{
			System.out.print("SQL>");
			String readSql = br.readLine();
			boolean isRs = stmt.execute(readSql);
			if(isRs){
				//ResultSet
			}else{
				//update count
				int updateCount = stmt.getUpdateCount();
				System.out.println(updateCount + "행이 변경");
			}
			}catch(Exception e){
				System.out.print("ERROR : " + e.getMessage());				
			}
		}
	}

}
