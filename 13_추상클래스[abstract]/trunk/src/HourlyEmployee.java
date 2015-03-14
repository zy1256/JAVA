
public class HourlyEmployee extends Employee{
	private int moneyPerHour;//�ñ�
	private int worksHour;//���ѽð�
	public HourlyEmployee() {
	}
	public HourlyEmployee(int no, String name,int moneyPerHour, int worksHour) {
		super(no, name);
		this.moneyPerHour = moneyPerHour;
		this.worksHour = worksHour;
	}
	@Override
	public void calculatePay() {
		int tempPay = moneyPerHour*worksHour;
		this.setPay(tempPay);
	}
	
	
	public int getMoneyPerHour() {
		return moneyPerHour;
	}
	public void setMoneyPerHour(int moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}
	public int worksHour() {
		return worksHour;
	}
	public void setWorksHour(int workssHour) {
		this.worksHour = workssHour;
	}
	

}
