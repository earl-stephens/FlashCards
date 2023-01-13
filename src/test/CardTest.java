package test;
import main.Card;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CardTest {

	@Test
	void shouldHaveAnInstanceOfCardClass() {
		Card card = new Card("What is the capital of Alaska?", "Juneau", "Geography");
		
		Assert.assertNotNull(card);
	}

}
