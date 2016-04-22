package stein.deckofcards.controller;

import javax.xml.bind.annotation.XmlTransient;

import stein.deckofcards.model.CardStandard;
import stein.deckofcards.model.Deck;
import stein.deckofcards.model.Rank;
import stein.deckofcards.model.Suit;

@XmlTransient
public class DeckCreatorStandardCards
    implements DeckCreator
{

    public DeckCreatorStandardCards()
    {
    }

    public Deck create()
    {
        Deck standardDeck = new Deck();
        Rank arank[];
        int j = (arank = Rank.values()).length;
        for(int i = 0; i < j; i++)
        {
            Rank rank = arank[i];
            if(rank.getRankPoint().intValue() >= 1 && rank.getRankPoint().intValue() <= 13)
            {
                Suit asuit[];
                int l = (asuit = Suit.values()).length;
                for(int k = 0; k < l; k++)
                {
                    Suit suit = asuit[k];
                    stein.deckofcards.model.Card card = new CardStandard(rank, suit);
                    standardDeck.add(card);
                }

            }
        }

        return standardDeck;
    }
}
