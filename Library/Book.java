public class Book{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	private static int bookCounter;
	
	public Book() {
		bookCounter++;
	}
	public Book(String name, String author, String id, String type, int copy) {
		this.bookName = name;
		this.bookAuthor = author;
		this.bookId = id;
		this.bookType = type;
		this.bookCopy = copy;
		bookCounter++;
	}
	
	public void showInfo() {
		System.out.println("Book ID# " + bookId);
		System.out.println("Book Name	: " + bookName);
		System.out.println("Book Author	: " + bookAuthor);
		System.out.println("Book Type 	: " + bookType);
		System.out.println("Book Copy	: " + bookCopy);
		System.out.println("");
	}
	
	public void addBookCopy(int x) {
		if(x <= 0) {
			System.out.println("Negative value not acceptable, try again.");
		}else{
			this.bookCopy = this.bookCopy + x;
			System.out.println(x + " Book added to " + bookName);
			System.out.println("Total book copy : " + bookCopy);
			System.out.println("");
		}
		
	}
	
	public static void showTotalBookInfo() {
		System.out.println("Total number of books: " + bookCounter);
		System.out.println("");
	}
	
	
}