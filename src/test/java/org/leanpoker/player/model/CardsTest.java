package org.leanpoker.player.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by titko on 9/3/2016.
 */
public class CardsTest {

    @Test
    public void twoDiffCardsHasPairFalse() {
        List<Card>  elements = Arrays.asList(new Card("7", "spade"), new Card("6", "spade"));
        Cards cards = new Cards(elements);
        assertFalse(cards.hasPair());
    }

    @Test
    public void twoPairAndHasPairTrue() {
        List<Card>  elements = Arrays.asList(new Card("7", "spade"), new Card("7", "hearts"));
        Cards cards = new Cards(elements);
        assertTrue(cards.hasPair());
    }

    @Test
    public void threePairAndHasPairTrue() {
        List<Card>  elements = Arrays.asList(new Card("6", "spade"), new Card("7", "spade"), new Card("7", "hearts"));
        Cards cards = new Cards(elements);
        assertTrue(cards.hasPair());
    }

}