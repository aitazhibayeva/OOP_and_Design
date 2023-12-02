package problem_1B;

public class Book extends LibraryItem{
	
	private String color;
	private int numOfPages;
	
	public String getColor() {
		return color;
	}
	public int getNumOfPages() {
		return numOfPages;
	};
	
	public Book() {};
	
	public Book(String color, int numOfPages) {
		super();
		this.color = color;
		this.numOfPages = numOfPages;
	}
	

	public String read() {
		return " I've already read " + numOfPages + " pages";	
	}
	
	public String toString() {
		return super.toString() + ", color: "+color+", numberOfPages: "+numOfPages; 
	}

}
