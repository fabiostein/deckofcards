package stein.deckofcards.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Deck")
@XmlAccessorType(XmlAccessType.FIELD)
public class Deck {

	private static final long serialVersionUID = 0xecf2b3589bce6385L;
	private boolean containsJoker;

	@XmlElement(name = "card")
	private List<Card> cards = new ArrayList<Card>(0);

	public Deck() {
		containsJoker = false;
	}

	public List<Card> getCards() {
		return cards;
	}
	public int size(){
		return cards.size();
	}

	public void setCards(List<Card> cards) {
		for (Card card : cards) {
			this.add(card);
		}
	}

	public boolean add(Card card) {
		if (Rank.JOKER.equals(card.getRank()))
			containsJoker = true;
		return cards.add(card);
	}

	public boolean containsJoker() {
		return containsJoker;
	}

	public Deck subList(int fromIndex, int toIndex) {
		Deck deck = new Deck();
		deck.setCards(cards.subList(fromIndex, toIndex));
		return deck;

	}
}
