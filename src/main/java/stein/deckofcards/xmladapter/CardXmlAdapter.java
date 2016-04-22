package stein.deckofcards.xmladapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import stein.deckofcards.model.Card;
import stein.deckofcards.model.CardJoker;
import stein.deckofcards.model.CardStandard;
import stein.deckofcards.model.Rank;
import stein.deckofcards.model.Suit;

public class CardXmlAdapter

		extends XmlAdapter<CardAdapter, Card> {

	@Override
	public CardAdapter marshal(Card card) throws Exception {
		if (null == card) {
			return null;
		}
		CardAdapter cardAdapter = new CardAdapter();
		cardAdapter.setRank(card.getRank());

		if (card instanceof CardStandard) {
			Suit suit = ((CardStandard) card).getSuit();
			cardAdapter.setSuit(suit);

		} else if (card instanceof CardJoker) {
			cardAdapter.setJokerId(((CardJoker) card).getJokerId());
		}
		return cardAdapter;
	}

	@Override
	public Card unmarshal(CardAdapter cardAdapter) throws Exception {
		if (null == cardAdapter) {
			return null;
		}
		Card card = null;
		Rank rank = cardAdapter.getRank();
		if (null != cardAdapter.getSuit()) {
			Suit suit = cardAdapter.getSuit();
			card = new CardStandard(rank, suit);

			return card;
		} else if (cardAdapter.getJokerId() > 0) {
			card = new CardJoker(cardAdapter.getJokerId());
			return card;
		}
		return card;
	}

	public static class AdaptedContactMethod {

		@XmlAttribute
		public String number;

		@XmlAttribute
		public String street;

		@XmlAttribute
		public String city;

	}
}
