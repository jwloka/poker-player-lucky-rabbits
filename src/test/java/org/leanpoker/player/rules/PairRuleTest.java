package org.leanpoker.player.rules;

import org.junit.Test;
import org.leanpoker.player.DecisionEngine;
import org.leanpoker.player.model.Card;
import org.leanpoker.player.model.GameState;
import org.leanpoker.player.model.PokerBot;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PairRuleTest {
    @Test
    public void applyWithEmptyListReturnsFalse() throws Exception {
        List<Card> target = Arrays.asList();

        assertFalse(new PairRule(new GameState().setOurPokerBot(new PokerBot().setHole_cards(target))).apply() != 0);
    }

//    @Test
//    public void applyWithDoubleHandReturnsTrue() throws Exception {
//        List<Card> target = Arrays.asList(new Card("6", "hearts"), new Card("6", "clubs"));
//
//        assertTrue(new DecisionEngine().makeBet(target));
//    }
//
//    @Test
//    public void applyWithoutDoubleHandReturnsFalse() throws Exception {
//        List<Card> target = Arrays.asList(new Card("5", "hearts"), new Card("6", "clubs"));
//
//        assertFalse(new DecisionEngine().makeBet(target));
//    }
//
//
//    @Test
//    public void applyWithDoubleHandThreeCardReturnsTrue() throws Exception {
//        List<Card> target = Arrays.asList(new Card("6", "hearts"), new Card("6", "clubs"), new Card("5", "Spades"));
//
//        assertTrue(new DecisionEngine().makeBet(target));
//    }
//
//    @Test
//    public void applyWithDoubleHandThreeCardReturnsTrue2() throws Exception {
//        List<Card> target = Arrays.asList(new Card("6", "hearts"), new Card("3", "clubs"), new Card("6", "Spades"));
//
//        assertTrue(new DecisionEngine().makeBet(target));
//    }
//
//    @Test
//    public void applyWithoutDoubleHandThreeCardReturnsFalse() throws Exception {
//        List<Card> target = Arrays.asList(new Card("9", "hearts"), new Card("3", "clubs"), new Card("6", "Spades"));
//
//        assertFalse(new DecisionEngine().makeBet(target));
//    }
//
//    @Test
//    public void applyWithTripleHandThreeCardReturnsTrue() throws Exception {
//        List<Card> target = Arrays.asList(new Card("9", "hearts"), new Card("9", "clubs"), new Card("9", "Spades"));
//
//        assertTrue(new DecisionEngine().makeBet(target));
//    }

}
