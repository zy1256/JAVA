package file.member;

/*
 * ��� 1���� ����Ÿ�� ������ �ִ� ��ü
 * - DatBase table 1���� row����Ÿ�� �����Ұ�ü
 * - RandomAccess File 1���� ���ڵ带 �����Ұ�ü
 * - Value Object(VO) , Data Transfer Object(DTO) �����
 * 
 * ��ȣ�� �ߺ������ʴ´�.
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
