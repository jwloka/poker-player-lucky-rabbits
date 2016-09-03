package org.leanpoker.player;

import com.google.gson.JsonElement;
import org.leanpoker.player.data.Parser;
import org.leanpoker.player.model.Card;
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

        PokerBot ourPokerBot = state.getOurPokerBot();

        List<Card> hole_cards = ourPokerBot.getHole_cards();

        List<Card> cards = state.getOurPokerBot().getHole_cards();

        if(cards.size() == 2){
            Card card1 = cards.get(0);
            Card card2 = cards.get(1);
            if(card1.getRank().equalsIgnoreCase(card2.getRank())){
                return state.getCurrent_buy_in() + state.getMinimum_raise();
            }
        }

        return state.getCurrent_buy_in();
    }

    public static void showdown(JsonElement game) {
    }
}
