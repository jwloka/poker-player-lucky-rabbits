package org.leanpoker.player.rules;

import org.leanpoker.player.Raises;
import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.Cards;
import org.leanpoker.player.model.GameState;

import java.util.List;

/**
 *
 */
public class StableRule extends AbstractRule {

    public StableRule(GameState state) {
        super(state);
    }

    @Override
    public int apply() {
        int result;
        
        List<Card> cards = state.getOurPokerBot().getHole_cards();

        Cards ourCards = new Cards(cards);

        Integer factor = ourCards.makeRaiseFactor();
        if (factor > 0) {
            result = new Raises().raise(state, factor);
        } else {
            result = 0;
        }
        
        System.out.println("StableRule returns: " + result);
        return result;
    }
}
