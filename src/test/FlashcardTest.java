package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.Assert;

import main.*;

import org.junit.jupiter.api.Test;

class FlashcardTest {

	@Test
	void testThatThereIsAFlashcardInstance() {
		Flashcard flashcard = new Flashcard();
		Assert.assertNotNull(flashcard);
	}

	@Test
	void testsThatTheCardFileIsReadAndCaptured() throws FileNotFoundException {
		Flashcard flashcard = new Flashcard();
		ArrayList<Card> card = Flashcard.loadCards();
		Assert.assertEquals(12, card.size());
	}
}
