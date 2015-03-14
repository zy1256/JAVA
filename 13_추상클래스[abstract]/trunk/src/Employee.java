
public abstract class Employee {
	/*
	 * 인센티브율(10%)
	 */
	public static final double INCENTIVE_RATE = 0.1;
	private int no; //사번
	private String name; // 사원이름
	private int pay; // 급여
	private int incentive; //인센티브
	public Employee() {
	}
	
	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	/*
	 * 월급계산
	 * 모든Employee에서 재정의 해야하는메쏘드
	 */
	public abstract void calculatePay();
	/*
	 * 인센티브계산
	 * 급여가 100만원이 넘으면 지급
	 * 모든 Employee 에서 그대로 사용 해야하는메쏘드
	 */
	public final void calculateIncentive(){
		if(pay>=1000000){
			incentive = (int)(pay*INCENTIVE_RATE);
		}
	}
	
	public void print(){
		System.out.println(no + "\t" + name +"\t" + pay + "\t" + incentive);
	}
	
	//setter,getter

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	
	
	
}
