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
        List<Card> cards = state.getOurPokerBot().getCards();
        if(cards.size() == 2){
            Card card1 = cards.get(0);
            Card card2 = cards.get(1);
            if(card1.getRank().equalsIgnoreCase(card2.getRank())){
                return descision.getRaise();
            }
        }
        return descision.getFold();
    }
}
