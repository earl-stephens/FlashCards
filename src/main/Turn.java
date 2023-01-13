package main;

public class Turn {
	public String guess;
	public Card card;
	
	public Turn(String guess, Card card) {
		this.guess = guess;
		this.card = card;
	}
	
	public boolean correct() {
		return guess == card.answer;
	}
	

}
