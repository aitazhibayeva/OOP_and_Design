package problem_2;

public class Dragon extends Predators implements FlyMoveable{

	private String name;
    private int numOfTeeth;

    public String getName() {
		return name;
	}
	public int getNumOfTeeth() {
		return numOfTeeth;
	}
	
	public Dragon () {};

	public Dragon (String name, int numOfTeeth) {
        this.name = name;
        this.numOfTeeth = numOfTeeth;
    }
	
	public String toString() {
		return super.toString();
	}
	
	public void move() {
		System.out.println("Move on the ground~");
	}
	
	public void flyMove() {
		System.out.println("Fly in the sky~");
		
	}
}
