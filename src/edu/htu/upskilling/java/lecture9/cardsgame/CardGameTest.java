package edu.htu.upskilling.java.lecture9.cardsgame;

public class CardGameTest {
	public static void main(String[] args) {
	
		Game game = new Game();
		Player[] players = new Player[4];

		players[0] = new Player("Ata");
		players[1] = new Player("Kamal");
		players[2] = new Player("Essa");
		players[3] = new Player("Jameel");

		game.setPlayers(players);
		game.start();
		
		game.showCards();
	}
}
