package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RoundTest {
	Card card_1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");
	Card card_2 = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
	Card card_3 = new Card("Describe in words the exact direction that is 697.5 degrees clockwise from due north?", "North north west", "STEM");
	ArrayList<Card> cards = new ArrayList<>();

	@Test
	void testForInstanceOfTheRoundClass() {
		cards.add(card_1);
		cards.add(card_2);
		cards.add(card_3);
		Deck deck = new Deck(cards);
		
		Round round = new Round(deck);
		Assert.assertNotNull(round);
	}
	
	@Test 
	void testThatTurnsIsEmptyAtStart() {
		cards.add(card_1);
		cards.add(card_2);
		cards.add(card_3);
		Deck deck = new Deck(cards);
		
		Round round = new Round(deck);
		Assert.assertEquals(0, round.turns.size());
	}
	
	@Test
	void testThatFirstCardIsInTheDeckIsCorrect() {
		cards.add(card_1);
		cards.add(card_2);
		cards.add(card_3);
		Deck deck = new Deck(cards);
		
		Round round = new Round(deck);
		Assert.assertEquals(card_1, round.current_card());
	}
	
	@Test
	void testThatFirstCardIsInTheDeckIsCorrectWithAnotherTurn() {
		cards.add(card_1);
		cards.add(card_2);
		cards.add(card_3);
		Deck deck = new Deck(cards);
		Round round = new Round(deck);
		round.turns.add(new Turn("Juneau", card_1));
		round.turns.add(new Turn("Mars", card_2));
		
		Assert.assertEquals(card_2, round.current_card());
	}
	
	@Test
	void testThatTakeTurnMethodCreatesATurnObject() {
		cards.add(card_1);
		cards.add(card_2);
		cards.add(card_3);
		Deck deck = new Deck(cards);
		Round round = new Round(deck);
		
		Assert.assertEquals("Correct!", round.take_turn("Juneau", card_1).feedback());
	}

}
