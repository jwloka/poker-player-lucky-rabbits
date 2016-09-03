package org.leanpoker.player.rules;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.leanpoker.player.a;
import org.leanpoker.player.model.GameState;

/**
 * Created by ollin on 03.09.16.
 */
public class MinRaiseRuleTest {

    @Test
    public void get100() throws Exception {
        GameState state = a.gameState()
            .withCurrent_buy_in(320)
            .withMinimum_raise(240)
            .build();
        // given
        MinRaiseRule cut = new MinRaiseRule(state);
        // when
        int result = cut.apply();
        // then
        assertThat(result, is(560));
    }

}
