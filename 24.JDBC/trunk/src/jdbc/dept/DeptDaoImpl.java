package jdbc.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jdbc.member.ConnectionFactory;
public class DeptDaoImpl  implements DeptDao{

	@Override
	public void insert(Dept department) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String insertSql = "insert into dept values(?,?,?)";
		int row = 0;
		try{
			con = ConnectionFactory.getConnection();
			pstmt = con.prepareStatement(insertSql);
			pstmt.setInt(1, department.getDeptno());
			pstmt.setString(2, department.getDname());
			pstmt.setString(3, department.getLoc());
			row = pstmt.executeUpdate();
		}finally{
			try{
				ConnectionFactory.releaseConnection(con);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public Dept selectByNo(int deptno) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Dept department = null;
		String selectSql = "select * from dept where deptno="+deptno;
		try{
			con = ConnectionFactory.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectSql);
			if(rs.next()){
				int no = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				department = new Dept(no,dname,loc);
			}
		}finally{
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			ConnectionFactory.releaseConnection(con);
		}
		return department;
	}

	@Override
	public List<Dept> selectByAll() throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Dept> deptAll = new ArrayList<Dept>();
		Dept dept = null;
		String selectAll = "select * from dept";
		try{
			con = ConnectionFactory.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectAll);
			while(rs.next()){
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				dept = new Dept(deptno,dname,loc);
				deptAll.add(dept);
			}
		}catch(Exception e){
			System.out.println("ERROR MSG :" + e.getMessage());
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
				ConnectionFactory.releaseConnection(con);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return deptAll;
	}

	@Override
	public List<Map<String, Object>> selectEmployees() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Dept deparment) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}










