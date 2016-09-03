package org.leanpoker.player;

import com.google.gson.JsonElement;
import org.leanpoker.player.data.Parser;
import org.leanpoker.player.model.GameState;
import org.leanpoker.player.rules.HighBlindsRule;
import org.leanpoker.player.rules.MaxRule;
import org.leanpoker.player.rules.MaxTenPercentWithTwoHeadsRule;
import org.leanpoker.player.rules.MinRaiseRule;
import org.leanpoker.player.rules.MinRule;
import org.leanpoker.player.rules.Rule;
import org.leanpoker.player.rules.StableRule;

import java.util.Date;
import java.util.List;
import org.leanpoker.player.model.Card;

public class Player {

    static final String VERSION = new Date().getHours() + "." + new Date().getMinutes();

    public static int betRequest(String request) {
        Parser parser = new Parser();
        GameState state = parser.parse(request);

        printHand(state);
        
        Rule result;
        if ((state.getOurPokerBot().getStack() + state.getBet_index()) / state.getSmall_blind() <= 10) {
            result = new HighBlindsRule(state);
        } else {
            result = new MaxRule(
                new StableRule(state),
                new MinRule(
                    new MinRaiseRule(state),
                    new MaxTenPercentWithTwoHeadsRule(state))
            );
        }
        return  result.apply();
    }

    public static void showdown(JsonElement game) {
    }

    private static void printHand(GameState state) {
        List<Card> cards = state.getOurPokerBot().getHole_cards();
        if (cards.size() == 2) {
            Card card1 = cards.get(0);
            Card card2 = cards.get(1);
            System.out.println(card1.toString() + ", " + card2.toString());
        }
    }
}
