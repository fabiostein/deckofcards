package stein.deckofcards.model;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import stein.deckofcards.xmladapter.CardXmlAdapter;

@XmlJavaTypeAdapter(CardXmlAdapter.class)
public abstract class Card {
    private Rank rank;

    protected Card(Rank rank) {
        this.rank = null;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + (rank != null ? rank.hashCode() : 0);
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Card))
            return false;
        Card other = (Card) obj;
        return rank == other.getRank();
    }

    public String toString() {
        return rank.toString();
    }
}
