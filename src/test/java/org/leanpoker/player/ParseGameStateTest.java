package org.leanpoker.player;

import org.junit.Test;

import java.io.InputStreamReader;

/**
 *
 */
public class ParseGameStateTest {

    @Test
    public void readRound() throws Exception {
        // given

        // when
        // then
    }

    private InputStreamReader gameStateAsStream() {
        return new InputStreamReader(ParseGameStateTest.class.getResourceAsStream("/game_state.json"));
    }

}
