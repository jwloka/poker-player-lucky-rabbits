package org.leanpoker.player;

import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;
import org.leanpoker.player.model.PokerBot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class GameStateBuilder {

    private List<Card> ourCards;
    private int ourStack;

    public GameStateBuilder withOurCards(List<Card> ourCards) {
        this.ourCards = ourCards;
        return this;
    }

    public GameState build() {
        GameState result = new GameState();

        result.setPlayers(players());

        return result;
    }

    private List<PokerBot> players() {
        List<PokerBot> result = new ArrayList<>();

        result.add(ownPlayer());

        return result;
    }

    private PokerBot ownPlayer() {
        PokerBot own = new PokerBot();
        own.setHole_cards(this.ourCards);
        own.setStack(this.ourStack);
        return own;
    }

    public GameStateBuilder withOurStack(int stack) {
        this.ourStack = stack;
        return this;
    }
}
