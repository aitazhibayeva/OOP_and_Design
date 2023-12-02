package task2;

import java.util.Scanner;
import java.util.Vector;

public class TestPerson
{
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	
    	Person p = new Person("Pakita", "Tole bi 59");
        Student s = new Student("Aizada", "Zhandosova 162", "SITE", 2, 2500);
        Staff sf = new Staff("Erkenaz", "Abay", "KBTU", 150000);
    	
    	Vector<Person> person = new Vector<Person>();
    	
    	person.add(p);
    	person.add(s);
    	person.add(sf);
    	    	
    	while(true) {
    		System.out.println("all persons - 1 " + " or add new person - 2? ");
    		
        	int number;
        	number = in.nextInt();
        	
	    	if(number == 1) {
	    		for(Person cur: person) {
	    			System.out.println(cur);
	    		}
	    	}
	    	if(number == 2) {
	    		System.out.println("add Person - p" + " or add Student - s" + " or add Staff - sf");
	    		
	    		String str;
	    		str = in.next();
	    		
	    		if(str.equals("p")) {
	    			Person newP = new Person(in.next(), in.next());
	    			System.out.println(newP);
	    		}
	    		else if(str.equals("s")) {
	    			System.out.println(s);
	    		}
	    		else if(str.equals("sf")) {
	    			System.out.println(sf);
	    		}
	    	}
    	}
    }
}
