package problem_1;

public abstract class Shape {
	public Color color;
	public int pos;
	
	public Shape() {
		
	}
	
	public Shape(Color color, int position) {
		this.color = color;
		this.pos = position;
	}
	
	public abstract void draw();

}
