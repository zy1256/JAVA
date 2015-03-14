
public class SalaryEmployee extends Employee{
	private int annualSalary;//¿¬ºÀ
	public SalaryEmployee() {
	}
	
	public SalaryEmployee(int no,String name,int annualSalary) {
		super(no, name);
		this.annualSalary = annualSalary;
	}
	/*
	 * ÀçÁ¤ÀÇ
	 */
	
	public void calculatePay(){
		int tempPay=annualSalary/12;
		this.setPay(tempPay);
	}
	
	/*
	public final void calculateIncentive(){
		if(pay>=1000000){
			incentive =(int)(pay*INCENTIVE_RATE);
		}
	} 
	*/
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	

}
