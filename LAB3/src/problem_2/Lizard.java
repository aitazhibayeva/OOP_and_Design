package problem_2;

public class Lizard extends Predators implements Moveable{

	private String name;
    private int numOfTeeth;

    public String getName() {
		return name;
	}
	public int getNumOfTeeth() {
		return numOfTeeth;
	}
	
	public Lizard () {};

	public Lizard (String name, int numOfTeeth) {
        this.name = name;
        this.numOfTeeth = numOfTeeth;
    }
	
	public String toString() {
		return super.toString();
	}
	
	public void move() {
		System.out.println("Move on the ground~");
		
	}
}
