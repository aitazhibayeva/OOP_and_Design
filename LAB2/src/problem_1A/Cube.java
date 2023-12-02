package problem_1A;

public class Cube extends Shapes{
	private double side;
	
	public Cube(double side) {
		super();
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	@Override
	public double surfaceArea() {
		return 6 * Math.pow(side, 2);
	}

	@Override
	public double volume() {
		return Math.pow(side, 3);
	}
	
	public String toString() {
		return "The cube side: " + side + ", " + super.toString();
	}
}
