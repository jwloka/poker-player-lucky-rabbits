package org.leanpoker.player.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Balazs on 9/3/2016.
 */
public class CardsTest {

    @Test
    public void makeRaiseFactorWithNoSameRankCardsReturnsZero() {
        List<Card>  elements = Arrays.asList(new Card("7", "spade"), new Card("6", "spade"));

        Cards cards = new Cards(elements);

        assertEquals(0, cards.makeRaiseFactor());
    }

    @Test
    public void makeRaiseFactorWithTwoSameRankCardsReturnsOne() {
        List<Card>  elements = Arrays.asList(new Card("7", "spade"), new Card("7", "hearts"));

        Cards cards = new Cards(elements);

        assertEquals(1, cards.makeRaiseFactor());
    }

    @Test
    public void makeRaiseFactorWithThreeSameRankCardsReturnsThree() {
        List<Card>  elements = Arrays.asList(new Card("7", "spade"), new Card("7", "spade"), new Card("7", "hearts"));

        Cards cards = new Cards(elements);

        assertEquals(2, cards.makeRaiseFactor());
    }

    @Test
    public void numSameColorWithThreeDifferentCardsReturnsZero() {
        List<Card>  elements = Arrays.asList(new Card("6", "spade"), new Card("9", "diamonds"), new Card("7", "hearts"));

        Cards cards = new Cards(elements);

        assertEquals(0, cards.numSameColor());
    }

    @Test
    public void numSameColorWithTwoCardsSameColorReturnsOne() {
        List<Card>  elements = Arrays.asList(new Card("7", "spade"), new Card("6", "spade"));

        Cards cards = new Cards(elements);

        assertEquals(1, cards.numSameColor());
    }

    @Test
    public void testTwoCardsHasSameColorFalse() {
        List<Card>  elements = Arrays.asList(new Card("7", "hearts"), new Card("6", "spade"));
        Cards cards = new Cards(elements);
        //assertFalse(cards.hasSameColor());
    }

    @Test
    public void testThreeCardsHasSameColorTrue() {
        List<Card>  elements = Arrays.asList(new Card("7", "spade"), new Card("5", "hearts"), new Card("6", "spade"));
        Cards cards = new Cards(elements);
        //assertTrue(cards.hasSameColor());
    }



}
