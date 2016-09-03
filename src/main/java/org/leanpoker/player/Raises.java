package org.leanpoker.player;

import org.leanpoker.player.model.GameState;

/**
 *
 */
public class Raises {

    public int raise(GameState state, int factor) {
        return (state.getMinimum_raise() * factor) + state.getCurrent_buy_in();
    }

    public int check(GameState state) {
        return state.getCurrent_buy_in();
    }
}
