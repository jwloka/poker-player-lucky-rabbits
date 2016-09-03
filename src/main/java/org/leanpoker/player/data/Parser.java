package org.leanpoker.player.data;

import com.google.gson.Gson;
import org.leanpoker.player.model.GameState;

import java.io.Reader;

public class Parser {
    public GameState parse(Reader request) {
        return new Gson().fromJson(request, GameState.class);
    }
    public GameState parse(String request) {
        return new Gson().fromJson(request, GameState.class);
    }
}
