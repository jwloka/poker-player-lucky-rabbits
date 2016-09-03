package org.leanpoker.player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.leanpoker.player.model.Card;

public class DecisionEngine {
	
    public boolean makeBet(List<Card> cards) {
    
    	Map<String, Integer> rankMap = new HashMap<String, Integer>();
    	
    	
        String curRank = null;
        for (Card cur : cards) {
        	
        	curRank = cur.getRank();
        	
        	if (rankMap.containsKey(curRank)) {
        		return true;
        	} else {
        		rankMap.put(curRank, 1);
        	}
        	            
        }
        return false;
    }
}
