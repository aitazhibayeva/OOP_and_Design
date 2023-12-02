package problem_2;

public class StarTriangle {
    int width;
	    
    public StarTriangle(int width) {
        this.width = width;
    }
	    
    public String toString() {
    	for(int i = 1; i <= width; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("[*]");
			}
			System.out.println();
		}
		return " ";
    }
    
}