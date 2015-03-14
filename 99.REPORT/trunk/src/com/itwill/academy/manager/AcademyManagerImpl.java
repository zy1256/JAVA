package com.itwill.academy.manager;

public class AcademyManagerImpl implements AcademyManager {
	
	private Person[] personArray;
	
	public AcademyManagerImpl() {
		personArray=new Person[15];
	}
	public AcademyManagerImpl(int memberCount) {
		personArray=new Person[memberCount];
	}

	@Override
	public void allPrint() {
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i]!=null){
				personArray[i].print();
			}
		}

	}

	@Override
	public void addPerson(Person p) {
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i]==null){
				personArray[i]=p;
				break;
			}
		}

	}

	@Override
	public void deletePerson(int no) {
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i]!=null && personArray[i].getNo()==no){
				personArray[i]=null;
			}
		}

	}

	@Override
	public void updatePerson(Person updatePersonData) {
		//1.no�� Person ��ü�� ã�´�.
		//2.updatePersonData�� Ÿ���� �˾Ƴ���
		//  Student,Staff,Gangsa casting
		//3.����
		if(updatePersonData instanceof Student){
			/*
			 * �̸� ����,�ݺ���
			 */
			for (int i = 0; i < personArray.length; i++) {
				if(personArray[i]!=null && personArray[i].getNo()==updatePersonData.getNo()){
					personArray[i] = updatePersonData;
					
				}
			}
		}else if(updatePersonData instanceof Staff){
			/*
			 * �̸�����,�μ�����
			 */
			for (int i = 0; i < personArray.length; i++) {
				if(personArray[i]!=null && personArray[i].getNo()==updatePersonData.getNo()){
					personArray[i] = updatePersonData;
					
				}
			}
		}else if(updatePersonData instanceof Gangsa){
			/*
			 * �̸�����,���񺯰�
			 */
			for (int i = 0; i < personArray.length; i++) {
				if(personArray[i]!=null && personArray[i].getNo()==updatePersonData.getNo()){
					personArray[i] = updatePersonData;
					
				}
			}
		}

	}

	@Override
	public Person findByNo(int no) {
		Person tempPerson = null;
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i]!=null && personArray[i].getNo()==no){
				tempPerson = personArray[i];
			}
		}
		return tempPerson;
	}

	@Override
	public Person[] findByName(String name) {
		int count = 0;
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i].getName().equals(name)){
				count += 1;
			}
		}
		Person[] tempName = new Person[count];
		int temp = 0;
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i].getName().equals(name)){
				tempName[temp]=personArray[i];
				temp++;
			}
		}
		return tempName;
	}

	@Override
	public Person[] findByEtc(int etcNo, String etc) {
		Person[] tempPerson = null;
		switch (etcNo) {
		case AcademyManager.BAN:
			int count = 0;
			for (int i = 0; i < personArray.length; i++) {
				if(personArray[i] instanceof Student){
					Student tempStudent=(Student)personArray[i];
					if(tempStudent.getClazz().equals(etc)){
						count++;
					}
				}
			}
			tempPerson = new Person[count];
			int temp = 0;
			for (int i = 0; i < personArray.length; i++) {
				if(personArray[i] instanceof Student){
					Student tempStudent=(Student)personArray[i];
					if(tempStudent.getClazz().equals(etc)){
						tempPerson[temp] = personArray[i];
						temp++;
					}
				}
			}
			break;
		case AcademyManager.DEPART:
			count = 0;
			for (int i = 0; i < personArray.length; i++) {
				if(personArray[i] instanceof Staff){
					Staff tempStaff=(Staff)personArray[i];
					if(tempStaff.getDepart().equals(etc)){
						count++;
					}
				}
			}
			tempPerson = new Person[count];
			temp = 0;
			for (int i = 0; i < personArray.length; i++) {
				if(personArray[i] instanceof Staff){
					Staff tempStaff=(Staff)personArray[i];
					if(tempStaff.getDepart().equals(etc)){
						tempPerson[temp] = personArray[i];
						temp++;
					}
				}
			}
			break;
		case AcademyManager.SUBJECT:
			count = 0;
			for (int i = 0; i < personArray.length; i++) {
				if(personArray[i] instanceof Gangsa){
					Gangsa tempGangsa=(Gangsa)personArray[i];
					if(tempGangsa.getSubject().equals(etc)){
						count++;
					}
				}
			}
			tempPerson = new Person[count];
			temp = 0;
			for (int i = 0; i < personArray.length; i++) {
				if(personArray[i] instanceof Gangsa){
					Gangsa tempGangsa=(Gangsa)personArray[i];
					if(tempGangsa.getSubject().equals(etc)){
						tempPerson[temp] = personArray[i];
						temp++;
					}
				}
			}
			break;
		}
		return tempPerson;
	}

}
