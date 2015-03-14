
public class AcademyOverridingMain {

	public static void main(String[] args) {
		
		Student st1 = new Student(1,"KIM","OFFICE");
		Student st2 = new Student(2,"SIM","JAVA");
		Student st3 = new Student(3,"LIM","WEB DESIGN");
		Staff sf1 = new Staff(3, "LEE", "MARKETING");
		Staff sf2 = new Staff(4, "CHOI", "EDUCATION");
		Gangsa gs1 = new Gangsa(5,"PARK","LINUX");
		Gangsa gs2 = new Gangsa(6,"HWANG","NETWORK");
		
		Student[] students = new Student[3];
		Staff[] staffs = new Staff[2];
		Gangsa[] gangsas = new Gangsa[2];
		
		students[0] = st1;
		students[1] = st2;
		students[2] = st3;
		
		staffs[0] = sf1;
		staffs[1] = sf2;
		
		gangsas[0] = gs1;
		gangsas[1] = gs2;

		System.out.println("-----------학생-----------");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
			
		}
		System.out.println("-----------스텝-----------");
		for (int i = 0; i < staffs.length; i++) {
			staffs[i].print();
		}
		System.out.println("-----------강사-----------");
		for (int i = 0; i < gangsas.length; i++) {
			gangsas[i].print();
		}
	}

}
