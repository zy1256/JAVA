
public class Car {
	private int no;//Â÷¹øÈ£
	private String model;//¸ğµ¨
	//¿£Áø
	private Engine engine;
	private int wheelNumber;//¹ÙÄû¼ö
	
	public Car(){
		
	}
	//setter,getter

	public void setEngine(Engine engine){
		this.engine = engine;
	}
	public Engine getEngine(){
		return this.engine;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public int getWheelNumber() {
		return wheelNumber;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}

	public void print() {
		System.out.println("¹øÈ£ : " + no);
		System.out.println("¸ğµ¨ : " + model);
		
		//System.out.println("¿£Áø : " + engine.type);
		
		this.engine.print();
		System.out.println("ÈÙ¼ö : " + wheelNumber);
		
	}
	
	
}
