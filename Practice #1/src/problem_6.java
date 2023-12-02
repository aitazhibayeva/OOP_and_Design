import java.util.Scanner;

public class problem_6 {

	public static void polindrome(String string) {
		int length = string.length();
		
		for(int i=0; i< length/2; i++) {
			if(string.charAt(i) !=string.charAt(length-i-1)) {
				System.out.println(string+" is not a polindrome");
				return;
			}
		}
		
		System.out.println(string + " is a polindrome");
	
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		polindrome(string);
		in.close();
	}
}
