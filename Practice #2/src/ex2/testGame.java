package ex2;

public class testGame {
	String login;
	String password;
	int numOfGames;
	
	public testGame (String login, String password, int numOfGames)
{
		this.login = login;
		this.password = password;
		this.numOfGames = numOfGames;
		
}
	
	//overloaded method of play()
	public String play(int victory) {
		if(victory == 0 ) {
			return "You lose!";
		}
		return "You are the best gamer!";
	}
}
