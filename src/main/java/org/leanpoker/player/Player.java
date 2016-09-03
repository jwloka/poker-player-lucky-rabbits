package org.leanpoker.player;

import com.google.gson.JsonElement;
import org.leanpoker.player.data.Parser;
import org.leanpoker.player.model.GameState;
import org.leanpoker.player.rules.HighBlindsRule;
import org.leanpoker.player.rules.Rule;
import org.leanpoker.player.rules.StableRule;

import java.util.Date;

public class Player {

    static final String VERSION = new Date().getHours() + "." + new Date().getMinutes();

    public static int betRequest(String request) {
        Parser parser = new Parser();
        GameState state = parser.parse(request);


        Rule result;
        if ((state.getOurPokerBot().getStack() + state.getBet_index()) / state.getSmall_blind() <= 10) {
            result = new HighBlindsRule(state);
        } else {
            result = new StableRule(state);
        }
        return  result.apply();
    }

    public static void showdown(JsonElement game) {
    }
}
