package task1;

import java.util.Vector;

public class TestDog {

	public static void main(String[] args) {
//		Animal a = new Animal();
        
        Dog d1 = new Dog("Aqtos", 2, Gender.MALE, "white");
        Dog d2 = new Dog("Niki", 4, Gender.FEMALE, "brown");
        Dog d3 = new Dog("Stormy", 1, Gender.FEMALE, "black");
        Animal d4 = new Dog("Dolmatin", 6, Gender.FEMALE, "black-white");

        
        Vector<Dog> dog = new Vector<Dog>();
        dog.add(d1);
        dog.add(d2);
        dog.add(d3);
        dog.add((Dog) d4);
        
        for(Dog cur: dog) {
            System.out.println(cur);
        }

        System.out.println();
        
//        a.voice();
        d1.voice();
        d2.voice();
        d3.voice();
        d4.voice();
        
        System.out.println();
        System.out.println("Children: " + d1.sumOfKids(5, 3));
	}
}
