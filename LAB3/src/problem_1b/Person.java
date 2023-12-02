package problem_1b;

public abstract class Person {
	
	private String name;
    private int age;

    public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public Person() {};

	public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
