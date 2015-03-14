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
		 * 1.PreparedStatement 생성시 query 작성방법
			 * A. SQL 작성시에 ?(파라메타) 를 사용해서 나중에 외부에서 데이타를 셋팅 시킬수있게할수있다.
			 * B. ?(파라메타) 는 데이타이외에 테이블이름,컬럼이름,키워드등은 사용할수없다.
			 * 		ex> select * from ? (X)
			 * 			 select empno,?,? from emp (X)
			 * C. query문의 기술순서대로 번호를 부여한다.
			 * 		ex> select * from emp where ename=? and empno=? and deptno=?
		 */
		
		String selectSql="select count(*) as cnt from emp where empno>=? and empno<=?";
		//Statement stmt = con.createStatement();
		/*
		 * 2. PreparedStatement 생성시 sql문을 인자로 넣어서 생성한다.
		 */
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		/*
		 * 3. 생성된 PreparedStatement에 파라메타를 바인딩시킨다.
		 */
		pstmt.setInt(1, 7000);
		pstmt.setInt(2, 7500);
		/*
		 * 4. query 문을 실행(sql)
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
		System.out.println("EMP검색 APPLICATION");
		System.out.println("-------------------------------------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true){
			System.out.println(">>>EMP의 검색시작번호입력");
			String strNumber1 = br.readLine();
			System.out.println(">>>EMP의 검색   끝번호입력");
			String strNumber2 = br.readLine();
			int no1 = Integer.parseInt(strNumber1);
			int no2 = Integer.parseInt(strNumber2);
			
			pstmt2.setInt(1, no1);
			pstmt2.setInt(2, no2);
			
			ResultSet rs3 = pstmt2.executeQuery();
			System.out.println("------------------------------");
			System.out.println("번호 \t 이름 \t 직무");
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
