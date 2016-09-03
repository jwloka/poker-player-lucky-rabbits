package org.leanpoker.player;

import com.google.gson.JsonElement;
import org.leanpoker.player.data.Parser;
import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;

import java.util.List;

public class Player {

    static final String VERSION = "0.0.1";

    public static int betRequest(String request) {
        Parser parser = new Parser();
        GameState state = parser.parse(request);
        List<Card> cards = state.getOurPokerBot().getCards();
        int bet = state.getCurrentBuyIn() + state.getMinimumRaise();

        if (new DecisionEngine().makeBet(cards)) {
            return bet;
        }
        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
