package problem_1b;

public class Tester {

	public static void main(String[] args) {
		
		Baby baby = new Baby();
		Mother mama = new Mother();
		Dog dog = new Dog();
		
		Kitchen kitchen = new Kitchen();
		GameRoom gameroom = new GameRoom();
		
		CanHaveMeal cooker = mama;
		kitchen.cooking(cooker);
		System.out.println();
		
//		kitchen.cooking(baby);
		
		
		CanHaveToy player = baby;
		gameroom.playing(player);
		
		player = mama;
		gameroom.playing(player);
	
		gameroom.playing(dog);

	}

}
