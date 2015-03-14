
public class Engine {
	private String type;  //엔진타입
	private int  cc;	  //엔진배기량
	public Engine(){
		
	}
	public void print(){
		System.out.println("엔진타입 : " + type);
		System.out.println("엔진배기량 : " + cc);
	}
	
	//getter, setter
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
