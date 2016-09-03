package org.leanpoker.player.rules;

import org.leanpoker.player.model.GameState;

public class Decision {
    private final int fold;
    private final int check;
    private final int raise;

    public Decision(GameState state) {
        int current = state.getCurrent_buy_in();
        int raise = state.getMinimum_raise();
        this.fold = 0;
        this.check = current;
        this.raise = current + raise;
    }

    public int getCheck() {
        return check;
    }

    public int getFold() {
        return fold;
    }

    public int getRaise() {
        return raise;
    }
}
