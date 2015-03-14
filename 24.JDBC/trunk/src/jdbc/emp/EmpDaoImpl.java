package jdbc.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jdbc.common.RdbDao;
import jdbc.member.ConnectionFactory;

public class EmpDaoImpl extends RdbDao implements EmpDao{
	@Override
	public int insert(Emp insertEmp) throws Exception {
		Connection con = null;
		PreparedStatement pstmt= null;
		String insertSql = "insert into emp values(?,?,?,?,?,?,?,?)";
		int insertRow = 0;
		try{
			con=getConnection();
			pstmt = con.prepareStatement(insertSql);
			pstmt.setInt(1, insertEmp.getEmpno());
			pstmt.setString(2, insertEmp.getEname());
			pstmt.setString(3, insertEmp.getJob());
			pstmt.setInt(4, insertEmp.getMgr());
			pstmt.setDate(5, insertEmp.getHiredate());
			pstmt.setDouble(6, insertEmp.getSal());
			pstmt.setDouble(7, insertEmp.getComm());
			pstmt.setInt(8, insertEmp.getDeptno());
			insertRow = pstmt.executeUpdate();
		}finally{
			if(con!=null)
				releaseConnection(con);
		}	
		return insertRow;
	}
	@Override
	public int delete(int empno) throws Exception {

		Connection con=null;
		PreparedStatement pstmt=null;
		String deleteSql="delete from emp where empno=?";
		int deleteRows = 0;
		try {
			con=ConnectionFactory.getConnection();
			pstmt=con.prepareStatement(deleteSql);
			pstmt.setInt(1, empno);
			deleteRows = pstmt.executeUpdate();
			
		} finally {
				try {
					ConnectionFactory.releaseConnection(con);
				} catch (Exception e) {

				}
		}
		return deleteRows;
	}
	@Override
	public int update(Emp updateEmp) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Emp findByNo(int empno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Emp> findByName(String ename) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Emp> findBySal(int sal) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Emp> findByJob(String job) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Emp> findByHireDate(String hireDate) throws Exception {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map<String, Object>> findAllEmpDept() throws Exception {
		List<Map<String,Object>> empDeptList= new ArrayList<Map<String,Object>>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectSql = "select empno,ename,dname,loc "
				+ "from emp e join dept d "
				+ "on e.deptno = d.deptno";
		try{
			con=getConnection();
			pstmt = con.prepareStatement(selectSql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Map<String, Object> empDeptMap = new HashMap<String, Object>();
				empDeptMap.put("empno", rs.getInt("empno"));
				empDeptMap.put("ename", rs.getString("ename"));
				empDeptMap.put("dname", rs.getString("dname"));
				empDeptMap.put("loc", rs.getString("loc"));
				empDeptList.add(empDeptMap);
			}
		}finally{
			if(con!=null)
				releaseConnection(con);
		}
		return empDeptList;
	}
	@Override
	public Map<String, Object> findByNoEmpDept(int empno) throws Exception {
		Map<String, Object> empDeptMap = new HashMap<String, Object>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectSql = "select empno,ename,dname,loc "
				+ "from emp e join dept d "
				+ "on e.deptno=d.deptno and e.empno=?";
		try{
			con=getConnection();
			pstmt = con.prepareStatement(selectSql);
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			if(rs.next()){
				empDeptMap.put("empno", rs.getInt("empno"));
				empDeptMap.put("ename", rs.getString("ename"));
				empDeptMap.put("dname", rs.getString("dname"));
				empDeptMap.put("loc", rs.getString("loc"));
			}
		}finally{
			if(con!=null)
				releaseConnection(con);
		}
		return empDeptMap;
	}
}
