package stein.deckofcards.model;

public class CardJoker extends Card {
    private Integer jokerId;

    public CardJoker(Integer jokerId) {
        super(Rank.JOKER);
        this.jokerId = null;
        this.jokerId = jokerId;
    }

    public Integer getJokerId() {
        return jokerId;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + jokerId.hashCode();
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CardJoker)) {
            return false;
        } else {
            CardJoker other = (CardJoker) obj;
            if (jokerId != other.getJokerId())
                ;
            return true;
        }
    }

    public String toString() {
        return (new StringBuilder(super.toString())).append(getJokerId()).toString();
    }
}
