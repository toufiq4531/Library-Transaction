public class Library
{
	private String libName;
    private String libAddress;
	private Book[] listOfBook;
	private int totalBook;
	public Library()
	{
		System.out.println("default constructor called");
	}
	public Library( String libName, String libAddress,int no)
	{
	    this.libName=libName;
		this.libAddress=libAddress;
		
		listOfBook=new Book[no];
		totalBook=0;
	}
	public void showlibInfo()
	{
		System.out.println("Library info>>>>>>");
		System.out.println("Name: "+libName);
		System.out.println("Owner Name: "+libAddress);

		for(int i=0;i<totalBook;i++)
		{
			listOfBook[i].showInfo();
		}
		
	}
	public void addNewBook(Book book)
	{
		if(totalBook<listOfBook.length)
		{
			listOfBook[totalBook]=book;
			totalBook++;
		}
		else
		{
			System.out.println("Not possible");
		}
	}
	public void addNewBookCopy(Book book,int copy)
	{
		if(totalBook<listOfBook.length)
		{
			listOfBook[totalBook]=book;
			totalBook++;
		}
		else
		{
			System.out.println("Not possible");
		}
	}
	
}

