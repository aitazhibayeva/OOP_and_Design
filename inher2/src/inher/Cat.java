package inher;

public class Cat extends Animal{

	int numOfMiceCaught;

	public Cat() {

	}
	public Cat(String name) {
		super(name);
	}
	public Cat(String name, int numOfMiceCaught) {
		super(name);
		this.numOfMiceCaught = numOfMiceCaught;
	}

	public String voice() {
		return "meow";
	}

	public String toString() {
		return super.toString()+ ", num of mice caught: "+numOfMiceCaught;
	}
	public void findViscas() {
		System.out.println("Viscas Found!!!");
	}
	public void findMouse() {
		if(Math.random()>0.5) {
			numOfMiceCaught++;
			weight++;
		}
	}
	public void findMouse(int num) {
		for(int i=0; i<num; i++)
			findMouse();
	}
	public String eat() {
		return "Mouse, viscas - nyam";
	}

}

// 3 types of methods in child class
/// 1 overriden - voice, toString
// 2 leave as they are inherited - getDocStatus, move). 
// 3 specific - findViscas, findMouse

