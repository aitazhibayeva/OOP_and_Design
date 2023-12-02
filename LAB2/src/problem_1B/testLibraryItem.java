package problem_1B;

import java.util.Vector;

public class testLibraryItem {

	public static void main(String[] args) {
		Book b1 = new Book("red", 250);
		Book b2 = new Book("white", 123);
		Book b3 = new Book();
		
		Vector <LibraryItem> books = new Vector<LibraryItem>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		for(LibraryItem book: books) {
			System.out.println(book);
			System.out.println(book.read());
		}
	
	}

}
