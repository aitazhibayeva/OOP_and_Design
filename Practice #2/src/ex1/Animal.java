package ex1;

public class Animal {
	String carnivore;
	private String color;
	int numOfLegs;
	
	public Animal (String Carnivore, String Color, int NumOfLegs)
{
		this.carnivore = Carnivore;
		this.color = Color;
		this.numOfLegs = NumOfLegs;
		
}
	
	public String getColor() {
		return this.color;
	}
	public String setColor(String color) {
		return this.color;
	}
	//overriding
	public String toString() {
		return this.carnivore + " with the color "+this.color;
	}
	//overloaded method of eat()
	public String eat(String meal) {
		if(meal == null || meal.equals("")) {
			return "You fool me!";
		}
		return "Yummy!";
	}
}
