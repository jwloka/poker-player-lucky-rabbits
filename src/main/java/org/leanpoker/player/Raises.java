package org.leanpoker.player;

import org.leanpoker.player.model.GameState;

/**
 *
 */
public class Raises {

    public int minimumRaise(GameState state) {
        return state.getMinimum_raise() + state.getCurrent_buy_in();
    }

    public int check(GameState state) {
        return state.getCurrent_buy_in();
    }
}
