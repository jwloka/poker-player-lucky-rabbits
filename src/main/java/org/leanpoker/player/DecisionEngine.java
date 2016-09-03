package org.leanpoker.player;

import org.leanpoker.player.model.Card;

import java.util.List;

public class DecisionEngine {
    public boolean makeBet(List<Card> cards) {
        String curRank = null;
        for (Card cur : cards) {
            if (curRank != null && curRank.equals(cur.getRank())) {
                return true;
            }
            curRank = cur.getRank();
        }
        return false;
    }
}
