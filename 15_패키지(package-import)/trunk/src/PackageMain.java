import com.itwill.shop.product.ProductManager;

/*
      package 
      1. 관련있는(업무) 클래스의 모음(패키지)
      2. 패키지의 이름은 계층적으로 큰범위부터작은범위로구성  
      3. 클래스의 완전한이름은 패키지를 포함한이름이다..
     ex> package samson.sds.chongmu;
	     public class Chongmu1{
		 
		 }
       
	  4.compile 방법 
			>javac -d . XXX.java  	
*/
public class PackageMain {

	public static void main(String[] args) {
		com.itwill.shop.member.Member m = new com.itwill.shop.member.Member();
		com.itwill.shop.member.MemberManager memberManager = new com.itwill.shop.member.MemberManager();
		
		com.itwill.shop.product.ProductManager pm1 = new com.itwill.shop.product.ProductManager();
		com.itwill.shop.product.ProductManager pm2 = new com.itwill.shop.product.ProductManager();
		System.out.println(m);
		System.out.println(memberManager);
		System.out.println(pm1);
		System.out.println(pm2);

	}

}
