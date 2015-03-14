package jdbc.resultset;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import jdbc.member.ConnectionFactory;

public class ScrollableResultSetMain {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp order by empno asc");
		rs.afterLast();
		System.out.println("---------------afterLast------------------");
		while (rs.previous()) {
			int empno=rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			Date hireDate = rs.getDate(5);
			System.out.println(empno+" \t "+ename+" \t "+job+" \t "+hireDate);
		}
		System.out.println("----------------rs.next()-----------------");
		while (rs.next()) {
			int empno=rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			Date hireDate = rs.getDate(5);
			System.out.println(empno+" \t "+ename+" \t "+job+" \t "+hireDate);
		}
		System.out.println("------------------first---------------------");
		rs.first();
		System.out.println(rs.getInt("empno")+" \t "+rs.getString("ename"));
		System.out.println("------------------last---------------------");
		rs.last();
		System.out.println(rs.getInt("empno")+" \t "+rs.getString("ename"));
		int rowCount = rs.getRow();
		System.out.println("rowCount : " + rowCount);
		System.out.println("------------------absolute-----------------");
		rs.absolute(3);
		System.out.println(rs.getInt("empno")+" \t "+rs.getString("ename"));
		System.out.println("-------------------relative--------------------");
		rs.relative(1);//rs.relative(-1);
		System.out.println(rs.getInt("empno")+" \t "+rs.getString("ename"));
		System.out.println("---------------update resultset---------------------");
		System.out.println("---------------1.update---------------------");
		rs.first();
		rs.updateString(2, "KIM");
		rs.updateRow();
		System.out.println(rs.getInt("empno")+" \t "+rs.getString("ename"));
		System.out.println("---------------2.delete---------------------");
		rs.last();
		rs.deleteRow();
		System.out.println("---------------2.insert---------------------");
		rs.moveToInsertRow();
		rs.updateInt(1, 9800);
		rs.updateString(2, "±Ë∞Ê»£");
		rs.updateString(3, "CLERK");
		rs.updateInt(4, 7900);
		rs.updateDate(5, new Date(System.currentTimeMillis()));
		rs.updateDouble(6, 3000.67);
		rs.updateFloat(7, 200f);
		rs.updateInt(8, 10);
		rs.insertRow();
		System.out.println("------------select---------------");
		rs.beforeFirst();
		while(rs.next()){
			int empno=rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			Date hireDate = rs.getDate(5);
			System.out.println(empno+" \t "+ename+" \t "+job+" \t "+hireDate);
		}
		rs.last();
		
		
		
		
		
		
		
		
		
		
	}
}
