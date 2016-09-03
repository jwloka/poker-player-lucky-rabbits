package org.leanpoker.player.rules;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.leanpoker.player.a;
import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;

import java.util.Arrays;

/**
 * Created by ollin on 03.09.16.
 */
public class MaxTenPercentWithTwoHeadsRuleTest {

    @Test
    public void oneOfficerInDeck() throws Exception {
        // given
        GameState stack = a.gameState()
            .withOurCards(Arrays.asList(new Card("K", "spade"), new Card("10", "spade")))
            .withOurStack(1590)
            .build();

        MaxTenPercentWithTwoHeadsRule cut = new MaxTenPercentWithTwoHeadsRule(stack);

        // when
        int result = cut.apply();
        // then
        assertThat(result, is(0));
    }

    @Test
    public void noOfficerInDeck() throws Exception {
        // given
        GameState stack = a.gameState()
            .withOurCards(Arrays.asList(new Card("7", "spade"), new Card("9", "spade")))
            .withOurStack(1590)
            .build();

        MaxTenPercentWithTwoHeadsRule cut = new MaxTenPercentWithTwoHeadsRule(stack);

        // when
        int result = cut.apply();
        // then
        assertThat(result, is(0));
    }

    @Test
    public void twoOfficerInDeck() throws Exception {
        // given
        GameState stack = a.gameState()
            .withOurCards(Arrays.asList(new Card("K", "spade"), new Card("J", "spade")))
            .withOurStack(1590)
            .build();

        MaxTenPercentWithTwoHeadsRule cut = new MaxTenPercentWithTwoHeadsRule(stack);

        // when
        int result = cut.apply();
        // then
        assertThat(result, is(159));
    }

    @Test
    public void twoOfficerInDeckWithRounding() throws Exception {
        // given
        GameState stack = a.gameState()
            .withOurCards(Arrays.asList(new Card("K", "spade"), new Card("J", "spade")))
            .withOurStack(1591)
            .build();

        MaxTenPercentWithTwoHeadsRule cut = new MaxTenPercentWithTwoHeadsRule(stack);

        // when
        int result = cut.apply();
        // then
        assertThat(result, is(159));
    }



}
