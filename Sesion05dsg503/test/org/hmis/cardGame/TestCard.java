package org.hmis.cardGame;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestCard {

    @Test
    void testCardValueAsString() {
        Deck deck = new Deck();
        String[] valores = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        for (int i = 0; i < 13; i++) {
            Assert.assertEquals(deck.dealCard().getValueAsString(), valores[i]);
        }
    }

    @Test
    void testCardSuitAsString() {
        Deck deck = new Deck();
        String[] valores = { "♠", "♥", "♦", "♣" };
        for (int i = 0; i < 52; i++) {
            if (i < 13) {
                Assert.assertEquals(deck.dealCard().getSuitAsString(), valores[0]);
            } else if (i < 26) {
                Assert.assertEquals(deck.dealCard().getSuitAsString(), valores[1]);
            } else if (i < 39) {
                Assert.assertEquals(deck.dealCard().getSuitAsString(), valores[2]);
            } else {
                Assert.assertEquals(deck.dealCard().getSuitAsString(), valores[3]);
            }
        }
    }

    @Test
    void testCardSuit() {
        Deck deck = new Deck();
        int[] valores = { 0, 1, 2, 3 };
        for (int i = 0; i < 52; i++) {
            if (i < 13) {
                Assert.assertEquals(deck.dealCard().getSuit(), valores[0]);
            } else if (i < 26) {
                Assert.assertEquals(deck.dealCard().getSuit(), valores[1]);
            } else if (i < 39) {
                Assert.assertEquals(deck.dealCard().getSuit(), valores[2]);
            } else {
                Assert.assertEquals(deck.dealCard().getSuit(), valores[3]);
            }
        }
    }

    @Test
    void testWrongValues() {
        Card card = new Card(20, 30);
        Assert.assertEquals(card.getSuitAsString(), "¯\\_(ツ)_/¯");
        Assert.assertEquals(card.getValueAsString(), "¯\\_(ツ)_/¯");
    }

}
