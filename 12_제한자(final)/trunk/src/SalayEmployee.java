
public class SalayEmployee extends Employee{
	private int annualSalary;//ø¨∫¿
	public SalayEmployee() {
	}

	
	public SalayEmployee(int no , String name, int annualSalary) {
		super(no, name);
		this.annualSalary = annualSalary;
	}
	
	/*
	 * ¿Á¡§¿«
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
