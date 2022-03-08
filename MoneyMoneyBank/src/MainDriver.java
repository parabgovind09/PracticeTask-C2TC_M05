
import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;


public class MainDriver {
	
	static BankFactory bf;
	static MMSavingAcc mmsa;
	static MMCurrentAcc mmca;
	
	public static void main(String[] args) {
		//late/lazy binding
		bf = new MMBankFactory();
		mmsa = (MMSavingAcc) bf.getNewSavingAcc(100, "Govind", 10000, true);
		mmsa.withdraw(100);
		System.out.println(mmsa.toString()+"\n");
		
		mmca = (MMCurrentAcc) bf.getNewCurrentAcc(100, "Minal", 15000, 2000);
		mmca.withdraw(50);
		System.out.println(mmca.toString());

	  }
}