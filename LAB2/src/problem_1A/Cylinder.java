package problem_1A;

public class Cylinder extends Shapes {

	private double radius;
	private double height;
	
	public Cylinder() {
		
	}
	
	public Cylinder (double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}

	@Override
	public double surfaceArea() {
		return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	public String toString() {
		return "The cylinder radius: " + radius + ", height: " + height + " " + super.toString(); 
	}
}
