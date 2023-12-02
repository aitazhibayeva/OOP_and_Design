package problem_2;

public class Tester {

	public static void main(String[] args) {
		
		Dragon dragon = new Dragon();
		Crocodile croco = new Crocodile();
		Lizard lizard = new Lizard();

		FlyMoveable wings = dragon;
//		wings.move();
		wings.flyMove();
		System.out.println();
		
		SwimMoveable swimmer = croco;
//		swimmer.move();
		swimmer.swimMove();
		System.out.println();
		
		Moveable mover = lizard;
		mover.move();
		
	}

}
