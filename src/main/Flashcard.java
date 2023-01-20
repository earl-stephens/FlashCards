package main;

import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Flashcard {
	public static void main(String[] args) {
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		
		Card card_1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");
		Card card_2 = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
		Card card_3 = new Card("Describe in words the exact direction that is 697.5 degrees clockwise from due north?", "North north west", "STEM");
		Card card_4 = new Card("What is 5 + 5?", "10", "STEM");
		Card card_5 = new Card("What is Rachel's favorite animal?", "Kangaroo", "Turing Staff");
		Card card_6 = new Card("What is Mike's middle name?", "nobody knows", "Turing Staff");
		Card card_7 = new Card("What cardboard cutout lives at Turing?", "Justin Bieber", "Pop Culture");
		ArrayList<Card> card = new ArrayList<>();
		card.add(card_1);
		card.add(card_2);
		card.add(card_3);
		card.add(card_4);
		card.add(card_5);
		card.add(card_6);
		card.add(card_7);
		Deck deck = new Deck(card);
		Round round = new Round(deck);
		
		JOptionPane.showMessageDialog(null, "Welcome! You're playing with " + round.deck.count() + " cards.");
		for(int i = round.currentCardCounter; i <= round.deck.count(); i++) {
			String guess = JOptionPane.showInputDialog(null, "<html>This is card " + round.currentCardCounter + " of " + round.deck.count() + ".<br>Question: " + round.current_card().question + "</html>");
			Turn turn = round.take_turn(guess, round.current_card());
			JOptionPane.showMessageDialog(null, turn.feedback());
		}
		
		String line1 = "****** Game over! ******";
		String line2 = "You had " + round.number_correct() + " correct guesses out of " + round.deck.count() + " for a total score of " + nf.format(round.percent_correct()) + "%.";
		String line3 = "STEM - " + nf.format(round.percent_correct_by_category("STEM")) + "% correct";
		String line4 = "Turing Staff - " + nf.format(round.percent_correct_by_category("Turing Staff")) + "% correct";
		String line5 = "Pop Culture - " + nf.format(round.percent_correct_by_category("Pop Culture")) + "% correct";
		String line6 = "Geography - " + nf.format(round.percent_correct_by_category("Geography")) + "% correct";

		JOptionPane.showMessageDialog(null, "<html>" + line1 + "<br>" + line2 + "<br>" + line3 + "<br>" + line4 + "<br>" + line5 + "<br>" + line6 + "</html>");
	}
}

