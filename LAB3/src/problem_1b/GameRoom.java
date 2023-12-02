package problem_1b;

public class GameRoom {
	
	public boolean playing(CanHaveToy player) {
		player.play();
		if(player instanceof Person) {
			System.out.println("Funny!");
		}
		return true;
	}
}