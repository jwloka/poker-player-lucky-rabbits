package org.leanpoker.player.rules;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MinRule implements Rule {

    private final List<Rule> rules = new ArrayList<>();

    public MinRule(Rule a, Rule b) {
        rules.add(a);
        rules.add(b);
    }


    @Override
    public int apply() {
        int min = Integer.MAX_VALUE;

        for (Rule rule : rules) {
            int act = rule.apply();
            min = Math.min(act, min);
        }

        return min;
    }
}
