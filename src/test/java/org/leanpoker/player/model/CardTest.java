package org.leanpoker.player.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    @Test
    public void ctorWithValidParamsYieldsValues() throws Exception {
        Card testObj = new Card("6", "hearts");

        assertEquals("6", testObj.getRank());
        assertEquals("hearts", testObj.getSuit());
    }
}