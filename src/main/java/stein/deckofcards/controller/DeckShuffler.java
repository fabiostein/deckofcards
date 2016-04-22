package stein.deckofcards.controller;

import java.util.Collections;

import stein.deckofcards.model.Deck;

public class DeckShuffler {
    public void shuffle(Deck deck) {
        Collections.shuffle(deck.getCards());
    }
}
