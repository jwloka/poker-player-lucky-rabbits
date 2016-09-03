package org.leanpoker.player.rules;

import java.util.HashMap;
import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;

import java.util.Map;

/**
 * This rule will raise when our bot has two cards with the same rank
 * 
 * @author Administrator
 */
public class PairRule extends Rule {
    public PairRule(GameState state) {
        super(state);
    }

    @Override
    public int apply() {
        Map<String, Integer> rankMap = new HashMap<>();
        String curRank = null;
        for (Card cur : state.getOurPokerBot().getHole_cards()) {
            curRank = cur.getRank();
            if (rankMap.containsKey(curRank)) {
                return descision.getRaise();
            }
        }
        return descision.getFold();
    }
}
