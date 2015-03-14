package jdbc.statement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.member.ConnectionFactory;

public class PreparedStatementMain {

	public static void main(String[] args) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		/*
		 * 1.PreparedStatement ������ query �ۼ����
			 * A. SQL �ۼ��ÿ� ?(�Ķ��Ÿ) �� ����ؼ� ���߿� �ܺο��� ����Ÿ�� ���� ��ų���ְ��Ҽ��ִ�.
			 * B. ?(�Ķ��Ÿ) �� ����Ÿ�̿ܿ� ���̺��̸�,�÷��̸�,Ű������� ����Ҽ�����.
			 * 		ex> select * from ? (X)
			 * 			 select empno,?,? from emp (X)
			 * C. query���� ���������� ��ȣ�� �ο��Ѵ�.
			 * 		ex> select * from emp where ename=? and empno=? and deptno=?
		 */
		
		String selectSql="select count(*) as cnt from emp where empno>=? and empno<=?";
		//Statement stmt = con.createStatement();
		/*
		 * 2. PreparedStatement ������ sql���� ���ڷ� �־ �����Ѵ�.
		 */
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		/*
		 * 3. ������ PreparedStatement�� �Ķ��Ÿ�� ���ε���Ų��.
		 */
		pstmt.setInt(1, 7000);
		pstmt.setInt(2, 7500);
		/*
		 * 4. query ���� ����(sql)
		 */
		ResultSet rs1 = pstmt.executeQuery();
		rs1.next();
		int empCount = rs1.getInt("cnt");
		System.out.println("1. empCount(7000~7500) : " + empCount);
		pstmt.clearParameters();
		pstmt.setInt(1, 7501);
		pstmt.setInt(2, 7700);
		ResultSet rs2=pstmt.executeQuery();
		rs2.next();
		empCount = rs2.getInt(1);
		System.out.println("2. empCount(7501~7700)");
		String selectSql2 = "select * from emp where empno>? and empno<=?";
		PreparedStatement pstmt2 = con.prepareStatement(selectSql2);
		System.out.println("-------------------------------------------");
		System.out.println("EMP�˻� APPLICATION");
		System.out.println("-------------------------------------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true){
			System.out.println(">>>EMP�� �˻����۹�ȣ�Է�");
			String strNumber1 = br.readLine();
			System.out.println(">>>EMP�� �˻�   ����ȣ�Է�");
			String strNumber2 = br.readLine();
			int no1 = Integer.parseInt(strNumber1);
			int no2 = Integer.parseInt(strNumber2);
			
			pstmt2.setInt(1, no1);
			pstmt2.setInt(2, no2);
			
			ResultSet rs3 = pstmt2.executeQuery();
			System.out.println("------------------------------");
			System.out.println("��ȣ \t �̸� \t ����");
			System.out.println("------------------------------");
			while (rs3.next()) {
				int no = rs3.getInt("empno");
				String ename = rs3.getString("ename");
				String job = rs3.getString("job");
				System.out.println(no+"\t"+ename+"\t"+job);
			}
			pstmt2.clearParameters();
			
			
			
			
		}
		
		
		
	}
}
