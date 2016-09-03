package org.leanpoker.player.rules;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MaxRule implements Rule {

    private final List<Rule> rules = new ArrayList<>();

    public MaxRule(Rule a, Rule b) {
        rules.add(a);
        rules.add(b);
    }


    @Override
    public int apply() {
        int max = Integer.MIN_VALUE;

        for (Rule rule : rules) {
            int act = rule.apply();
            max = Math.max(act, max);
        }

        return max;
    }
}
