package org.leanpoker.player;

import com.google.gson.JsonElement;
import org.leanpoker.player.data.Parser;
import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.Cards;
import org.leanpoker.player.model.GameState;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Player {

    static final String VERSION = new Date().getHours() + "." + new Date().getMinutes();

    public static int betRequest(String request) {
        Parser parser = new Parser();
        GameState state = parser.parse(request);

        List<Card> cards = state.getOurPokerBot().getHole_cards();
        List<Card> comCards = state.getCommunity_cards();

        List<Card> both = new ArrayList<>();
        both.addAll(cards);
        both.addAll(comCards);

        Cards bothCards = new Cards(both);
        Cards ourCards = new Cards(cards);

        Integer factor = ourCards.makeRaiseFactor();
        if (factor > 0) {
            return new Raises().raise(state, factor);
        } else {
            return 0;
        }
    }

    public static void showdown(JsonElement game) {
    }
}
