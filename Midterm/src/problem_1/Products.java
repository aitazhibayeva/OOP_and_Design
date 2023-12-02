package problem_1;

public class Products {
	private String name;
	private double price;
	private double quantity;
	public Cat cat;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public Products() {}
	
	public Products(double quantity) {
		this.quantity++;
	}
	
	public Products(String name, double price, double quantity) {
		this(quantity);
		this.name = name;
		this.price = price;
		
	}
	public String toString() {
		return "Products " + name + ", price " + price + ", quantity " + quantity + " " +Cat.HIGH;
	}
	
	
	
	
}
