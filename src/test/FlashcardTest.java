package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

import main.*;

import org.junit.jupiter.api.Test;

class FlashcardTest {

	@Test
	void testThatThereIsAFlashcardInstance() {
		Flashcard flashcard = new Flashcard();
		Assert.assertNotNull(flashcard);
	}
	
	

}
