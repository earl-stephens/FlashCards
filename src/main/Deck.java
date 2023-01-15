package main;
import java.util.ArrayList;
import java.util.List;

public class Deck {
	public ArrayList<Card> card = new ArrayList<>();
	
	public Deck(ArrayList<Card> card) {
		this.card = card;
	}
	
	public int count() {
		return card.size();
	}
	
	/*public Card cards_in_category(String selectedCategory) {
		Card categoryArray[];
		
		for(int i = 0; i < card.length; i++) {
			if(card[i].category == selectedCategory) {
				categoryArray;
			}
		}
		return categoryArray;
	}
	*/
}
