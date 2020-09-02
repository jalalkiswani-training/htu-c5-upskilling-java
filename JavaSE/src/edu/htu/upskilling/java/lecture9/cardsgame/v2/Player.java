package edu.htu.upskilling.java.lecture9.cardsgame.v2;

public class Player {
	private String name;
	private int score;
	private Card[] cards;

	public Player() {
	}
	
	public Player(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

}
