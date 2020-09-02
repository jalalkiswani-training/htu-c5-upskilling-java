package edu.htu.upskilling.java.lecture9.cardsgame.v2;

public class Card {
	private int value;
	private String type;

	public Card(int value, String cardType) {
		setValue(value);
		setType(cardType);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
