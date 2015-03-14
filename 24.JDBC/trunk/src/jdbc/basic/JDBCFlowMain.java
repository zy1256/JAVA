package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. Driver Class Loading 
 * 2. Connection ����
 * 3. Statement ����
 * 4. submitting query
 * 5. ��� �ڵ鸵
 */
public class JDBCFlowMain {

	public static void main(String[] args) {
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@172.16.2.29:1521:XE";
		String user="scott";
		String password="tiger";
		try {
			/*
			 * 1. Driver Class Loading ����
			 */
			Class.forName(driverClass);
			/*
			 * 2. Connection ����
			 */
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("1.Connection: "+con);
			/*
			 * 3.Statement ����
			 */
			Statement stmt = con.createStatement();
			System.out.println("2.Statement : "+stmt);
			/*
			 * 4. submitting query
			 */
			String selectSql ="SELECT EMPNO,ENAME,JOB FROM EMP";
			ResultSet rs = stmt.executeQuery(selectSql);
			System.out.println("3-1.ResultSet: " + rs);
			
			//boolean isExist = rs.next();
			System.out.println("-----------------------------");
			System.out.println("EMPNO \t ENAME \t JOB");
			System.out.println("-----------------------------");
			while(rs.next()){
				int empno = rs.getInt("EMPNO");
				String ename=rs.getString("ENAME");
				String job = rs.getString("JOB");
				System.out.println(empno + "\t" + ename + "\t" + job);
			}
			System.out.println("-----------------------------");
			
			String deleteSql="DELETE FROM EMP WHERE EMPNO>=8000";
			int rows = stmt.executeUpdate(deleteSql);
			System.out.println("3-2.rows: "+rows + "���� ����");
			/*
			 * 6.close
			 */
			System.out.println("6.close");
			rs.close();
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
}
