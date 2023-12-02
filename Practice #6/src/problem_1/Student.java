package problem_1;

public class Student extends Person implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable{
	private String name;
    private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student() {};
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public void move() {
		System.out.println("Student is moving~");
		
	}

	
	public void dance() {
		System.out.println("Student is dancing at the party~la-la~");
	}

	
	public void retake() {
		System.out.println("Oops! Student received a retake of OOP!!!");
	}

	
	public void eatPizza() {
		System.out.println("Students is eating pizza, yummy~");
		
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}