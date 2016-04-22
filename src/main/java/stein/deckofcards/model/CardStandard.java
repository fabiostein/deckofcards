package stein.deckofcards.model;

public class CardStandard extends Card {

    public CardStandard(Rank rank, Suit suit) {
        super(rank);
        this.suit = null;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + super.hashCode();
        result = prime * result + (suit != null ? suit.hashCode() : 0);
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CardStandard))
            return false;
        if (!super.equals(obj))
            return false;
        CardStandard other = (CardStandard) obj;
        return getSuit() == other.getSuit();
    }

    public String toString() {
        return (new StringBuilder(super.toString())).append(" of ").append(suit).toString();
    }

    private Suit suit;
}
