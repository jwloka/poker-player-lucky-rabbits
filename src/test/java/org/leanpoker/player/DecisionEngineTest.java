package org.leanpoker.player;

import org.junit.Test;
import org.leanpoker.player.model.Card;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DecisionEngineTest {
    @Test
    public void makeBetWithEmptyListReturnsFalse() throws Exception {
        List<Card> target = Arrays.asList();

        assertFalse(new DecisionEngine().makeBet(target));
    }
}