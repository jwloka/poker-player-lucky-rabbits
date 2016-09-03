package org.leanpoker.player.rules;

import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairRule extends Rule {
    public PairRule(GameState state) {
        super(state);
    }

    @Override
    public int apply() {
        Map<String, Integer> rankMap = new HashMap<>();
        String curRank = null;
        for (Card cur : state.getOurPokerBot().getCards()) {
            curRank = cur.getRank();
            if (rankMap.containsKey(curRank)) {
                return descision.getRaise();
            }
        }
        return descision.getFold();
    }
}
