package problem_1;

public class Restaurant {
	
	boolean servePizza(CanHavePizza eater) {
		eater.eatPizza();
		if(eater instanceof Person) {
			System.out.println("You have to pay $100!");
		}
		return true;
	}
		
}
