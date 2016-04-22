package test.stein.deckofcards.model;

import org.junit.Assert;
import org.junit.Test;

import stein.deckofcards.model.CardJoker;
import stein.deckofcards.model.CardStandard;
import stein.deckofcards.model.Rank;
import stein.deckofcards.model.Suit;

public class CardTest {

    @Test
    public void testPositiveEqualsSameRankSuit() {

        Assert.assertTrue((new CardJoker(1).equals(new CardJoker(1))));

        Assert.assertTrue((new CardStandard(Rank.ACE, Suit.DIAMOND)).equals(new CardStandard(Rank.ACE, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.ACE, Suit.SPADE)).equals(new CardStandard(Rank.ACE, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.ACE, Suit.HEART)).equals(new CardStandard(Rank.ACE, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.ACE, Suit.CLUB)).equals(new CardStandard(Rank.ACE, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.TWO, Suit.DIAMOND)).equals(new CardStandard(Rank.TWO, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.TWO, Suit.SPADE)).equals(new CardStandard(Rank.TWO, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.TWO, Suit.HEART)).equals(new CardStandard(Rank.TWO, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.TWO, Suit.CLUB)).equals(new CardStandard(Rank.TWO, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.THREE, Suit.DIAMOND)).equals(new CardStandard(Rank.THREE, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.THREE, Suit.SPADE)).equals(new CardStandard(Rank.THREE, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.THREE, Suit.HEART)).equals(new CardStandard(Rank.THREE, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.THREE, Suit.CLUB)).equals(new CardStandard(Rank.THREE, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.FOUR, Suit.DIAMOND)).equals(new CardStandard(Rank.FOUR, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.FOUR, Suit.SPADE)).equals(new CardStandard(Rank.FOUR, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.FOUR, Suit.HEART)).equals(new CardStandard(Rank.FOUR, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.FOUR, Suit.CLUB)).equals(new CardStandard(Rank.FOUR, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.FIVE, Suit.DIAMOND)).equals(new CardStandard(Rank.FIVE, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.FIVE, Suit.SPADE)).equals(new CardStandard(Rank.FIVE, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.FIVE, Suit.HEART)).equals(new CardStandard(Rank.FIVE, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.FIVE, Suit.CLUB)).equals(new CardStandard(Rank.FIVE, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.SIX, Suit.DIAMOND)).equals(new CardStandard(Rank.SIX, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.SIX, Suit.SPADE)).equals(new CardStandard(Rank.SIX, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.SIX, Suit.HEART)).equals(new CardStandard(Rank.SIX, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.SIX, Suit.CLUB)).equals(new CardStandard(Rank.SIX, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.SEVEN, Suit.DIAMOND)).equals(new CardStandard(Rank.SEVEN, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.SEVEN, Suit.SPADE)).equals(new CardStandard(Rank.SEVEN, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.SEVEN, Suit.HEART)).equals(new CardStandard(Rank.SEVEN, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.SEVEN, Suit.CLUB)).equals(new CardStandard(Rank.SEVEN, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.EIGHT, Suit.DIAMOND)).equals(new CardStandard(Rank.EIGHT, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.EIGHT, Suit.SPADE)).equals(new CardStandard(Rank.EIGHT, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.EIGHT, Suit.HEART)).equals(new CardStandard(Rank.EIGHT, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.EIGHT, Suit.CLUB)).equals(new CardStandard(Rank.EIGHT, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.NINE, Suit.DIAMOND)).equals(new CardStandard(Rank.NINE, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.NINE, Suit.SPADE)).equals(new CardStandard(Rank.NINE, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.NINE, Suit.HEART)).equals(new CardStandard(Rank.NINE, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.NINE, Suit.CLUB)).equals(new CardStandard(Rank.NINE, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.TEN, Suit.DIAMOND)).equals(new CardStandard(Rank.TEN, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.TEN, Suit.SPADE)).equals(new CardStandard(Rank.TEN, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.TEN, Suit.HEART)).equals(new CardStandard(Rank.TEN, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.TEN, Suit.CLUB)).equals(new CardStandard(Rank.TEN, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.JACK, Suit.DIAMOND)).equals(new CardStandard(Rank.JACK, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.JACK, Suit.SPADE)).equals(new CardStandard(Rank.JACK, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.JACK, Suit.HEART)).equals(new CardStandard(Rank.JACK, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.JACK, Suit.CLUB)).equals(new CardStandard(Rank.JACK, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.QUEEN, Suit.DIAMOND)).equals(new CardStandard(Rank.QUEEN, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.QUEEN, Suit.SPADE)).equals(new CardStandard(Rank.QUEEN, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.QUEEN, Suit.HEART)).equals(new CardStandard(Rank.QUEEN, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.QUEEN, Suit.CLUB)).equals(new CardStandard(Rank.QUEEN, Suit.CLUB)));

        Assert.assertTrue((new CardStandard(Rank.KING, Suit.DIAMOND)).equals(new CardStandard(Rank.KING, Suit.DIAMOND)));
        Assert.assertTrue((new CardStandard(Rank.KING, Suit.SPADE)).equals(new CardStandard(Rank.KING, Suit.SPADE)));
        Assert.assertTrue((new CardStandard(Rank.KING, Suit.HEART)).equals(new CardStandard(Rank.KING, Suit.HEART)));
        Assert.assertTrue((new CardStandard(Rank.KING, Suit.CLUB)).equals(new CardStandard(Rank.KING, Suit.CLUB)));
    }

    @Test
    public void testNegativeEqualsSameSuit() {

        Assert.assertFalse((new CardStandard(Rank.ACE, Suit.DIAMOND)).equals(new CardStandard(Rank.ACE, Suit.SPADE)));
        Assert.assertFalse((new CardStandard(Rank.ACE, Suit.SPADE)).equals(new CardStandard(Rank.ACE, Suit.DIAMOND)));
        Assert.assertFalse((new CardStandard(Rank.ACE, Suit.HEART)).equals(new CardStandard(Rank.ACE, Suit.CLUB)));
        Assert.assertFalse((new CardStandard(Rank.ACE, Suit.CLUB)).equals(new CardStandard(Rank.ACE, Suit.HEART)));
    }

    @Test
    public void testNegativeEqualsSameRank() {

        Assert.assertFalse((new CardJoker(1)).equals(new CardJoker(2)));

        Assert.assertFalse((new CardStandard(Rank.THREE, Suit.DIAMOND)).equals(new CardStandard(Rank.TEN, Suit.DIAMOND)));
        Assert.assertFalse((new CardStandard(Rank.KING, Suit.SPADE)).equals(new CardStandard(Rank.FIVE, Suit.SPADE)));
        Assert.assertFalse((new CardStandard(Rank.JACK, Suit.HEART)).equals(new CardStandard(Rank.EIGHT, Suit.HEART)));
        Assert.assertFalse((new CardStandard(Rank.FOUR, Suit.CLUB)).equals(new CardStandard(Rank.QUEEN, Suit.CLUB)));
    }

}
