public class Transaction
{
	private Account sender;
	private Account receiver;
	private int amount;
	private String additionalInfo;
	public Transaction(Account sender, Account receiver, int amount,String additionalInfo)
	{
		this.sender=sender;
		this.receiver=receiver;
		this.amount=amount;
		this.additionalInfo=additionalInfo;
	}
	public void showInfo()
	{
		System.out.println("Transaction Info>>>>>");
		System.out.println("Sender Name: "+sender.getName());
		System.out.println("Receiver Name: "+receiver.getName());
		System.out.println("Amount: "+this.amount);
		System.out.println("Type: "+this.additionalInfo);
	}
	
}