package org.hmis.cardGame;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestDeck {

    @Test
    void testShuffle() {
        Deck deck = new Deck();
        deck.shuffle();
        Assert.assertNotEquals(deck.toString().trim(),
                "A♠ 2♠  3♠  4♠  5♠  6♠  7♠  8♠  9♠  10♠ J♠  Q♠  K♠\n"
                        + "A♥   2♥  3♥  4♥  5♥  6♥  7♥  8♥  9♥  10♥ J♥  Q♥  K♥\n"
                        + "A♦   2♦  3♦  4♦  5♦  6♦  7♦  8♦  9♦  10♦ J♦  Q♦  K♦\n"
                        + "A♣   2♣  3♣  4♣  5♣  6♣  7♣  8♣  9♣  10♣ J♣  Q♣  K♣");
    }

    @Test
    void testCardsLeft() {
        Deck deck = new Deck();
        for (int i = 0; i < 51; i++) {
            deck.dealCard();
        }
        Assert.assertEquals(deck.cardsLeft(), 1);
    }

    @Test
    void testNoCardsLeft() {
        Deck deck = new Deck();
        for (int i = 0; i < 53; i++) {
            deck.dealCard();
        }
        Assert.assertEquals(deck.cardsLeft(), 51);
    }

}
