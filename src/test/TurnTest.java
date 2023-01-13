package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TurnTest {

	@Test
	void shouldHaveAnInstanceOfTheTurnClass() {
		String guess = "Juneau";
		Card card = new Card("What is the capital of Alaska?", "Juneau", "Geography");
		Turn turn = new Turn(guess, card);
		
		Assert.assertNotNull(turn);
	}
	
	@Test
	 void shouldHaveAGuessMethod() {
		String guess = "Juneau";
		Card card = new Card("What is the capital of Alaska?", "Juneau", "Geography");
		Turn turn = new Turn(guess, card);
		
		Assert.assertEquals(turn.card.answer, guess);
	}

	@Test
	 void shouldHaveACorrectMethod() {
		String guess = "Juneau";
		Card card = new Card("What is the capital of Alaska?", "Juneau", "Geography");
		Turn turn = new Turn(guess, card);
		
		Assert.assertEquals(true, turn.correct());
	}
	
	@Test
	 void shouldHaveAFeedbackMethod() {
		String guess = "Juneau";
		Card card = new Card("What is the capital of Alaska?", "Juneau", "Geography");
		Turn turn = new Turn(guess, card);
		
		Assert.assertEquals("Correct!", turn.feedback());
	}
}
