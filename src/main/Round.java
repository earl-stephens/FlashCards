package main;
import main.*;
import java.util.ArrayList;

public class Round {
	public Deck deck;
	public ArrayList<Turn> turns = new ArrayList<>();
	
	public Round(Deck deck) {
		this.deck = deck;
	}
	
	public Card current_card() {
		if(turns.size() == 0) {
			return deck.card.get(turns.size());
		} else {
			return deck.card.get(turns.size() -1);
		}
	}
}
