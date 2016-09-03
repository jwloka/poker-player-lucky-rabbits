package org.leanpoker.player.rules;

import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;

import java.util.List;


/**
 * This rule will raise when our bot has two cards with the same rank
 *
 * @author Administrator
 */
public class PairRule extends AbstractRule {
    public PairRule(GameState state) {
        super(state);
    }

    @Override
    public int apply() {
        List<Card> cards = state.getOurPokerBot().getHole_cards();
        if (cards.size() == 2) {
            Card card1 = cards.get(0);
            Card card2 = cards.get(1);
            if (card1.getRank().equalsIgnoreCase(card2.getRank())) {
                return descision.getRaise();
            }
        }
        return descision.getFold();
    }
}
