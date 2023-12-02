package problem_4;

import practice2.Student;

public class GradeBook {
	
	public String displayMessage(Course course) {
		return course.toString();
	}
	
	public void displayStudents() {
		System.out.println("\n" + "Please, input grades for students:" + "\n");
		
		for(Student st: Student.studentsList) {
			System.out.println(st);
		}
	}
	
	public String displayGradeReport() {
		return "\n" + 
				"Class average is " + determineClassAverage() +
				". Lowest grade is " + lowestGrade() +
				". Highest grade is " + highestGrade() + "." + "\n";
	}
	
	public double determineClassAverage() {
		double sum = 0;
		
		for(int i = 0; i < Student.studentsList.size(); i++) {
			sum = sum + Student.studentsList.get(i).grade;
		}
		return sum / Student.studentsList.size();
	}
	
	public String lowestGrade() {
		
		int min = 100;
		String student = " ";
		
		for(int i = 0; i < Student.studentsList.size(); i++) {
			if(min > Student.studentsList.get(i).grade) {
				min = Student.studentsList.get(i).grade;
				student = " (Student " + Student.studentsList.get(i).name + 
						", id: " + Student.studentsList.get(i).getId() + ")";
			}
		}
		return min + student;
	}
	public String highestGrade() {
		
		int max = 0;
		String student = " ";
		
		for(int i = 0; i < Student.studentsList.size(); i++) {
			if(max < Student.studentsList.get(i).grade) {
				max = Student.studentsList.get(i).grade;
				student = " (Student " + Student.studentsList.get(i).name + 
								", id: " + Student.studentsList.get(i).getId() + ")";
			}
		}
		return max + student;
	}
	
	public void outputBarChart() {
		
		System.out.println("Grades distribution:");

		char ch = '*';
		String[] table  = new String[] {"00-09: ",
											"10-19: ",
											"20-29: ",
											"30-39: ",
											"40-49: ",
											"50-59: ",
											"60-69: ",
											"70-79: ",
											"80-89: ",
											"90-99: ",
											"100: ",};

		for(int i = 0; i < Student.studentsList.size(); i++) {
			if(0 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 9) {
				table[0] = new StringBuilder(table[0]).append(ch).toString();
			}
			if(10 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 19) {
				table[1] = new StringBuilder(table[1]).append(ch).toString();
			}
			if(20 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 29) {
				table[2] = new StringBuilder(table[2]).append(ch).toString();
			}
			if(30 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 39) {
				table[3] = new StringBuilder(table[3]).append(ch).toString();
			}
			if(40 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 49) {
				table[4] = new StringBuilder(table[4]).append(ch).toString();
			}
			if(50 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 59) {
				table[5] = new StringBuilder(table[5]).append(ch).toString();
			}
			if(60 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 69) {
				table[6] = new StringBuilder(table[6]).append(ch).toString();
			}
			if(70 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 79) {
				table[7] = new StringBuilder(table[7]).append(ch).toString();
			}
			if(80 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 89) {
				table[8] = new StringBuilder(table[8]).append(ch).toString();
			}
			if(90 <= Student.studentsList.get(i).grade && Student.studentsList.get(i).grade <= 99) {
				table[9] = new StringBuilder(table[9]).append(ch).toString();
			}
			if(Student.studentsList.get(i).grade >= 100) {
				table[10] = new StringBuilder(table[10]).append(ch).toString();
			}
		}
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(table[i]);
		}
	}

	public String toString() {
		return displayGradeReport();
	}
}
