package org.leanpoker.player;

import com.google.gson.JsonElement;
import org.leanpoker.player.data.Parser;
import org.leanpoker.player.model.GameState;
import org.leanpoker.player.rules.BartsRuleFactory;
import org.leanpoker.player.rules.Rule;
import org.leanpoker.player.rules.StableRule;

import java.util.Date;

public class Player {

    static final String VERSION = new Date().getHours() + "." + new Date().getMinutes();

    public static int betRequest(String request) {
        Parser parser = new Parser();
        GameState state = parser.parse(request);


        Rule activeRule = new BartsRuleFactory().conservativeOrDaring(state);

        return  activeRule.apply();
    }

    public static void showdown(JsonElement game) {
    }
}
