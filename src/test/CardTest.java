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
	
	@Test
	void shouldHaveAQuestionAttribute() {
		Card card = new Card("What is the capital of Alaska?", "Juneau", "Geography");

		Assert.assertEquals("What is the capital of Alaska?", card.question);
	}
	
	@Test
	void shouldHaveAnAnswerAttribute() {
		Card card = new Card("What is the capital of Alaska?", "Juneau", "Geography");

		Assert.assertEquals("Juneau", card.answer);
	}
	
	@Test
	void shouldHaveASubjectAttribute() {
		Card card = new Card("What is the capital of Alaska?", "Juneau", "Geography");

		Assert.assertEquals("Geography", card.category);
	}

}
