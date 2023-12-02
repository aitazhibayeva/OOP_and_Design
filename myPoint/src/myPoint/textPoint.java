package myPoint;
import java.util.Scanner;

public class textPoint {
	
	public static void printLine(int length) {
		for(int i=0; i<length + 2; i++) {
			if(i == 0 || i == length + 1) {
				System.out.print('+');
			}
			else {
				System.out.print('~');
			}
		}
		System.out.println();
	}
	public static void printName(String name) {
		int length = name.length();
		
		printLine(length);
		
		System.out.println('|' + name + '|');
		
		printLine(length);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name = in.nextLine();
		
		printName(name);
		in.close();

	}

}
