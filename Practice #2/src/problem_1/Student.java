package problem_1;

public class Student {
	int id;
	String name;
	static int yearOfStudy;
	
	public Student() {
		yearOfStudy++;
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	
	public String exam(int grade) {
		if(grade > 50) {		
			return "Great!";
		}
		return "You got F";
	}
	
	public String coolName(String name) {
		System.out.println("Your name is " + this.name);
		for(int i=0; i<name.length(); i++) {
			if( this.name.length() >= 6) {
				return "you have a long name";
			}
		}
		return "your name is very short";		
	}
	
	public String toString () {
		return id + " " + name + " " + yearOfStudy;
	}
}