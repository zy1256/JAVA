
public class Car {
	private int no;//����ȣ
	private String model;//��
	//����
	private Engine engine;
	private int wheelNumber;//������
	
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
		System.out.println("��ȣ : " + no);
		System.out.println("�� : " + model);
		
		//System.out.println("���� : " + engine.type);
		
		this.engine.print();
		System.out.println("�ټ� : " + wheelNumber);
		
	}
	
	
}
