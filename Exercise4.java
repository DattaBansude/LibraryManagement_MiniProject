package exercise.com;

class Library{
	String [] books;
	int no_of_books;
	
	public Library() {
		// TODO Auto-generated constructor stub
		this.books = new String[100];
		this.no_of_books = 0;
	}
	
	void addBook(String book)
	{
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println(book+" has been added!");
	}
			
			
	void showAvailableBooks()
	{		
		System.out.println("Available books are: ");
		for (String book : this.books) {
			if (book == null) {
				continue;
			}
			System.out.println("* " +book);
		}
	}
	
	void issueBook(String book )
	{
	  	for (int i = 0; i < this.books.length; i++) {
			if(this.books[i].equals(book)) {
				System.out.println("The book has been issued!");
				this.books[i] = null;
				return;
			}
			
		}
	  	System.out.println("This book does not exist");
	}
	
	void returnBook(String book)
	{
		addBook(book);
	}
		
			
}


public class Exercise4 {

	public static void main(String[] args) {
		Library l = new Library();
		l.addBook("rich dad poor dad");
		l.addBook("sane guruji");
		l.addBook("c++");
		l.showAvailableBooks();
		l.issueBook("c++");
		l.showAvailableBooks();
		l.returnBook("c++");
		l.showAvailableBooks();
	}
}
