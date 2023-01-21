package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Flashcard {
	
	
	public static void main(String[] args) throws IOException {
			
		start();
	}
	
	public static void start() throws FileNotFoundException {
		ArrayList<Card> card = loadCards();
		Deck deck = new Deck(card);
		Round round = new Round(deck);
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		
		JOptionPane.showMessageDialog(null, "Welcome! You're playing with " + round.deck.count() + " cards.");
		for(int i = round.currentCardCounter; i <= round.deck.count(); i++) {
			String guess = JOptionPane.showInputDialog(null, "<html>This is card " + round.currentCardCounter + " of " + round.deck.count() + ".<br>Question: " + round.current_card().question + "</html>");
			Turn turn = round.take_turn(guess, round.current_card());
			JOptionPane.showMessageDialog(null, turn.feedback());
		}
		
		String line1 = "****** Game over! ******";
		String line2 = "You had " + round.number_correct() + " correct guesses out of " + round.deck.count() + " for a total score of " + nf.format(round.percent_correct()) + "%.";
		String line3 = "STEM - " + nf.format(round.percent_correct_by_category("STEM")) + "% correct";
		String line4 = "Pop Culture - " + nf.format(round.percent_correct_by_category("Pop Culture")) + "% correct";
		String line5 = "Geography - " + nf.format(round.percent_correct_by_category("Geography")) + "% correct";

		JOptionPane.showMessageDialog(null, "<html>" + line1 + "<br>" + line2 + "<br>" + line3 + "<br>" + line4 + "<br>" + line5 + "</html>");
	}

	public static ArrayList<Card> loadCards() throws FileNotFoundException {
		Scanner diskScanner = new Scanner(new File("cards.txt"));
		ArrayList<Card> cards = new ArrayList<>();
		while(diskScanner.hasNextLine()) {
			String line = diskScanner.nextLine();
			String[] cardQuestions = line.split(",");
			Card card = new Card(cardQuestions[0], cardQuestions[1], cardQuestions[2]);
			cards.add(card);
		}
		return cards;
	}

}

