package org.leanpoker.player.data;

import com.google.gson.JsonElement;
import org.leanpoker.player.model.GameState;

public class Parser {
    public GameState parse(JsonElement request) {
        return new GameState();
    }
}
