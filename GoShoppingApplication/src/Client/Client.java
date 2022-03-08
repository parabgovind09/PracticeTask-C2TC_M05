package Client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {
	
	static ShopFactory sf;
	static GSPrimeAcc gspa;
	static GSNormalAcc gsna;
	//static NormalAcc na = new NormalAcc(111, "Bikas", 1000, 50);

	public static void main(String[] args) {
		
		
		 
		//early binding
		  GSShopFactory gssf = new GSShopFactory(); 
		  gssf.getNewPrimeAccount(123,"Vikas", 1000, false); 
		  
		  GSPrimeAcc gspa = new GSPrimeAcc(); gspa.getAccNo(); gspa.getAccNm();
		  gspa.getCharges(); gspa.bookProduct(1000); System.out.println(gspa.toString());
		  
		  gssf.getNewNormalAccount(111, "Bikas", 1000, 50);
		  GSNormalAcc gsna = new GSNormalAcc(); gsna.getAccNo(); gsna.getAccNm();
		  gsna.getCharges(); gsna.getDeliveryCharges(); gsna.bookProduct(1000);
		  //na.bookProduct(1000);
		  System.out.println(gsna.toString());
		
		
		//late/lazy binding
		sf = new GSShopFactory();
		gsna = (GSNormalAcc) sf.getNewNormalAccount(101, "Bikas", 1000, 50);
		gsna.bookProduct(1000);
		System.out.println(gsna.toString());
		gspa = (GSPrimeAcc) sf.getNewPrimeAccount(112,"Vikas", 1000, true);
		gspa.bookProduct(1000);
		System.out.println(gspa.toString());
	}

}
