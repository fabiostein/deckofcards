package stein.deckofcards.controller;

import javax.xml.bind.annotation.XmlTransient;

import stein.deckofcards.model.CardJoker;
import stein.deckofcards.model.Deck;

@XmlTransient
public class DeckCreatorStandardCardsWithJokers extends DeckCreatorStandardCards implements DeckCreator {

    public DeckCreatorStandardCardsWithJokers() {
    }

    public Deck create() {
        Deck standardDeckWithJokers = super.create();
        standardDeckWithJokers.add(new CardJoker(Integer.valueOf(1)));
        standardDeckWithJokers.add(new CardJoker(Integer.valueOf(2)));
        return standardDeckWithJokers;
    }
}
