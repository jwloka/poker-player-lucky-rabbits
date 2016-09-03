package org.leanpoker.player;

import com.google.gson.JsonElement;
import org.leanpoker.player.data.Parser;
import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.Cards;
import org.leanpoker.player.model.GameState;
import org.leanpoker.player.model.PokerBot;
import org.leanpoker.player.rules.PairRule;
import org.leanpoker.player.rules.Rule;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

    static final String VERSION = new Date().getHours() + "." + new Date().getMinutes();

    public static int betRequest(String request) {
        Parser parser = new Parser();
        GameState state = parser.parse(request);

        List<Card> cards = state.getOurPokerBot().getHole_cards();

        Cards ourCards = new Cards(cards);


        if (ourCards.hasPair()) {
            return new Raises().minimumRaise(state);
        }
        else if (ourCards.hasSameColor()) {
            return new Raises().check(state);
        }
        else {
            return 0;
        }
    }

    public static void showdown(JsonElement game) {
    }
}
