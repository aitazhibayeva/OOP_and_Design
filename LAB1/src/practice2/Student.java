package practice2;

import java.util.Vector;

public class Student
{
	public String name;
	
	int id;
	int year;
	public int grade;
	
	Faculty faculty;
	
	static int cnt;
	public static Vector <Student> studentsList;
	
	static{
		studentsList = new Vector <Student>();
	}
	{
		id = id + 1;
		studentsList.add(this); 
	}

	
	public Student() {

	}
	public Student(int id, String name, int grade)
	{
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public Student(String name, int id, int year) {
		this.name = name;
		this.id = id;
		this.year = year;
	}
	public Student(String name, int id, Faculty faculty, int year) {
		this(name, id, year);
		this.faculty = faculty;
	}
	
	public int getId() {
		return id;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public String toString() {
		return "Student " + name + ": " + grade;
	}
}