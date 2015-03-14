package file.member;

/*
 * 멤버 1명의 데이타를 가지고 있는 객체
 * - DatBase table 1개의 row데이타를 맵핑할객체
 * - RandomAccess File 1개의 레코드를 맵핑할객체
 * - Value Object(VO) , Data Transfer Object(DTO) 라고도함
 * 
 * 번호는 중복되지않는다.
 * 
 */

public class Member {
	private int no;
	private String name;
	private int age;
	private String address;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(int no, String name, int age, String address) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return no+ "\t" + name + "\t" + age + "\t" + address;
	}
	
}
