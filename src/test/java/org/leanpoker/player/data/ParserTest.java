package org.leanpoker.player.data;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.leanpoker.player.model.GameState;

import java.io.InputStreamReader;

public class ParserTest {

    @Test
    public void readRound() throws Exception {
        // given
        Parser cut = new Parser();
        // when
        GameState result = cut.parse(gameStateAsStream());
        // then
        assertThat(result, notNullValue());
        assertThat(result.getOurPokerBot(), notNullValue());
        assertThat(result.getOurPokerBot().getHole_cards(), notNullValue());
    }

    private InputStreamReader gameStateAsStream() {
        return new InputStreamReader(ParserTest.class.getResourceAsStream("/game_state.json"));
    }

}
