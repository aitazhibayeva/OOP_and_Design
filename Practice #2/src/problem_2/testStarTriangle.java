package problem_2;

import java.util.Scanner;

public class testStarTriangle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		StarTriangle small = new StarTriangle(in.nextInt());
		
		System.out.println(small.toString());
		in.close();
	}

}
