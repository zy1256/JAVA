
public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] employees={
				new SalaryEmployee(1,"KIM",20000000),
				new SalaryEmployee(2,"LEE",24000000),
				new SalaryEmployee(3,"PARK",10000000),
				new HourlyEmployee(4,"CHOI",10000,120),
				new HourlyEmployee(5,"SIM",10000,80)
		};
		
		for (int i = 0; i < employees.length; i++) {
			employees[i].calculatePay();
			employees[i].calculateIncentive();
			employees[i].print();
		}

	}

}
