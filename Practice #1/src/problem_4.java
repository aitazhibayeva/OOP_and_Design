import java.util.Scanner;

public class problem_4 {

	public static void equation(int a, int b, int c) {
		int D = (int) Math.sqrt(b*b-4*a*c);
		if( D > 0) {
			twoRoot(D,a,b);
		}
		else if(D == 0) {
			oneRoot(a,b);
		}
		else {
			noRoot(D);
		}
	}
	
    public static void twoRoot(int D, int a, int b) {
    	double root1 = (-b + D)/(2*a);
		double root2 = (-b - D)/(2*a);
		System.out.println("The first root is: " + root1);
		System.out.println("The second root is: " + root2);
	}
    
    public static void oneRoot( int a, int b) {
    	double root = (-b / (2*a));
		System.out.println("The root is: " + root);
    }
    
    public static void noRoot(int D) {
    	System.out.println("doesn't exist because" + D + "is low than 0");
	}
    
	public static void main(String[] args) {
		System.out.println("Enter three a,b,c coefficients: ");
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		equation(a,b,c);
	
		in.close();
	}
}
