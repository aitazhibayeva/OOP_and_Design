package problem_1;

public abstract class Animal {
	private String species;
    private int age;
    
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {};
    
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }
    
    public void makeSound() {
        System.out.println("The " + species + " makes a sound.");
    }

	public String toString() {
		return "Animal [species=" + species + ", age=" + age + "]";
	}
    
    
}
