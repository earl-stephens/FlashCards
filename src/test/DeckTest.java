package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DeckTest {
	Card card_1 = new Card("What is the capital of Alaska?", "Juneau", "Geography");
	Card card_2 = new Card("The Viking spacecraft sent back to Earth photographs and reports about the surface of which planet?", "Mars", "STEM");
	Card card_3 = new Card("Describe in words the exact direction that is 697.5 degrees clockwise from due north?", "North north west", "STEM");
	Card cards[] = {card_1, card_2, card_3};

	@Test
	void TestForADeckClass() {
		Deck deck = new Deck(cards);
		Assert.assertNotEquals(5, 6);;
	}

}
