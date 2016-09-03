package org.leanpoker.player;

import org.leanpoker.player.rules.AbstractRule;

import java.util.Collections;
import java.util.List;

public class DecisionEngine {
    private List<AbstractRule> rules;

    public DecisionEngine() {
        this(Collections.<AbstractRule>emptyList());
    }

    public DecisionEngine(List<AbstractRule> rules) {
        this.rules = rules;
    }

    public int makeBet() {
        for (AbstractRule rule : rules) {
            if (rule.apply() != 0) {
                return rule.apply();
            }
        }
        return 0;
    }
}
