package org.leanpoker.player.rules;

import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;

import java.util.Arrays;
import java.util.List;


/**
 * This rule will make sure to play with any picture card in
 * case the blinds are really high.
 *
 * @author Administrator
 */
public class HighBlindsRule extends AbstractRule {

    private static final List<String> PICTURE_CARDS = Arrays.asList("J", "Q", "K", "A");

    public HighBlindsRule(GameState state) {
        super(state);
    }

    @Override
    public int apply() {
        List<Card> cards = state.getOurPokerBot().getHole_cards();
        if (cards.size() == 2) {
            Card card1 = cards.get(0);
            Card card2 = cards.get(1);
            if (PICTURE_CARDS.contains(card1.getRank()) || PICTURE_CARDS.contains(card2.getRank())) {
                return descision.getCheck();
            }
        }
        return descision.getFold();
    }
}
