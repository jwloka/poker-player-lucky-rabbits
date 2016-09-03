package org.leanpoker.player;

import com.google.gson.JsonElement;
import org.leanpoker.player.data.Parser;
import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;
import org.leanpoker.player.rules.PairRule;
import org.leanpoker.player.rules.Rule;

import java.util.Arrays;
import java.util.List;

public class Player {

    static final String VERSION = "0.0.2";

    public static int betRequest(String request) {
        Parser parser = new Parser();
        GameState state = parser.parse(request);
        return new DecisionEngine(Arrays.<Rule>asList(new PairRule(state))).makeBet();
    }

    public static void showdown(JsonElement game) {
    }
}
