
public class Engine {
	private String type;  //����Ÿ��
	private int  cc;	  //������ⷮ
	public Engine(){
		
	}
	public void print(){
		System.out.println("����Ÿ�� : " + type);
		System.out.println("������ⷮ : " + cc);
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
