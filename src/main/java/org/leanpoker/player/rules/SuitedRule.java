package org.leanpoker.player.rules;

import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;

import java.util.List;

/**
 * This rule will check / follow the current bet when having the same color
 * and the cards follow each other.
 * For example: 5 hearts & 6 hearts
 *
 * @author Administrator
 */
public class SuitedRule extends AbstractRule {

    public SuitedRule(GameState state) {
        super(state);
    }

    @Override
    public int apply() {
        List<Card> cards = state.getOurPokerBot().getHole_cards();
        if (cards.size() == 2) {
            Card card1 = cards.get(0);
            Card card2 = cards.get(1);

            if (followEachOtherUp(card1, card2) && suited(card1, card2)) {
                return descision.getRaise();
            }
        }
        return descision.getFold();
    }

    private boolean followEachOtherUp(Card card1, Card card2) {
        int rank1 = RANK_TO_NUMBER.get(card1.getRank());
        int rank2 = RANK_TO_NUMBER.get(card2.getRank());
        return Math.abs(rank1 - rank2) == 1;
    }

    private boolean suited(Card card1, Card card2) {
        return card1.getSuit().equalsIgnoreCase(card2.getSuit());
    }
}
