
public class AcadmyCastingMain {

	public static void main(String[] args) {
		Student st1 = new Student(1,"KIM","OFFICE");
		Student st2 = new Student(2,"SIM","JAVA");
		Student st3 = new Student(3,"LIM","WEB DESIGN");
		Staff sf1 = new Staff(4, "LEE", "MARKETING");
		Staff sf2 = new Staff(5, "CHOI", "EDUCATION");
		Gangsa gs1 = new Gangsa(6,"PARK","LINUX");
		Gangsa gs2 = new Gangsa(7,"HWANG","NETWORK");
		
		Person[] personArray = new Person[7];
		personArray[0] = st1;
		personArray[1] = st2;
		personArray[2] = st3;
		personArray[3] = sf1;
		personArray[4] = sf2;
		personArray[5] = gs1;
		personArray[6] = gs2;
		/*
		Person[] persons = {
							new Student(),
							new Staff(),
							new Gangsa()
						};
		*/
		System.out.println("-------------------------------");
		for (int i = 0; i < personArray.length; i++) {
			personArray[i].print();
		}
		System.out.println("-------------------------------");
		/*
		 * 연산자 - instanceof
		 * 		  - 결과는 논리형 데이터
		 * 
		 * ex> boolean b = 참조변수 instanceof 클래스(type)
		 * boolean isStudent = st1 instanceof Student;
		 */
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i] instanceof Student){
				Student tempStudent = (Student)personArray[i];
				String ban = tempStudent.getClazz();
				System.out.println(tempStudent.no + "\t" + tempStudent.name + "\t" + tempStudent.clazz);
			}
		}
		

	}

}
