package problem_1B;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public LibraryItem(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	public LibraryItem() {
		this.title = "Sweet Home";
		this.author = "Carnby Kim";
		this.publicationYear = 2017;
	}
	
	public abstract String read();
	
	public String toString() {
		return "title: " + title + ", author: " + author + ", publicationYear: " + publicationYear;
	}
	
}
