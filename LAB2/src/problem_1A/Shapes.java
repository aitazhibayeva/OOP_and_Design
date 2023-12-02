package problem_1A;

public abstract class Shapes {
	
	public Shapes() {}
	
	public abstract double surfaceArea();
	public abstract double volume();
	
	public String toString() {
		return "Volume: " + volume() + ", Area: " + surfaceArea(); 
	}
}
