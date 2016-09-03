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
    private int current_buy_in;
    private int minimum_raise;

    public GameStateBuilder withOurCards(List<Card> ourCards) {
        this.ourCards = ourCards;
        return this;
    }

    public GameState build() {
        GameState result = new GameState();

        result.setPlayers(players());
        result.setCurrent_buy_in(this.current_buy_in);
        result.setMinimum_raise(this.minimum_raise);

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

    public GameStateBuilder withCurrent_buy_in(int current_buy_in) {
        this.current_buy_in = current_buy_in;
        return this;
    }

    public GameStateBuilder withMinimum_raise(int minimum_raise) {
        this.minimum_raise = minimum_raise;
        return this;
    }
}
