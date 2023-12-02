package problem_2;

public abstract class Predators {
	
	private String name;
    private int numOfTeeth;

    public String getName() {
		return name;
	}
	public int getNumOfTeeth() {
		return numOfTeeth;
	}
	
	public Predators() {};

	public Predators(String name, int numOfTeeth) {
        this.name = name;
        this.numOfTeeth = numOfTeeth;
    }
	
	public String toString() {
		return "Predators [name=" + name + ", numOfTeeth=" + numOfTeeth + "]";
	}

}
