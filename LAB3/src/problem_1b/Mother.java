package problem_1b;

public class Mother extends Person implements CanHaveMeal, CanHaveToy {
	
	private String name;
    private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Mother() {};
	
	public Mother(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void play() {
		System.out.println("Mother plays with toy~");
	}

	public void cook() {
		System.out.println("Mother cooks beshbarmak~");
	}

	public String toString() {
		return "Mother [name=" + name + ", age=" + age + "]";
	}	
}
