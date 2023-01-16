package main;
import main.*;
import java.util.ArrayList;

public class Round {
	public Deck deck;
	public ArrayList<Turn> turns = new ArrayList<>();
	public int currentCardCounter = 1;
	
	public Round(Deck deck) {
		this.deck = deck;
	}
	
	public Card current_card() {
		return deck.card.get(currentCardCounter - 1);
	}
	
	public Turn take_turn(String guess, Card card) {
		card = current_card();
		
		Turn currentTurn = new Turn(guess, card);
		turns.add(currentTurn);
		
		currentCardCounter++;
		
		return currentTurn;
	}
	
	public int number_correct() {
		int counter = 0;
		for(Turn turn : turns) {
			if(turn.correct()) {
				++counter;
			}
		}
		return counter;
	}
	
	public int number_correct_in_category(String category) {
		int categoryCounter = 0;
		for(Turn turn : turns) {
			if(turn.card.category == category && turn.correct()) {
				++categoryCounter;
			}
		}
		return categoryCounter;
	}
	
	public double percent_correct() {
		return ((double)number_correct() / (currentCardCounter - 1)) * 100;
	}
}
