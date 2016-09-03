package org.leanpoker.player.rules;

import org.leanpoker.player.model.GameState;

public abstract class Rule {
    protected final Decision descision;
    protected GameState state;

    public Rule(GameState state) {
        this.state = state;
        this.descision = new Decision(state);
    }

    public Decision getDescision() {
        return descision;
    }

    public GameState getState() {
        return state;
    }

    public abstract int apply();
}
