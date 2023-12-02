package problem_2;

public class Crocodile extends Predators implements SwimMoveable{

	private String name;
    private int numOfTeeth;

    public String getName() {
		return name;
	}
	public int getNumOfTeeth() {
		return numOfTeeth;
	}
	
	public Crocodile() {};

	public Crocodile (String name, int numOfTeeth) {
        this.name = name;
        this.numOfTeeth = numOfTeeth;
    }
	
	public String toString() {
		return super.toString();
	}
	
	public void move() {
		System.out.println("Move on the ground~");
		
	}
	
	public void swimMove() {
		System.out.println("Swim under the water~");
		
	}
}
