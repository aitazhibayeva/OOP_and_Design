package problem_2;

import java.util.HashSet;

public class testWizards {

	public static void main(String[] args) {
		
		HashSet<Wizard> hogwarts = new HashSet<Wizard>();

        Wizard gryffindor = new Wizard("Gryffindor", "Godric Gryffindor", "Harry Potter", "Expecto Patronum");
        Wizard ravenclaw = new Wizard("Ravenclaw", "Rowena Ravenclaw", "Luna Lovegood", "Expelliarmus");
        Wizard slytherin = new Wizard("Slytherin", "Salazar Slytherin", "Draco Malfoy", "Avada Kedavra");

        hogwarts.add(gryffindor);
        hogwarts.add(ravenclaw);
        hogwarts.add(slytherin);
        
        		
        if (!hogwarts.add(new Wizard("Gryffindor", "Godric Gryffindor", "Harry ", "Expecto Patronum"))) {
        	System.out.println("Duplicate");
        }
        
        for (Wizard wizard : hogwarts) {
            System.out.println(wizard);
        }
        
        for (Wizard wizard : hogwarts) {
            System.out.println(wizard.spell());
        }
        
        
	}

}
