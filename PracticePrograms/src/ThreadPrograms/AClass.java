package ThreadPrograms;

public class AClass {
	
	int bal;
	
	synchronized void deposit(int amt)
	{
		System.out.println("Getting balance...");
		int newbal=getBalance();
		bal=newbal+amt;
		setBalance(bal);
	}
	int getBalance()
	{
		return AccountMainClass.Balance;
	}
	void setBalance(int amt)
	{
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
	AccountMainClass.Balance=amt;
	}


}
