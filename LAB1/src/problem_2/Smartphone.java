package problem_2;

public class Smartphone {
	public String color;
	public int memory;
	private double price;
	private String companyCountry;
	private static int phoneId;
	Size size;
	Brand brand;
	
	final int limit = 100000;
		
	{
		color = "white";
		memory = 256;
		size = Size.GB;
		price = 1000;
		companyCountry = "China";
		brand = Brand.IPHONE;
	}
		
	public String getCompanyCounrty() {
		return companyCountry;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getCounter() {
		return phoneId;
	}
	
	public Smartphone() {
		phoneId++;
	}
	
	public Smartphone(Brand brand) {
		this();
		this.brand = brand;
	}
	
	public Smartphone(Brand brand, String color, int memory, Size size, double price, String companyCountry) {
		this(brand);
		this.color = color;
		this.memory = memory;
		this.size = size;
		this.price = price;
		this.companyCountry = companyCountry;
	}
//	
//	public String toString() {
//		return phoneId + " My smartphone - " +
//					"brand: " + brand + ", " +
//					"color: " + color + ", " +
//					"memory: " + memory + " " +
//					size + ", price: " + price +
//					"$, Made in: " + companyCountry;
//	}
//	
	public String sumOfSale(Brand brand1, int piece) {
		if(this.getPrice() * piece < limit) {
			return brand1 + " and " + piece + " pieces" + " -> sum:" + this.getPrice()*piece + " < " + limit;
		}
		return "You can't buy, because limit exceeded: " + brand1 + " and " + piece + " pieces" + " -> sum:" + this.getPrice()*piece + " > " + limit;
	}
}
