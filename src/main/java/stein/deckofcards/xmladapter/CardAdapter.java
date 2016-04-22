package stein.deckofcards.xmladapter;

import stein.deckofcards.model.Rank;
import stein.deckofcards.model.Suit;

public class CardAdapter {
	private Rank rank = null;
	private Suit suit = null;
	private int JokerId = 0;
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public int getJokerId() {
		return JokerId;
	}
	public void setJokerId(int jokerId) {
		JokerId = jokerId;
	}

}
