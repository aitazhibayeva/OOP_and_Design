package problem_1;

public class StarTriangle {
	int width;
	Position position;
	
	public StarTriangle(int width, Position position) {
		this.width = width;
		this.position = position;
	}
	
	public String toString() {
		if(position == Position.LEFT) {
			for(int i = 1; i <= width; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			return " "; 
		}
		else if(position == Position.RIGHT) {
			for(int i=1; i<=width; i++) {
				for(int j=1; j<=width-i; j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			return " ";
		}
		else if(position == Position.MIDDLE) {
			for(int i=1; i<=width; i++) {
				for(int j=1; j<=width-i; j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=2*i-1; k++) {
					System.out.print("*");
				}
				System.out.println();
			} 
			return " ";
		}
		
		return " ";
		
	}
}
