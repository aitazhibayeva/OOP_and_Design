package problem_4;

import practice2.Student;

public class testGradeBook{
	
	public static void main(String args[]){
		
		GradeBook g = new GradeBook(); 
		
		Course OOP = new Course("CS101", "Object-oriented Programming and Design");

		Student s1 = new Student(1, "A", 87);
		Student s2 = new Student(2, "B", 68);
		Student s3 = new Student(3, "C", 94);
		Student s4 = new Student(4, "D", 100);
		Student s5 = new Student(5, "E", 83);
		Student s6 = new Student(6, "F", 78);
		Student s7 = new Student(7, "G", 85);
		Student s8 = new Student(8, "H", 91);
		Student s9 = new Student(9, "I", 79);
		Student s10 = new Student(10, "J", 87);
		
		
		

		System.out.println(g.displayMessage(OOP));
		
		g.displayStudents();
		System.out.println(g);
		g.outputBarChart();
		
	}
}