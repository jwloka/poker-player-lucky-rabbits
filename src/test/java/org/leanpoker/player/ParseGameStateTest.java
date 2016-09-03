package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.Test;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

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
