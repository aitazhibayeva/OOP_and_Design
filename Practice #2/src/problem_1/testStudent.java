package problem_1;

import java.util.Scanner;

public class testStudent {

	public static void main(String[] args) {
		Student student = new Student();
		Scanner in = new Scanner(System.in);
		
		student.id = 1234;
		student.name = "Aizada";
		
		System.out.println(student.toString());	
		System.out.println("How much did you get for the exam?");
		System.out.println(student.exam(in.nextInt()));
		System.out.println(student.coolName(student.name));
		
		in.close();
	}

}

