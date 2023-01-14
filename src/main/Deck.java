package main;

public class Deck {
	public Card card[];
	
	public Deck(Card[] card) {
		this.card = card;
	}
	
	public int count() {
		return card.length;
	}
}
