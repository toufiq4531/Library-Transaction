public class Account
{
	private String accName;
    private String acId;
	private int balance;
	private Transaction [] listOfTransaction;   
	private int totalNumberOfTransaction;      

	public String getName(){return accName;}
	public Account(){}
	public Account(String accName,String acId,int balance,int no)
	{
		this.accName=accName;
		this.acId=acId;
		this.balance=balance;
		listOfTransaction=new Transaction[no];
		totalNumberOfTransaction=0;
	}
	public void deposite(int amount)
	{
		if(amount>0)
		{
			this.balance+=amount;
			System.out.println("Updated Balance after Deposite: "+this.balance);
			Transaction t=new Transaction(this,this,amount,"Deposite");
			if(totalNumberOfTransaction<listOfTransaction.length)
			{
				listOfTransaction[totalNumberOfTransaction]=t;
				totalNumberOfTransaction++;
			}
		}
		else
		{
			System.out.println("Not POSSIBE");
		}
	}
	public void withdraw(int amount)
	{
		if(this.balance>=amount)
		{
			this.balance-=amount;
			System.out.println("Updated Balance after Withdraw: "+this.balance);
			Transaction t=new Transaction(this,this,amount,"Withdraw");
			if(totalNumberOfTransaction<listOfTransaction.length)
			{
				listOfTransaction[totalNumberOfTransaction]=t;
				totalNumberOfTransaction++;
			}
		}
		else
		{
			System.out.println("Not Enough Balance to Withdraw");
		}
	}
	public void transfer(int amount,Account receiver)
	{
		this.withdraw(amount);
		receiver.deposite(amount);
		Transaction t=new Transaction(this,receiver,amount,"Transfer");
			if(totalNumberOfTransaction<listOfTransaction.length)
			{
				listOfTransaction[totalNumberOfTransaction]=t;
				totalNumberOfTransaction++;
			}
	}
	public void show()
	{
		System.out.println("Account Info>>>>>");
		System.out.println("Name :"+accName+"\n"+"Id :"+acId+"\n"+"Balance :"+balance);
	}
	void showAllTranscation()
	{
		System.out.println("Account Info for :"+this.accName);
		for(int i=0;i<totalNumberOfTransaction;i++)
		{
			listOfTransaction[i].showInfo();
		}
	}

}