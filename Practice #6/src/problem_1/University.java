package problem_1;

public class University {
	
	boolean haveRetake(CanHaveRetake dumb) {
		dumb.retake();
		if(dumb instanceof Person) {
			System.out.println("You have to pay $450!");
		}
		return true;
	}
	
}
