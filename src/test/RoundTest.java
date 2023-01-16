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
	void testThatTheCardIsInTheDeckIsCorrectWithAnotherTurn() {
		cards.add(card_1);
		cards.add(card_2);
		cards.add(card_3);
		Deck deck = new Deck(cards);
		Round round = new Round(deck);
		round.take_turn("Juneau", card_1);
		round.take_turn("Mars", card_2);
		
		Assert.assertEquals(card_3, round.current_card());
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
	
	@Test
	void testThatTakeTurnMethodUpdatesTheTurnArray() {
		cards.add(card_1);
		cards.add(card_2);
		cards.add(card_3);
		Deck deck = new Deck(cards);
		Round round = new Round(deck);
		
		round.take_turn("Juneau", round.deck.card.get(0));
		Assert.assertEquals(1, round.turns.size());
		
		round.take_turn("Mars", round.deck.card.get(1));
		Assert.assertEquals(2, round.turns.size());
	}
	
	@Test
	void testThatTakeTurnMethodUpdatesTheCurrentCard() {
		cards.add(card_1);
		cards.add(card_2);
		cards.add(card_3);
		Deck deck = new Deck(cards);
		Round round = new Round(deck);
		
		round.take_turn("Juneau", round.deck.card.get(0));
		Assert.assertEquals(card_2, round.current_card());
		
		round.take_turn("Mars", round.deck.card.get(1));
		Assert.assertEquals(card_3, round.current_card());
	}
	
	@Test
	void testThatNumberCorrectIsRight() {
		cards.add(card_1);
		cards.add(card_2);
		cards.add(card_3);
		Deck deck = new Deck(cards);
		Round round = new Round(deck);
		round.take_turn("pink", round.deck.card.get(0));
		round.take_turn("Mars", round.deck.card.get(1));
		round.take_turn("North north west", round.deck.card.get(2));
		
		Assert.assertEquals(2, round.number_correct());
	}
}
