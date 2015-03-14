
public class Staff extends Person{
	public String depart;
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	public Staff(int no , String name , String depart) {
		this.no = no;
		this.name =name;
		this.depart = depart;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public void staffPrint(){
		System.out.println(no + "\t" + name + "\t" + depart);
	}

}
