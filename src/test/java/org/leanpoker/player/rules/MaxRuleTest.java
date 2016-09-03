package org.leanpoker.player.rules;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

/**
 * Created by ollin on 03.09.16.
 */
public class MaxRuleTest {

    @Test
    public void return0() throws Exception {
        // given
        Rule a = new FixValueRule(0);
        Rule b = new FixValueRule(100);

        MaxRule cut = new MaxRule(a, b);
        // when
        int result = cut.apply();
        // then
        assertThat(result, CoreMatchers.is(100));
    }



}
