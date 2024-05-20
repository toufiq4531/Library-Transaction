public class BookMain{
	public static void main(String[] args) {
		Book b1 = new Book("ProgrammingC", "Peter", "012074", "CSE", 5);
		Book b2 = new Book("Java", "Kathy", "012055", "CSE", 7);
		
		b1.showInfo();
		b2.showInfo();
		
		b1.addBookCopy(13);
		b1.showInfo();
		
		Book.showTotalBookInfo();
		
		Library l1=new Library("ABC","dhaka",100);
		l1.addNewBook(b1);
		l1.addNewBook(b2);
		l1.showlibInfo();
		
		
	}
}