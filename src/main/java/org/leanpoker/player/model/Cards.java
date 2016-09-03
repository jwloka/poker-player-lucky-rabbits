package org.leanpoker.player.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Cards {

    private final List<Card> cards;

    private Map<String, Integer> ranks = new HashMap<>();
    private Map<String, Integer> colors = new HashMap<>();

    public Cards(List<Card> cards) {
        this.cards = cards;
        fillRanks();
        fillColors();
    }

    private void fillRanks() {
        for (Card card : cards) {
            if (ranks.containsKey(card.getRank())) {
                ranks.put(card.getRank(), ranks.get(card.getRank()) + 1);
            } else {
                ranks.put(card.getRank(), 1);
            }
        }
    }

    private void fillColors() {
        for (Card card : cards) {
            if (colors.containsKey(card.getSuit())) {
                colors.put(card.getSuit(), colors.get(card.getSuit()) + 1);
            } else {
                colors.put(card.getSuit(), 1);
            }
        }
    }

    public int makeRaiseFactor() {
        Integer biggest = 0;

        for (Integer value : ranks.values()) {
            if (biggest < value) {
                biggest = value;
            }
        }

        return biggest > 0 ? --biggest : 0;
    }

    public boolean hasSameColor() {
        if (cards.size() == 2) {
            Card card1 = cards.get(0);
            Card card2 = cards.get(1);
            if (card1.getSuit().equalsIgnoreCase(card2.getSuit())) {
                return true;
            }
        }
        return false;

    }

    public int numSameColor() {
        Integer biggest = 0;

        for (Integer value : colors.values()) {
            if (biggest < value) {
                biggest = value;
            }
        }

        return biggest > 0 ? --biggest : 0;
    }
}
