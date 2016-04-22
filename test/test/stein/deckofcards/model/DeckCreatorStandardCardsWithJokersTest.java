package test.stein.deckofcards.model;

import org.junit.Assert;
import org.junit.Test;

import stein.deckofcards.controller.DeckCreator;
import stein.deckofcards.controller.DeckCreatorStandardCardsWithJokers;
import stein.deckofcards.model.Deck;
public class DeckCreatorStandardCardsWithJokersTest {

    @Test
    public void testCreateDeackStandardCards() {
        DeckCreator deckCreator = new DeckCreatorStandardCardsWithJokers();
        Deck deck = deckCreator.create();
        
        Assert.assertTrue(deck.size()==54);
        Assert.assertTrue(deck.containsJoker());
    }
}
