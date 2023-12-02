package problem_1;

public class Circle extends Shape{

	private int radius;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, int position, int radius) {
		super(color, position);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void draw() {
        if (color == Color.BLACK) {
    		for (int i = 0; i < pos; i++) {
                System.out.print(" ");
            }
            System.out.print("()");
        }
        else {
    		for (int i = 0; i < pos; i++) {
                System.err.print(" ");
            }
            System.err.print("()");
        }
		
	}
	
	public void draw(int num) {
		for (int i = 0; i < num; i++) {
            if (color == Color.BLACK) {
                System.err.print("()");
            }
            else {
                System.err.print("()");
            }
        }
	}
}
