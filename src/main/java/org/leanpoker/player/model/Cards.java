package org.leanpoker.player.model;

import java.util.List;

/**
 *
 */
public class Cards {

    private final List<Card> cards;

    public Cards(List<Card> cards) {
        this.cards = cards;
    }

    public boolean hasPair() {
        if(cards.size() == 2){
            Card card1 = cards.get(0);
            Card card2 = cards.get(1);
            if(card1.getRank().equalsIgnoreCase(card2.getRank())){
                return true;
            }
        }
        return false;
    }
}
