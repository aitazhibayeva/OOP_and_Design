package problem_1;

import java.util.Scanner;

public class Analyser {

	public static void main(String[] args) {
		Data data = new Data();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("Enter number: (Q to quit): ");
			String numberOrQ = in.next();
			if(numberOrQ.equals("Q")) {
				break;
			}
			else {
				int number = Integer.parseInt(numberOrQ);
				data.addValue(number);
			}
		}
		
		System.out.println("Average = " + data.averageValue());
		System.out.println("Maximum = " + data.getMax());
		in.close();
	}

}
