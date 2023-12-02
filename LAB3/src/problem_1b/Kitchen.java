package problem_1b;

public class Kitchen {
		
	boolean cooking(CanHaveMeal cooker) {
		cooker.cook();
		if(cooker instanceof Person) {
			System.out.println("Delicious!");
		}
		return true;
	}
}
