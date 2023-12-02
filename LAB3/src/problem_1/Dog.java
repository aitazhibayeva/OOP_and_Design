package problem_1;

public class Dog extends Pet implements Moveable{
	
	String bread;
	
	public Dog() {};
	
	public void voice() {
		System.out.println("gaf");
	}
	
	public void move() {
		System.out.print("walk");
	}
}
