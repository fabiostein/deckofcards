package test.stein.deckofcards.model;

import org.junit.Assert;
import org.junit.Test;

import stein.deckofcards.controller.DeckCreator;
import stein.deckofcards.controller.DeckCreatorStandardCards;
import stein.deckofcards.model.Deck;
public class DeckCreatorStandardCardsTest {

    @Test
    public void testCreateDeackStandardCards() {
        DeckCreator deckCreator = new DeckCreatorStandardCards();
        Deck deck = deckCreator.create();
        
        Assert.assertTrue(deck.size()==52);
        Assert.assertTrue(!deck.containsJoker());
    }
}
