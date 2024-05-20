public class AccountMain
{
	public static void main(String[] args)
	{
		Account a1=new Account("Mr. X","1345",120000,50);
		Account a2=new Account("Mr. Y","1344",12000,50);
	    // a1.show();
		a1.withdraw(5000);
		a1.deposite(4000);
		a2.withdraw(5000);
		a2.deposite(1000);
		a1.transfer(500,a2);
		a1.showAllTranscation();
		a2.showAllTranscation();
		
	}
}