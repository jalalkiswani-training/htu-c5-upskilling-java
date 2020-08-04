package edu.htu.upskilling.java.lecture9.cardsgame.v1;

public class Card {
	private int value;
	private CardType type;

	public Card(int value, CardType cardType) {
		setValue(value);		
		setType(cardType);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

}
