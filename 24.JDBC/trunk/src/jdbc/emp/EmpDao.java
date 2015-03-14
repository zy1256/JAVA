package jdbc.emp;

import java.util.List;
import java.util.Map;


public interface EmpDao {
	public int insert(Emp insertEmp) throws Exception;
	public int delete(int empno) throws Exception;
	public int update(Emp updateEmp) throws Exception;
	public Emp findByNo (int empno) throws Exception;
	public List<Emp> findByName (String ename) throws Exception;
	public List<Emp> findBySal (int sal) throws Exception;
	public List<Emp> findByJob (String job) throws Exception;
	public List<Emp> findByHireDate (String hireDate) throws Exception;
	public List<Emp> findByMgr (int mgr) throws Exception;
	public List<Emp> findByComm (int comm) throws Exception;
	public List<Emp> findByDept (int deptNo) throws Exception;
	public List<Emp> findByAllEmp () throws Exception;
	/*
	 * �μ��̸��� ��ġ�� �����ϴ� ��� �������Ÿ��ȯ
	 */
	public List<Map<String, Object>> findAllEmpDept() throws Exception;
	/*
	 * �μ��̸��� ��ġ�� �����ϴ� ��� ���1����Ÿ��ȯ
	 */
	public Map<String, Object> findByNoEmpDept(int empno) throws Exception;
}
