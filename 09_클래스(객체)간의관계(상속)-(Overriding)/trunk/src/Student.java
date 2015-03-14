
public class Student extends Person{
	public String clazz;
	public Student() {
	}
	public Student(int no,String name, String clazz){
		this.no = no;
		this.name = name;
		this.clazz = clazz;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	/*public void studentPrint(){
		//this.print();
		System.out.println(no + "\t" + name + "\t" + clazz);
	}*/
	@Override
	public void print(){
		/*
		 * super : 은폐된멤버에 접근가능한 slef참조변수
		 */
		super.print();
		System.out.println(no + "\t" + name + "\t" + clazz);
	}
	
}
