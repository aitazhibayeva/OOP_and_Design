package problem_1A;

public class Sphere extends Shapes {
	private double radius;
	
	public Sphere() {
	}
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	@Override
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double volume() {
		return (4/3) * Math.PI * Math.pow(radius, 3);
	}
	
	public String toString() {
		return "The sphere radius: " + radius + ", " + super.toString();	
	}
	
}
