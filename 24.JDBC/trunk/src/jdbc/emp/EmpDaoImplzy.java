package jdbc.emp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jdbc.common.RdbDao;
import jdbc.member.ConnectionFactory;
import jdbc.member.MemberDto;

public class EmpDaoImplzy extends RdbDao implements EmpDao{

	@Override
	public int insert(Emp insertEmp) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String insertSql = "insert into emp values(?,?,?,?,?,?,?,?)";
		int row = 0;
		try{
			con = ConnectionFactory.getConnection();
			pstmt = con.prepareStatement(insertSql);
			pstmt.setInt(1, insertEmp.getEmpno());
			pstmt.setString(2, insertEmp.getEname());
			pstmt.setString(3, insertEmp.getJob());
			pstmt.setInt(4, insertEmp.getMgr());
			pstmt.setDate(5, insertEmp.getHiredate());
			pstmt.setDouble(6, insertEmp.getSal());
			pstmt.setDouble(7, insertEmp.getComm());
			pstmt.setInt(8, insertEmp.getDeptno());
			row = pstmt.executeUpdate();
		}finally{
			try {
				ConnectionFactory.releaseConnection(con);
			} catch (Exception e) {

			}
		}
		return row;
	}

	@Override
	public int delete(int empno) throws Exception {
		Connection con=null;
		Statement stmt=null;
		String deleteSql="delete from emp where empno="+empno;
		int row = 0;
		try {
			con=ConnectionFactory.getConnection();
			stmt=con.createStatement();
			row = stmt.executeUpdate(deleteSql);
		} finally {
				try {
					ConnectionFactory.releaseConnection(con);
				} catch (Exception e) {

				}
		}
		return row;
	}

	@Override
	public int update(Emp updateEmp) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Emp findByNo(int empno) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Emp empM = null;
		String findSql = "select * from emp where empno="+empno;
		try {
			con=ConnectionFactory.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery(findSql);
			if(rs.next()){
				int no = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				double sal = rs.getInt("sal");
				double comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				empM = new Emp(no,ename,job,mgr,hiredate,sal,comm,deptno);
			}
		} finally {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			ConnectionFactory.releaseConnection(con);
		}
		return empM;
	}

	@Override
	public List<Emp> findByName(String ename) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> empAll = new ArrayList<Emp>();
		Emp emp = null;
		String selectAll = "select * from emp where ename='"+ename+"'";
		try{
			con = ConnectionFactory.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectAll);
			while(rs.next()){
				int empno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				double sal = rs.getInt("sal");
				double comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				emp = new Emp(empno,name,job,mgr,hiredate,sal,comm,deptno);
				empAll.add(emp);
			}
		}catch(Exception e){
			System.out.println("찾을수없습니다.");
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
		return empAll;
	}

	@Override
	public List<Emp> findBySal(int sal) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> empAll = new ArrayList<Emp>();
		Emp emp = null;
		String selectAll = "select * from emp where sal>="+sal;
		try{
			con = ConnectionFactory.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectAll);
			while(rs.next()){
				int empno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				double empsal = rs.getInt("sal");
				double comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				emp = new Emp(empno,name,job,mgr,hiredate,empsal,comm,deptno);
				empAll.add(emp);
			}
		}catch(Exception e){
			System.out.println("찾을수없습니다.");
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
		return empAll;
	}

	@Override
	public List<Emp> findByJob(String job) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> empAll = new ArrayList<Emp>();
		Emp emp = null;
		String selectAll = "select * from emp where job='"+job+"'";
		try{
			con = ConnectionFactory.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectAll);
			while(rs.next()){
				int empno = rs.getInt("empno");
				String name = rs.getString("ename");
				String empjob = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate = rs.getDate("hiredate");
				double sal = rs.getInt("sal");
				double comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				emp = new Emp(empno,name,empjob,mgr,hiredate,sal,comm,deptno);
				empAll.add(emp);
			}
		}catch(Exception e){
			System.out.println("찾을수없습니다.");
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
		return empAll;
	}

	@Override
	public List<Emp> findByHireDate(String hireDate) throws Exception {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> empAll = new ArrayList<Emp>();
		Emp emp = null;
		String selectAll = "select * from emp where hiredate='"+hireDate+"'";
		try{
			con = ConnectionFactory.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectAll);
			while(rs.next()){
				int empno = rs.getInt("empno");
				String name = rs.getString("ename");
				String empjob = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date emphiredate = rs.getDate("hiredate");
				double sal = rs.getInt("sal");
				double comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				emp = new Emp(empno,name,empjob,mgr,emphiredate,sal,comm,deptno);
				empAll.add(emp);
			}
		}catch(Exception e){
			System.out.println("찾을수없습니다.");
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
		return empAll;
	}

	@Override
	public List<Emp> findByMgr(int mgr) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> findByComm(int comm) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> findByDept(int deptNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> findByAllEmp() throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		//DateFormat sdFormat = new SimpleDateFormat("YYYY/MM/DD");
		List<Emp> empAll = new ArrayList<Emp>();
		Emp emp = null;
		String selectAll = "select * from emp";
		try{
			con = ConnectionFactory.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectAll);
			while(rs.next()){
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				//Date hdate = rs.getDate("hiredate");
				//String hiredate = sdFormat.format(hdate); 
				Date hiredate = rs.getDate("hiredate");
				double sal = rs.getInt("sal");
				double comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				emp = new Emp(empno,ename,job,mgr,hiredate,sal,comm,deptno);
				empAll.add(emp);
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
		return empAll;
	}

	@Override
	public List<Map<String, Object>> findAllEmpDept() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> findByNoEmpDept(int empno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
