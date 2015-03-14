/*
		 단항연산자
		     - 증가,감소연산자
			   ex> i++ , i-- , ++i , --i 
             - 자기자신의값을 정수 1만큼 증가시키거나 감소시키는
			   연산자
 */

public class UnaryOperator {
	public static void main(String[] args) {
		
		int i1 = 5;
		int j1 = 5;
		
		i1++; // i1=i1+1
		++j1; // j1=j1+1
		System.out.println("i1 = "+ i1);
		System.out.println("j1 = "+ j1);

		i1--; //i1=i1-1
		--j1; //j1=j1-1
		System.out.println("i1 = "+ i1);
		System.out.println("j1 = "+ j1);
		
		i1=5;
		j1=5;
		
		int result1,result2;
		
		result1 = ++i1;
		result2 = j1++;
		
		System.out.println("i1 = " + i1);
		System.out.println("j1 = " + j1);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
	}

}
