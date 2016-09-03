/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.leanpoker.player.rules;

import org.leanpoker.player.model.GameState;

/**
 * @author Administrator
 */
public class BartsRuleFactory {

    /**
     * This method is supposed to choose the more daring highblindsrule
     * when the blinds are very high compared to our money
     *
     * @param state
     * @return
     */
    public Rule conservativeOrDaring(GameState state) {
        Rule result;
        if ((state.getOurPokerBot().getStack() + state.getBet_index()) / state.getSmall_blind() <= 10) {
            result = new HighBlindsRule(state);
        } else {
            result = new StableRule(state);
        }
        return result;
    }
}
