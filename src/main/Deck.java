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
	
	public ArrayList<Card> cards_in_category(String selectedCategory) {
		ArrayList<Card> categoryArray = new ArrayList<>();
		
		for(int i = 0; i < card.size(); i++) {
			if(card.get(i).category == selectedCategory) {
				categoryArray.add(card.get(i));
			}
		}
		return categoryArray;
	}
	
}
