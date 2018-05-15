
public class Main {

	public static void main(String[] args) {
		Game yahtzee = new Game();
		
		yahtzee.players[0] = new Player();
		yahtzee.players[1] = new Player();
		
		
		yahtzee.Start();
yahtzee.presenteerSpelers();
	}

}
