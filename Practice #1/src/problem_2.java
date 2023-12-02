import java.util.Scanner;

public class problem_2 {

	public static void area(int a) {
		int area = a*a;
		System.out.print("Area: " + area);
		System.out.println();
	}
	
	public static void perimeter(int a) {
		int per = 4*a;
		System.out.print("Perimeter: " + per);
		System.out.println();
	}
	
	public static void diagonal(int a) {
		double diagonal = Math.sqrt(2*(a*a));
		System.out.print("Diagonal: " + diagonal);
	}
	
	public static void calculate(int a) {
		
		area(a);
		perimeter(a);
		diagonal(a);
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		calculate(a);
		in.close();
		
	}

}
