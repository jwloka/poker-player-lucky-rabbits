package org.leanpoker.player;

import org.leanpoker.player.rules.Rule;

import java.util.Collections;
import java.util.List;

public class DecisionEngine {
    private List<Rule> rules;

    public DecisionEngine() {
        this(Collections.<Rule>emptyList());
    }

    public DecisionEngine(List<Rule> rules) {
        this.rules = rules;
    }

    public int makeBet() {
        for (Rule rule : rules) {
            if (rule.apply() != 0) {
                return rule.apply();
            }
        }
        return 0;
    }
}
