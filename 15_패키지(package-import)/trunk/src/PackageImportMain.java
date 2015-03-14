import com.itwill.shop.ShopManager;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberManager;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductDao;
import com.itwill.shop.product.ProductManager;

//alt + shift + o ÀÚµ¿import

public class PackageImportMain {

	public static void main(String[] args) {
		Member m = new Member();
		MemberManager memberManager = new MemberManager();
		
		ProductManager pm1 = new ProductManager();
		com.itwill.shop.admin.ProductManager pm2 = new com.itwill.shop.admin.ProductManager();
		System.out.println(m);
		System.out.println(memberManager);
		System.out.println(pm1);
		System.out.println(pm2);
		ShopManager sm = new ShopManager();
		ProductDao pd = new ProductDao();

	}

}
