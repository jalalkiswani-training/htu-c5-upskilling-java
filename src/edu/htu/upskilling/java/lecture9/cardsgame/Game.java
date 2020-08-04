package edu.htu.upskilling.java.lecture9.cardsgame;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
	private Player[] players;
	private Card[] cards;

	public void start() {
		System.out.println("Starting Game...");
		shuffle();
		distibute();
	}

	private void shuffle() {
		System.out.println("Creating 52 Cards....");
		cards = createCards();
		for (Card card : cards) {
			System.out.println("\t" + card.getValue() + ", " + card.getType());
		}
		System.out.println("Shuffling cards...");
		shuffleArray(cards);
		System.out.println("Printing cards after shuffling....");
		for (Card card : cards) {
			System.out.println("\t" + card.getValue() + ", " + card.getType());
		}
	}

	private void distibute() {
		int startIndex = 0;
		for (Player player : players) {
			player.setCards(Arrays.copyOfRange(cards, startIndex, startIndex + 13));
			startIndex += 13;
		}
	}

	public void printScore() {
		for (Player player : players) {
			System.out.println("Player " + player.getName() + " score is " + player.getScore());
		}
	}

	public void showCards() {
		System.out.println("Showing cards ...");
		for (Player player : getPlayers()) {
			System.out.println(" Player : " + player.getName());
			for (Card card : player.getCards()) {
				System.out.println("\t" + card.getValue() + ":" + card.getType());
			}
		}
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	private void shuffleArray(Card[] ar) {
		// If running on Java 6 or older, use `new Random()` on RHS here
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			Card a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

	private Card[] createCards() {
		Card[] cards = new Card[52];
		int cardCounter = 0;
		for (CardType cardType : CardType.values()) {
			for (int i = 1; i <= 13; i++) {
				Card card = new Card(i, cardType);
				cards[cardCounter++] = card;
			}
		}
		return cards;
	}
}
