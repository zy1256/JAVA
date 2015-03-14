/*
 	배열:  
      - 같은데이타형을 가진 변수(기억장소)여러개의 모음타입
      - 배열변수의 선언형식
           데이타타입[] 이름; 
	  - 사용: 
	       1.배열객체의생성	
		   2.배열객체의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */
public class PrimitiveArrayMain {

	public static void main(String[] args) {
		int i =400;
		//기본형 1차원 배열의
		System.out.println("1. ---------------기본형 1차원 배열의*****");
		int[] iArray = new int[5];
		
		for (int j = 0 ; j < iArray.length; j++){
			System.out.println(iArray[j] + ",");
		}
		System.out.println("3. 정수 대입후 출력");
		iArray[0] = 1;
		iArray[1] = 2;
		iArray[2] = 3;
		iArray[3] = 4;
		iArray[4] = 5;
		
		for (int k = 0; k < iArray.length; k++) {
			
		}
		
		System.out.println("iArray [0]" + iArray[0]);
		System.out.println("iArray [1]" + iArray[1]);
		System.out.println("iArray [2]" + iArray[2]);
		System.out.println("iArray [3]" + iArray[3]);
		System.out.println("iArray [4]" + iArray[4]);

		System.out.println("4. 배열의 size :" + iArray.length);
		
		for (int  j = 0 ; j < iArray.length; j++){
			System.out.println("iArray [" + j + "] =" + iArray [j]);
		}

		System.out.println("배열의생성과 초기화");
		int[] iArray1 = {1,2,3,4,5,6,7,8,9,10};
		for (int j = 0; j < iArray1.length; j++) {
			System.out.println(iArray1[j]+ ",");
		}
		System.out.println();
		
		char[] ca={'자','바','반','회','식','언','제','해','요'};
		for (int j = 0; j < ca.length; j++) {
			System.out.print(ca[j]);
		}
		System.out.println();
		boolean[] ba={true,false,true,true,false,true};
		int correctAnswer=0;
		int inCorrectAnswer=0;
		for (int j = 0; j < ba.length; j++) {
			if (ba[j]==true) {
				correctAnswer+=1;
			}else{
				inCorrectAnswer+=1;
			}
			
		}
		System.out.println("정답수" + correctAnswer);
		System.out.println("오답수" + inCorrectAnswer);
		System.out.println("문항수" + ba.length);
		
		/*
		 * Quiz 석차계산
		 */
/*
		System.out.println();
		int[] avgArray={34,22,45,78,99,44,34,89,88,90};
		int[] rankingArray = new int [10];
		for (int j = 0; j< avgArray.length; j++){
			int ranking = 1;
			for(int k = 0; k < avgArray.length; k++){
				if(avgArray[j] < avgArray[k]){
					ranking+=1;
				}
			}
			rankingArray[j] = ranking;
			System.out.println(avgArray[j] + "-" + rankingArray[j]);
			//System.out.println(rankingArray[j] + "-" + avgArray[j]);
		}
		*/
		/*
		 * Quiz : 정렬(Sorting)
		 */
		int[] totArray={34,22,45,78,99,44,34,89,88,90};
		int temp = 0;
		for (int j = 0; j < totArray.length-1; j++) {
			for (int k = 0; k < totArray.length-1-i; k++) {
				if(totArray[j]>totArray[k+1]){
					temp = totArray[j];
					totArray[j] = totArray[k+1];
					totArray[k+1] = temp;
				}
			}
			
		}
		for (int j = 0; j < totArray.length; j++) {
			System.out.println(totArray[i] + ",");
		}
		
		
		
	}

}
