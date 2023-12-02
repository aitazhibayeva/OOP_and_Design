package problem_1;

public class Cat extends Animal implements CanHavePizza, Movable {
	
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

	public Cat() {};
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void move() {
		System.out.println("Cat is moving~");	
	}
	
	public void eatPizza() {
		System.out.println("Cat is eating pizza, yummy~");
	}


	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}
