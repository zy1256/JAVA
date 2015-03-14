
public class Car {
	//차량생상대수를 저장할 공용변수
	public static int count; 
	
	private String model;
	private String color;
	private int cc;
	/*
	 * alt+shift+s --> r (getter,setter)
	 * alt+shift+s --> o (생성자)
	 */
	public Car(String model, String color, int cc) {
		this.model = model;
		this.color = color;
		this.cc = cc;
		Car.count++;
	}
	
	public void instance_static_access(){
		System.out.println(this.model);
		System.out.println(Car.count);
		//System.out.println(this.count);
	}
	/*
	 * static context (method,block)내에서 this 사용불가
	 */
	public static void static_instance_access(){
		//System.out.println(this.model);
		System.out.println(Car.count);
		System.out.println(count);
		//System.out.println(this.count);
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
	
}
