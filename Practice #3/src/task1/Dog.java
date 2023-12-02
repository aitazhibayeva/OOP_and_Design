package task1;

public class Dog extends Animal
{
    public String color;

    public Dog() {
        super();
    }

    public Dog(String name, int age, Gender gender, String color) {
        super(name, age, gender);
        this.color = color;
        
    }

    public int sumOfKids(int a1, int a2) {
        return a1 + a2;
    }
    
    public void voice() {
        System.out.println("gav");
    }

    public String toString() {
        return "Dog- " + super.toString() + ", color: " + color; 
    }

}
