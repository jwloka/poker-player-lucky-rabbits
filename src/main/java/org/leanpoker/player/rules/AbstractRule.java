package org.leanpoker.player.rules;

import org.leanpoker.player.model.GameState;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractRule implements Rule {
    public static final Map<String, Integer> RANK_TO_NUMBER = new HashMap<>();
    static {
        RANK_TO_NUMBER.put("2", 2);
        RANK_TO_NUMBER.put("3", 3);
        RANK_TO_NUMBER.put("4", 4);
        RANK_TO_NUMBER.put("5", 5);
        RANK_TO_NUMBER.put("6", 6);
        RANK_TO_NUMBER.put("7", 7);
        RANK_TO_NUMBER.put("8", 8);
        RANK_TO_NUMBER.put("9", 9);
        RANK_TO_NUMBER.put("10", 10);
        RANK_TO_NUMBER.put("J", 11);
        RANK_TO_NUMBER.put("Q", 12);
        RANK_TO_NUMBER.put("K", 13);
        RANK_TO_NUMBER.put("A", 14);
    }
    
    protected final Decision descision;
    protected GameState state;

    public AbstractRule(GameState state) {
        this.state = state;
        this.descision = new Decision(state);
    }

    public Decision getDescision() {
        return descision;
    }

    public GameState getState() {
        return state;
    }

}
