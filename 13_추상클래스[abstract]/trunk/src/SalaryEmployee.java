
public class SalaryEmployee extends Employee{
	private int annualSalary;//����
	public SalaryEmployee() {
	}

	
	public SalaryEmployee(int no , String name, int annualSalary) {
		super(no, name);
		this.annualSalary = annualSalary;
	}
	
	/*
	 * ������
	 */
	public void calculatePay(){
		int tempPay = annualSalary/12;
		this.setPay(tempPay);
	}

	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
	
}
