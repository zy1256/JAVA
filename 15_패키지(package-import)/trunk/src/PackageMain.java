import com.itwill.shop.product.ProductManager;

/*
      package 
      1. �����ִ�(����) Ŭ������ ����(��Ű��)
      2. ��Ű���� �̸��� ���������� ū�����������������α���  
      3. Ŭ������ �������̸��� ��Ű���� �������̸��̴�..
     ex> package samson.sds.chongmu;
	     public class Chongmu1{
		 
		 }
       
	  4.compile ��� 
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
