package org.leanpoker.player;

import org.junit.Test;
import org.leanpoker.player.model.Card;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DecisionEngineTest {
    @Test
    public void makeBetWithEmptyListReturnsFalse() throws Exception {
        List<Card> target = Arrays.asList();

        assertFalse(new DecisionEngine().makeBet(target));
    }

    @Test
    public void makeBetWithDoubleHandReturnsTrue() throws Exception {
        List<Card> target = Arrays.asList(new Card("6", "hearts"), new Card("6", "clubs"));

        assertTrue(new DecisionEngine().makeBet(target));
    }
    
    @Test
    public void makeBetWithoutDoubleHandReturnsFalse() throws Exception {
        List<Card> target = Arrays.asList(new Card("5", "hearts"), new Card("6", "clubs"));

        assertFalse(new DecisionEngine().makeBet(target));
    }
    

    @Test
    public void makeBetWithDoubleHandThreeCardReturnsTrue() throws Exception {
        List<Card> target = Arrays.asList(new Card("6", "hearts"), new Card("6", "clubs"), new Card("5", "Spades"));

        assertTrue(new DecisionEngine().makeBet(target));
    }
    
    @Test
    public void makeBetWithDoubleHandThreeCardReturnsTrue2() throws Exception {
        List<Card> target = Arrays.asList(new Card("6", "hearts"), new Card("3", "clubs"), new Card("6", "Spades"));

        assertTrue(new DecisionEngine().makeBet(target));
    }
    
    @Test
    public void makeBetWithoutDoubleHandThreeCardReturnsFalse() throws Exception {
        List<Card> target = Arrays.asList(new Card("9", "hearts"), new Card("3", "clubs"), new Card("6", "Spades"));
        
        assertFalse(new DecisionEngine().makeBet(target));
    }
    
    @Test
    public void makeBetWithTripleHandThreeCardReturnsTrue() throws Exception {
        List<Card> target = Arrays.asList(new Card("9", "hearts"), new Card("9", "clubs"), new Card("9", "Spades"));
        
        assertTrue(new DecisionEngine().makeBet(target));        
    }
}

