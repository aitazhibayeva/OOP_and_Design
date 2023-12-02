package task1;

public abstract class Animal
{
    public String name;
    public int age;
    public Gender gender;

    public Animal() {
    	
    } 

    public Animal(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    
    public abstract void voice();

    public String toString() {
        return name + ", age: " + age + ", gender: " + gender;
    }
}