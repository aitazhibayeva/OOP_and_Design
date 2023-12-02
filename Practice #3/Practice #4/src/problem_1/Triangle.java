package problem_1;

public class Triangle extends Shape {

	private int hypotenuse;
	
	public Triangle() {
		super();
	}
	
	public Triangle(Color color, int position, int hyp) {
		super(color, position);
		this.hypotenuse = hyp;
	}
	
	public int getHypotenuse() {
		return hypotenuse;
	}
	
	public void draw() {
        if (color == Color.RED) {
            for (int i = 0; i < pos; i++) {
                System.err.print(" ");
            }
            System.err.print("/\\");
        }
        else { 
            for (int i = 0; i < pos; i++) {
                System.out.print(" ");
            }
            System.out.print("/\\");
        }
	}
    
    public void draw(int num) {
        for (int i = 0; i < num; i++) {
            if (color == Color.BLACK) {
                System.err.print("/\\");
            }
            else {
                System.err.print("/\\");
            }
        }
    }

}
