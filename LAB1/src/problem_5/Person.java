package problem_5;

public class Person {
	String name;
	Gender gender;
	int age;
	
	public Person(String name, Gender gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Name: " + this.name + " gender: " + this.gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}