import java.util.Scanner;

public class problem_3 {

	public static void calculate(int num) {
		System.out.println("GPA: ");
		if(num < 50) {
			System.out.print("F");
			System.out.println();
		}
		else if(50 <= num &&  num <= 54) {
			System.out.print("D");
			System.out.println();
		}else if(55 <= num &&  num <= 59) {
			System.out.print("D+");
			System.out.println();
		}else if(60 <= num &&  num <= 64) {
			System.out.print("C-");
			System.out.println();
		}else if(65 <= num &&  num <= 69) {
			System.out.print("C");
			System.out.println();
		}else if(70 <= num &&  num <= 74) {
			System.out.print("C+");
			System.out.println();
		}else if(75 <= num &&  num <= 79) {
			System.out.print("B-");
			System.out.println();
		}else if(80 <= num &&  num <= 84) {
			System.out.print("B");
			System.out.println();
		}else if(85 <= num &&  num <= 89) {
			System.out.print("B+");
			System.out.println();
		}else if(90 <= num &&  num <= 94) {
			System.out.print("A-");
			System.out.println();
		}else if(95 <= num &&  num <= 100) {
			System.out.print("A");
			System.out.println();
		}else if(num < 0 || num > 100) {
			System.out.print("error");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = in.nextInt();
		calculate(num);
		in.close();

	}

}
