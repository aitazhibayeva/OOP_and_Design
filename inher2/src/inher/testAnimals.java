package inher;

import java.util.Vector;

public class testAnimals {

	public static void main(String[] args) {
		Dog d1 = new Dog("Rex", 8);
		Dog d2 = new Dog("Shurik", 18);
		Animal c1 = new Cat("Nurka");
		Cat c2 = new Cat("Murka");
		c2.setDocStatus(Status.NOT_OK);

		Vector<Animal> zoo = new Vector<Animal>();
		zoo.add(d1);
		zoo.add(d2);
		zoo.add(c1);
		zoo.add(c2);

		System.out.println(zoo);

		for(Animal animal : zoo) {
			System.out.println("\n"+animal.voice()); // polymorphism, call overriden voice
			if(animal instanceof Cat) {
				Cat c = (Cat)animal;
				c.findViscas();
				c.findMouse();
			}
			else if(animal instanceof Dog) {
				((Dog)animal).findPedigree(); // call specific
			}
			System.out.println(animal + ", crossing border -"+Animal.crossTheBorder(animal));
			animal.move(10); //call inherited move
		}

	}

}
