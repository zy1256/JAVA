package jdbc.member;
/*
 * member table 의 각 컬럼에 해당하는 멤버를 가지고 있는 
 * DTO(Data Transfer Object),VO(value object)클래스
 * member table 의 1개의 row data가 mapping(R-R mapping)되어있다.
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
