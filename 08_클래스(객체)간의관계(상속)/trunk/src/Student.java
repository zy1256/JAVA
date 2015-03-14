
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
	public void studentPrint(){
		//this.print();
		System.out.println(no + "\t" + name + "\t" + clazz);
	}
}
