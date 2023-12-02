package problem_1;

import java.util.Scanner;

public class testStarTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int number = in.nextInt();
		StarTriangle small = new StarTriangle(number, Position.LEFT);
		StarTriangle small1 = new StarTriangle(number, Position.RIGHT);
		StarTriangle small2 = new StarTriangle(number, Position.MIDDLE);
	
		
		System.out.println(small.toString());
	
		System.out.println(small1.toString());
		
		System.out.println(small2.toString());
		
		in.close();
	}

}
