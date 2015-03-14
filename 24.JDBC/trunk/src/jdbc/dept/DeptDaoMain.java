package jdbc.dept;

import java.util.List;
import java.util.Map;

public class DeptDaoMain {

	public static void main(String[] args) throws Exception{
		DeptDao deptDao=new DeptDaoImpl();
		
		
		/*Dept newDept=new Dept(80, "생산", "부산");
		System.out.println("1.dept insert-----------------");
		deptDao.insert(newDept);
		*/
		System.out.println("2.dept list-------------------");
		List<Dept> deptList=deptDao.selectByAll();
		for (Dept dept : deptList) {
			System.out.println(dept);
		}
		System.out.println("3.dept-------------------------");
		Dept dept=deptDao.selectByNo(80);
		System.out.println(dept);
		
		System.out.println("4.emp,dept----------------------");
		
	
		
	}

}
