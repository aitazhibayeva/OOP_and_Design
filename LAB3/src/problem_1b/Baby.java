package problem_1b;

public class Baby extends Person implements CanHaveToy{
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public Baby() {};
	
	public Baby(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void play() {
		System.out.println("Baby plays with toy~");
	}

	public String toString() {
		return "Baby [name=" + name + ", age=" + age + "]";
	}
	 
}
