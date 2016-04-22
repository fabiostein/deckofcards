package stein.deckofcards.controller;

import java.util.ArrayList;
import java.util.List;

import stein.deckofcards.model.Deck;

public class DeckPartitioner {

    public DeckPartitioner() {
    }

    public List<Deck> partition(Deck deck, Integer quantityOfCards) {
        List<Deck> deckParts = new ArrayList<Deck>(2);
        deckParts.add(deck.subList(0, quantityOfCards.intValue()));
        deckParts.add(deck.subList(quantityOfCards.intValue(), deck.size()));
        return deckParts;
    }
}
