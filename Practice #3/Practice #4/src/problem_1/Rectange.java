package problem_1;

public class Rectange extends Shape{

	private int side;
	
	public Rectange() {
		super();
	}
	
	public Rectange(Color color, int position, int side) {
		super(color, position);
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}
	
	public void draw() {
        if (color == Color.BLACK) {
            for (int i = 0; i < pos; i++) {
                System.out.print(" ");
            }
            System.out.print("[]");
        }
        else {
            for (int i = 0; i < pos; i++) {
                System.err.print(" ");
            }
            System.err.print("[]");
        }
	}
	
	public void draw(int num) {
        for (int i = 0; i < num; i++) {
            if (color == Color.BLACK) {
                System.err.print("[]");
            }
            else {
                System.err.print("[]");
            }
        }
    }

}
