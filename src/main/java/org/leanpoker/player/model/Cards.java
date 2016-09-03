package org.leanpoker.player.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 */
public class Cards {

    private final List<Card> cards;

    private Map<String, Integer> ranks = new HashMap<>();

    public Cards(List<Card> cards) {
        this.cards = cards;
        fillRanks();
    }

    private void fillRanks(){
        for (Card card : cards) {
            if (ranks.containsKey(card.getRank())) {
                ranks.put(card.getRank(), ranks.get(card.getRank()) + 1);
            }
            else {
                ranks.put(card.getRank(), 1);
            }
        }
    }

    public boolean hasPair() {
        Integer biggest = 0;

        Collection<Integer> values = ranks.values();

        for (Integer value : values) {
            if (biggest < value) {
                biggest = value;
            }
        }

        return biggest >= 2;
    }

    public boolean hasSameColor() {
        if(cards.size() == 2){
            Card card1 = cards.get(0);
            Card card2 = cards.get(1);
            if(card1.getSuit().equalsIgnoreCase(card2.getSuit())){
                return true;
            }
        }
        return false;

    }
}
