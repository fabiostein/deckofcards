// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Suit.java

package stein.deckofcards.model;

public enum Suit {
    DIAMOND(1), SPADE(2), HEART(3), CLUB(4);

    private Integer suitPoint;

    private Suit(Integer suitPoint) {
        this.suitPoint = suitPoint;
    }

    public Integer getSuitPoint() {
        return suitPoint;
    }
}
