package main;

public class Turn {
	public String guess;
	public Card card;
	
	public Turn(String guess, Card card) {
		this.guess = guess;
		this.card = card;
	}
	
	public boolean correct() {
		return guess.equals(card.answer);
	}
	
	public String feedback() {
		String feedback = null;
		
		if(correct()) {
			feedback = "Correct!";
		} else {
			feedback = "Incorrect.";
		}
		
		return feedback;
	}
}
