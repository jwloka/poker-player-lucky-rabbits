package org.leanpoker.player.rules;

import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class MaxTenPercentWithTwoHeadsRule extends AbstractRule {

    private static final List<String> heads = Arrays.asList("J", "Q", "K", "A");


    public MaxTenPercentWithTwoHeadsRule(GameState state) {
        super(state);
    }

    @Override
    public int apply() {
        List<Card> cards = state.getOurPokerBot().getHole_cards();
        return useCards(cards);
    }

    int useCards(List<Card> cards) {
        for (Card card : cards) {
            if (! heads.contains(card.getRank())) {
                return 0;
            }
        }

        return (int) (state.getOurPokerBot().getStack() * 0.1);
    }
}
