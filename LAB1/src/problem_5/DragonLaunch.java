package problem_5;

import java.util.Vector;

public class DragonLaunch {
	
	Vector<Person> student = new Vector<Person>();
	
	public DragonLaunch() {
		
	}
	
	public void kidnap(Person person) {
		this.student.add(person);
	}
	
	public boolean willDragonEatOrNot() {
        int numberOfFreeBoys = 0;
        for (Person i: student) {
                if (i.gender == Gender.BOY) 
                    numberOfFreeBoys++;
                else if (i.gender == Gender.GIRL && numberOfFreeBoys > 0) 
                    numberOfFreeBoys--;
                else 
                    return true;
        }
        if (numberOfFreeBoys > 0)
            return true;
        else
            return false;
    }
}
