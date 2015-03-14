package jdbc.emp;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class EmpDaoMain {

	public static void main(String[] args) throws Exception {
		EmpDao empDao = new EmpDaoImpl();
		System.out.println("1.추가--------------------");
		Emp insertEmp = new Emp(9999,"명시기","MANAGER",7902,new Date(System.currentTimeMillis()),7000.0,300.0,20);
		int insertRow = empDao.insert(insertEmp);
		System.out.println("1-1.insert : " + insertRow + "행이 추가");
		
		System.out.println("2.삭제--------------------");
		int deleteRow = empDao.delete(9999);
		System.out.println("2-1.delete(9999) : " + deleteRow + "행이 삭제");
		
		/*Emp updateEmp = new Emp(7839,"KING","PRESIDENT",-1,new Date(System.currentTimeMillis()),4999,-1,10);
		empDao.update(updateEmp);*/
		System.out.println("3.emp-dept(empno 7839)-------------------");
		Map<String,Object> empDeptMap = empDao.findByNoEmpDept(7839);
		int empno = (Integer)empDeptMap.get("empno");
		String ename = (String)empDeptMap.get("ename");
		String dname = (String)empDeptMap.get("dname");
		String loc = (String)empDeptMap.get("loc");
		System.out.println(empno+"\t"+ename+"\t"+dname+"\t"+loc);

		System.out.println("4.emp-dept-------------------");
		List<Map<String,Object>> empDeptList = empDao.findAllEmpDept();
		for (Map<String, Object> map : empDeptList) {
			empno = (Integer)map.get("empno");
			ename = (String)map.get("ename");
			dname = (String)map.get("dname");
			loc = (String)map.get("loc");
			System.out.println(empno+" \t "+ename+" \t "+dname+" \t "+loc);
		}
		
		
		
		/*System.out.println("3.번호로 검색---------------");
		Emp findbyNo = empDao.findByNo(7566);
		System.out.println(findbyNo);
		System.out.println("-------------------------");
		System.out.println("4.이름으로 검색---------------");
		List<Emp> empfindByName = empDao.findByName("ALLEN");
		for (Emp emp : empfindByName) {
			System.out.println(emp);
		}
		System.out.println("-------------------------");
		System.out.println("5.sal로 검색(2000이상)---------");
		List<Emp> empFindBySal = empDao.findBySal(2000);
		for (Emp emp : empFindBySal) {
			System.out.println(emp);
		}
		System.out.println("-------------------------");
		System.out.println("6.job로검색(salesman)---------");
		List<Emp> empFindByJob = empDao.findByJob("SALESMAN");
		for (Emp emp : empFindByJob) {
			System.out.println(emp);
		}
		System.out.println("-------------------------");
		System.out.println("7.hiredate로검색(1981/11/17)---------");
		List<Emp> empFindByHiredate = empDao.findByHireDate("1981/11/17");
		for (Emp emp : empFindByHiredate) {
			System.out.println(emp);
		}
		System.out.println("-------------------------");
		List<Emp> empAll = empDao.findByAllEmp();
		for (Emp emp : empAll) {
			System.out.println(emp);
		}*/
	}

}
