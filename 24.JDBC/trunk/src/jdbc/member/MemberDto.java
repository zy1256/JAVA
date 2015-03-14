package jdbc.member;
/*
 * member table �� �� �÷��� �ش��ϴ� ����� ������ �ִ� 
 * DTO(Data Transfer Object),VO(value object)Ŭ����
 * member table �� 1���� row data�� mapping(R-R mapping)�Ǿ��ִ�.
 */
public class MemberDto {
	private int no;
	private String id;
	private String name;
	private String phone;
	private String address;
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}
	public MemberDto(int no, String id, String name, String phone,
			String address) {
		super();
		this.no = no;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public static void headerPrint(){
		System.out.println("no \t id \t\t name \t phone \t\t address");
	}
	public void print(){
		System.out.println(no + " \t " + id + " \t " + name + " \t " + phone + " \t\t " + address);
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return no+" \t "+id+" \t "+name+" \t "+phone+" \t "+address;
	}
	
}
