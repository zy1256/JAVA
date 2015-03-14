package com.itwill.lang;

public class StringMain {
	public static void main(String[] args){
		
		//���������
		String str1 = new String("�ڹ�");
		String str2 = new String("�ڹ�");
		char[] ca = {'��','��'};
		String str3 = new String(ca);
		
		//�Ͻ�������
		String str4 = "�ڹ�";
		String str5 = "�ڹ�";
		String str6 = "�ڹ�";
		
		/*
		 * String ��
		 * 
		 * Object
		 * 	public boolean equals (Object obj)
		 *  - ��ü�� �ּ� ��
		 *  
		 * String
		 * 	public boolean equals(Object anObject)
		 *  - ��Ʈ����ü�� ���ڿ���
		 */
		System.out.println("1.----------equals---------");
		if(str1==str2){
			System.out.println("st1�ּ� == str2�ּ�");
		}else{
			System.out.println("st1�ּ� != str2�ּ�");
		}
		if(str1.equals(str2)){
			System.out.println("str1���ڿ� = str���ڿ�");
		}else{
			System.out.println("str1���ڿ� ! str���ڿ�");
		}
		/*if(str4==str5){
			System.out.println("str4�ּ� == str5�ּ�");
		}*/
		if(str1=="�ڹ�"){
			System.out.println("str1�ּ� = \"�ڹ�\"");
		}
		
		System.out.println("2.---------compareTo--------");
		int result = "���ȣ".compareTo("���ȣ");
		System.out.println(result);
		result = "���ȣ".compareTo("���ȣ");
		System.out.println(result);
		result = "���ȣ".compareTo("���ȣ");
		System.out.println(result);

		System.out.println("---------compareTo--------");
		String[] names = {"���ȣ","���ȣ","����ȣ","Ȳ��ȣ","�ɰ�ȣ"};
		System.out.println("�̸��� ���������� ����");
		
		int shortestStringIndex = 0;
		for(int j=0; j < names.length - 1;j++)
		 {
		     shortestStringIndex = j;

		     for (int i=j+1 ; i<names.length; i++)
		     {
		         if(names[i].compareTo(names[shortestStringIndex])<0)
		         {
		             shortestStringIndex = i;  
		         }
		     }
		     if(shortestStringIndex != j)
		     {
		         String temp = names[j];
		         names[j] = names[shortestStringIndex]; 
		         names[shortestStringIndex] = temp;
		     }
		 }
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		System.out.println("3.-----------------");
		String message = "������ �츮�� ��ΰ� ��ƿ� ����";
		System.out.println("String length : " + message.length());
		
		/*
		 *  String java.lang.String.substring(int beginIndex)
			Returns a new string that is a substring of this string. The substring begins with 
			the character at the specified index and extends to the end of this string. 
			Examples: 
			 "unhappy".substring(2) returns "happy"
			 "Harbison".substring(3) returns "bison"
			 "emptiness".substring(9) returns "" (an empty string)
		 */
		
		String sf = message.substring(8, 15);
		System.out.println("substring(8,15) : " + sf);	
		sf = message.substring(8);
		System.out.println("substring(8) : " + sf);
		
		System.out.println("4.------split-------");
		String cardNo="123-545-4554";
		String [] cardNoArray = cardNo.split("-");
		for (int i = 0; i < cardNoArray.length; i++) {
			System.out.println(">>"+cardNoArray[i]);
		}
		System.out.println("5.--endsWith--");
		String fileName="xxx.gif";
		if(fileName.endsWith(".gif")){
			System.out.println(".gif ������ �׸������̳׿�");
		}
		System.out.println("5.--startsWith--");
		String[] nameArray = {"���ȣ","���ȣ","����ȣ","Ȳ��ȣ","�ɰ�ȣ"};
		for (int i = 0; i < nameArray.length; i++) {
			if(nameArray[i].startsWith("��")){
				System.out.println(nameArray[i]);
			}
		}

		System.out.println("6.--trim--");
		/*
		 * A copy of this string with leading and trailing white space removed, 
		 * or this string if it has no leading or trailing white space.
		 */
		String trimStr="         aa  aa   ";
		trimStr = trimStr.trim();
		System.out.println(trimStr);

		System.out.println("6.--null String--");
		String nullString = "";
		System.out.println("length : " + nullString.length());
		if(nullString.equals("")){
			System.out.println("nullString.equals(\"\"):true");
		}
		
		String trueStr = String.valueOf(true);
		System.out.println(trueStr);
		String numberStr = String.valueOf(93.1552);
		System.out.println(numberStr);
		
		message = "������ �츮�� ��ΰ� ��ƿ� ����";
		char firstChar = message.charAt(0);
		System.out.println("charAt(0) : " + firstChar);
		for (int i = 0; i < message.length(); i++) {
			char tempChar = message.charAt(i);
			System.out.print((int)tempChar+",");
		}
		
	}

}
