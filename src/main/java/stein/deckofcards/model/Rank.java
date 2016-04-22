package stein.deckofcards.model;

public enum Rank {
    ACE("A", 1), TWO(2), TREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN("T", 10), JACK("J", 11), QUEEN("Q", 12), KING("K", 13), JOKER("JOKER",14);

    private Integer rankPoint;
    private String rankSimbol;

    private Rank(Integer rankPoint) {
        this.rankPoint = rankPoint;
    }

    private Rank(String rankSimbol, Integer rankPoint) {
        this.rankSimbol = rankSimbol;
        this.rankPoint = rankPoint;
    }

    public Integer getRankPoint() {
        return rankPoint;
    }

    public String getRankSimbol() {
        return rankSimbol;
    }
}
