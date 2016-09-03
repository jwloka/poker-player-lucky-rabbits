package org.leanpoker.player.rules;

import org.leanpoker.player.model.GameState;

/**
 *
 */
public class MinRaiseRule implements Rule {

    private final GameState gameState;

    public MinRaiseRule(GameState gameState) {
        this.gameState = gameState;
    }

    @Override
    public int apply() {
        return gameState.getCurrent_buy_in() + gameState.getMinimum_raise();
    }
}
